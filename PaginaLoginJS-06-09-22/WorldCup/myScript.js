function entrar(){
    var login, senha;

    login = document.getElementById("login").value;
    senha = document.getElementById("senha").value;

    if (login == "guilherme" && senha == "fut"){
        alert("voce logou como Guilherme");
        location.assign("guilherme/index.html");
    }
    else if(login == "pedro" && senha == "volei"){
        alert("voce logou como Pedro");
        location.assign("pedro/index.html");
    }
    else if(login == "bernardo" && senha == "baska"){
        alert("voce logou como Bernardo");
        location.assign("bernardo/index.html");
    }
    else if(login == "lucas" && senha == "olhaaonda"){
        alert("voce logou como Lucas");
        location.assign("lucas/index.html");
    }
    else{
        alert("Login ou senha invalidos");
    }
}