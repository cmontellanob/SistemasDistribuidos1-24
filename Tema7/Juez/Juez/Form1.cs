namespace Juez
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            ServicioASFI.Cuenta[] lista ;
            
            ServicioASFI.ServicioASFISoapClient cliente = new ServicioASFI.ServicioASFISoapClient(new ServicioASFI.ServicioASFISoapClient.EndpointConfiguration());
   
            lista=cliente.ConsultaCuentas(tbCI.Text,tbNombres.Text,tbApellidos.Text);
        }
    }
}