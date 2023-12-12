import java.util.Scanner;

public class TestaCompra {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero de posicoes");
		int n = sc.nextInt();
		Produto[] prodV = new Produto[n];
		for(int i=0; i<prodV.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			prodV[i] = new Produto(name,price);
		}
		double sum = 0.0;
		for (int i=0; i<prodV.length; i++) {
			String nomeProd = prodV[i].getName();
			double vrProd = prodV[i].getPrice();
			System.out.println(nomeProd +" - "+ vrProd);
			sum += prodV[i].getPrice();
		}
		double avg = sum / prodV.length;
		System.out.printf("media da compra: %.2f%n", sum);
		double tot = sum;
		System.out.printf("Total da compra: %.2f%n", sum);
	}
}
