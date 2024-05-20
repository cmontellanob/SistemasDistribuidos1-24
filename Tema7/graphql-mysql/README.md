# instalar dependencia
mkdir graphql-mysql
cd graphql-mysql
npm init -y
npm install express graphql express-graphql mysql2 sequelize
node server.js 
#consultas 

{
  participantes {
    ci
    nombres
    apellidos
    sexo
    fecha_nacimiento
  }
}

{
  participante(ci: "12345678") {
    ci
    nombres
    apellidos
    sexo
    fecha_nacimiento
  }
}

#crear 
mutation {
  addParticipante(
    ci: "87654321",
    nombres: "Juan",
    apellidos: "Perez",
    sexo: "M",
    fecha_nacimiento: "1985-05-15"
  ) {
    ci
    nombres
    apellidos
    sexo
    fecha_nacimiento
  }
}