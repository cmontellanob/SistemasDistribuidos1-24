namespace ConsumirServicio
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int a = int.Parse(txtA.Text);
            int b = int.Parse(txtB.Text);
            Operaciones.WebServiceSoapClient cliente = new Operaciones.WebServiceSoapClient(new Operaciones.WebServiceSoapClient.EndpointConfiguration());
            int c=0;
            switch (cbOperacion.SelectedIndex)
            {
                case 0: c = cliente.Sumar(a,b); 
                    break;
                case 1: c = cliente.Restar(a, b); 
                    break;
                case 2:
                    c = cliente.Multiplicar(a, b);
                    break;
                case 3:
                    c = cliente.Dividir(a, b);
                    break;


            }
            LbResultado.Text=c.ToString();




        }
    }
}