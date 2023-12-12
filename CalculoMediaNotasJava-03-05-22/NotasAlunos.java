
import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] vetorA = new double[n];
        for (int i=0; i<n; i++){
            vetorA[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for (int i=0; i<n; i++){
            sum += vetorA[i];
        }
        double avg = sum / n;
        System.out.printf("Media das notas: %f%n", avg);
    }
}
