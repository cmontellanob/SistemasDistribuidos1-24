using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsumirRest
{
    public class Participante
    {
        public int id{get;set;}
        public String ci { get; set; }
        public String nombres { get; set; }
        public String apellidos { get; set; }
        public String sexo { get; set; }
        public String fecha_nacimiento { get; set; }
        public String created_at { get; set; }
        public String updated_at { get; set; }
    }
}
