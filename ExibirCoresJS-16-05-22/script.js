function mudarCor(x){
    let cor = x;

    if ( cor == 'vrd'){
        document.getElementById("verde").style.visibility = 'visible';
        document.getElementById("vermelho").style.visibility = 'hidden';
        document.getElementById("azul").style.visibility = 'hidden';
        document.getElementById("amarelo").style.visibility = 'hidden';
    }
    else if ( cor == 'vrm'){
        document.getElementById("verde").style.visibility = 'hidden';
        document.getElementById("vermelho").style.visibility = 'visible';
        document.getElementById("azul").style.visibility = 'hidden';
        document.getElementById("amarelo").style.visibility = 'hidden';
    }
    else if( cor == 'azul'){
        document.getElementById("verde").style.visibility = 'hidden';
        document.getElementById("vermelho").style.visibility = 'hidden';
        document.getElementById("azul").style.visibility = 'visible';
        document.getElementById("amarelo").style.visibility = 'hidden';
    }
    else if (cor == 'ama'){
        document.getElementById("verde").style.visibility = 'hidden';
        document.getElementById("vermelho").style.visibility = 'hidden';
        document.getElementById("azul").style.visibility = 'hidden';
        document.getElementById("amarelo").style.visibility = 'visible';
    }

}
