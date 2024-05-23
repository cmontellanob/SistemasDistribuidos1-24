using Newtonsoft.Json;

namespace ConsumirRest
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private async void button1_Click(object sender, EventArgs e)
        {
            string url = "http://127.0.0.1:8000/api/v1/participante/1"; // Reemplaza con tu URL de servicio REST
            String resultado= await GetDataFromApiAsync(url);

            txtResult.Text = resultado;
            Participante participante=JsonConvert.DeserializeObject<Participante>(txtResult.Text);
            txtResult.Text = participante.nombres;

        }
        private async Task<string> GetDataFromApiAsync(string url)
        {
            using (HttpClient client = new HttpClient())
            {
                try
                {
                    HttpResponseMessage response = await client.GetAsync(url);
                    response.EnsureSuccessStatusCode();
                    string responseBody = await response.Content.ReadAsStringAsync();
                    return responseBody;
                }
                catch (HttpRequestException ex)
                {
                    return $"Error: {ex.Message}";
                }
            }
        }
    }
}