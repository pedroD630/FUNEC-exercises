import  java.util.Scanner;

public class PlanoTelefonia{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int valorPlano, minutosConsumidos, planoCliente;

        System.out.println("Qual o seu plano? 1- Basico = 100 minutos");
        planoCliente = sc.nextInt();

        if ( planoCliente == 1 ){
            valorPlano = 50;
            planoCliente = 100;
            
            System.out.println("Quantos minutos foram usados? ");
            minutosConsumidos = sc.nextInt();
            
            if (minutosConsumidos > planoCliente){
            int min = minutosConsumidos - planoCliente;
            
            
                for ( int i = 0; i < min; valorPlano = valorPlano +2;  ){
                System.out.printf("Voce deve pagar %d", valorPlano);
                }
            }
        }
        else{
            System.out.println("Esse plano nao existe!");
        }





    }
}
