
let button = document.querySelector("button");
button.onclick = function() {
    entrada = document.getElementById("cnpj").value;
    alert(entrada);

    let cnpj = entrada.split( " " )
    console.log(cnpj)
}