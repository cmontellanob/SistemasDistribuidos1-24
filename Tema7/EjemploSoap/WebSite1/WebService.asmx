<%@ WebService Language="C#" Class="WebService" %>

using System;
using System.Web;
using System.Web.Services;
using System.Web.Services.Protocols;


[WebService(Namespace = "http://tempuri.org/")]
[WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
// Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
// [System.Web.Script.Services.ScriptService]
public class WebService  : System.Web.Services.WebService {

    [WebMethod]
    public int Sumar(int a,int b) {
        return a+b;
    }

    [WebMethod]
    public int Restar(int a,int b) {
        return a-b;
    }
    [WebMethod]
    public int Multiplicar(int a,int b) {
        return a*b;
    }
    [WebMethod]
    public int Dividir(int a,int b) {
        return a/b;
    }
    [WebMethod]
    public Persona ObenerPersona(String ci)
    {
        String cadena1 = "aasda";
            String cadena2 = "aasda"+cadena1;

        Persona aux = new Persona("Juan Pedro");

        return aux;

    }


}