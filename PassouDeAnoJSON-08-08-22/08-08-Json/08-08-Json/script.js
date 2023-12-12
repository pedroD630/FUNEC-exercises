const disciplinas = {
    "nomeDisciplina": "Geografia",
    "professor": "Leandro",
    "tarefas": {
        "t1" : 30.0,
        "t2" : 35.0,
        "t3" : 35.0
    },
}

console.log("notas: " + disciplinas.tarefas.t1 + disciplinas.tarefas.t2 + disciplinas.tarefas.t3)
let notaFinal = disciplinas.tarefas.t1 + disciplinas.tarefas.t2 + disciplinas.tarefas.t3


if ( notaFinal < 60 ){
    let passou = false
    document.getElementById("my-txt").innerHTML = passou;
}
else {
    let passou = true
    document.getElementById("my-txt").innerHTML = passou;
}