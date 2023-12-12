import java.util.Scanner;

public class Frutas{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] frutas = new String[10];
        for ( int j = 0; j < 11; j++){
            System.out.println("Digite 10 frutas: ");
            frutas[j] = sc.nextLine();
        }
        for ( String i : frutas){
            System.out.println(i);
        }    
    }
}
