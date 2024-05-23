function cargarParticipante()
{
    var idparticipante=document.getElementById('idparticipante').value;
    var contenido=document.getElementById('contenido');

    fetch('http://127.0.0.1:8000/api/v1/participante/'+idparticipante)
    .then(response => response.text())
    .then(
        data =>{  participante = JSON.parse( data)
            console.log(participante);
            contenido.innerHTML = participante;
        });
}