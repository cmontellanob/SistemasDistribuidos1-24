const { Sequelize } = require('sequelize');

const sequelize = new Sequelize('bd_ccbol_api', 'root', '', {
  host: 'localhost',
  dialect: 'mysql'
});

const Participante = sequelize.define('Participante', {
  ci: {
    type: Sequelize.STRING,
    allowNull: false,
    primaryKey: true
  },
  nombres: {
    type: Sequelize.STRING,
    allowNull: false
  },
  apellidos: {
    type: Sequelize.STRING,
    allowNull: false
  },
  sexo: {
    type: Sequelize.STRING,
    allowNull: false
  },
  fecha_nacimiento: {
    type: Sequelize.DATE,
    allowNull: false
  }
}, {
  tableName: 'participantes',
  timestamps: false
});

sequelize.sync();

module.exports = { sequelize, Participante };
