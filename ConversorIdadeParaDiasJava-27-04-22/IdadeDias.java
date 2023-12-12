import java.util.Scanner;

public class IdadeDias {


    public static int transformarIdade(int idade, int idadeDias, int ano, int dias, int meses, int mes){

        Scanner sc = new Scanner(System.in);

        while(ano < idade){
            idadeDias = idadeDias + 365;
            ano++;
        }
        while(mes < meses){
            idadeDias = idadeDias + 30;
            mes++;
        }
        idadeDias = idadeDias + dias;
        return idadeDias;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int ano = 0;
        int idade;
        int idadeDias = 0;
        int meses;
        int dias;
        int mes = 0;
        

       System.out.println("Quantos anos voce tem?");
       idade = sc.nextInt();
       System.out.println("Quantos meses? Ex. 1 ano e 2 meses");
       meses = sc.nextInt();
       System.out.println("Quantos dias? Ex. 1 ano, 2 meses e 15 dias");
       dias = sc.nextInt();

       idadeDias = transformarIdade(idade, idadeDias, ano, dias, meses, mes);
       System.out.print(idadeDias);
    }
}