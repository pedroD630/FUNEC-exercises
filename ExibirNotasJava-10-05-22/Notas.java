import java.util.Scanner;

public class Notas {

	public static double receberNotas(double notas[], int nnotas){
		for (i = 0; i<notas.length; i++) {
			
			System.out.printf("Digite a nota %d ", i);
	    	notas[i] = sc.nextDouble();
	    }
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nomeAluno;
		int nnotas, i = 0, j = 0;
		
	    System.out.print("Quantas notas serao registradas? ");
	    nnotas = sc.nextInt();
	    
		double[] notas = new double[nnotas];
		
		
	    System.out.print("Qual o nome do aluno? ");
	    nomeAluno = sc.nextLine();
	    
	    sc.nextLine();
	    
	    receberNotas(notas[nnotas])
	    
	    System.out.println(nomeAluno);
	    
	    for (j = 0; j<notas.length; j++) {
	    	
	    	int pos = 1;
	    	System.out.println("Nota " + pos + notas[j]);
	    	pos ++;
	    }
	}
}
