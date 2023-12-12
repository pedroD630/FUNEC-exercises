function confereLetra(){
    let letra = document.getElementById("letras").value;
    let letraChar = letra.charCodeAt(0);


    if( letraChar == 97 || letraChar == 101 || letraChar == 105 || letraChar == 111 || letraChar == 117){
        document.getElementById("resultado").innerHTML =  "O elemento digitado: " + letra + " e uma VOGAL";
    }
    else if (letraChar >= 48 &&  letraChar <= 57){
        document.getElementById("resultado").innerHTML =  "O elemento digitado: " + letra + " e um NUMERO";
    }
    else{
        document.getElementById("resultado").innerHTML =  "O elemento digitado: " + letra + " e uma CONSOANTE";
    }
}