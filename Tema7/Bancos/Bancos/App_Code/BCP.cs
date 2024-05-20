using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

/// <summary>
/// Descripción breve de BCP
/// </summary>
[WebService(Namespace = "http://tempuri.org/")]
[WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
// Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
// [System.Web.Script.Services.ScriptService]
public class BCP : System.Web.Services.WebService
{

    public BCP()
    {

        //Elimine la marca de comentario de la línea siguiente si utiliza los componentes diseñados 
        //InitializeComponent(); 
    }

    [WebMethod]
    public List<Cuenta> Buscar(String Ci, String Nombre, String Apellidos)
    {
        List<Cuenta> buscar = null;
        return buscar;
    }
    [WebMethod]
    public Boolean Congelar(Cuenta cuenta, Double monto)
    {
        return false;
    }
}
