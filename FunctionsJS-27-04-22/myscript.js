function calcularResultado(form){
    form.resultados.value = eval(form.entrada.value);
}

function descobrirExpressao(form){
    form.entrada.blur();
    form.entrada.value = prompt("Insira uma Expressao matematica: EX. 2+2", " ");
    calcularResultado(form);

}

function limparForm(){
    let entradaValor = document.getElementById("entrada").value;
    let resultadoValor = document.getElementById("resultados").value;

    //Transformar os campos em vazios

    entradaValor = "";
    resultadoValor = "";

}
