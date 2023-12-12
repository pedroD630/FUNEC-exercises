//incompleto 
//criar outra classe
//importar a outra classe pra classe principal
//fazer isso funcionar de alguma forma

package mercado;

import java.util.Scanner;

public class Produtos {

	public String nomeProd;
	public int estoque;
	public double precoUnidade;
	public double vlrTotalEstoque;
	
	public double calcularValorEstoque(int estoque, double precoUnidade) {
		
		vlrTotalEstoque = estoque * precoUnidade;
		
		return vlrTotalEstoque;
		
	}
	public Produtos(String nomeProd, int estoque, double precoUnidade, double vlrTotalEstoque) {
		
		this.nomeProd = nomeProd;
		this.estoque = estoque;
		this.precoUnidade = precoUnidade;
		
		vlrTotalEstoque = calcularValorEstoque( estoque, precoUnidade);
	}
		
	public void main(final String[] args) {

		
		Scanner sc = new Scanner ( System.in );
		
		
		System.out.print("Digite o nome do produto");
		nomeProd = sc.nextLine();
		
		System.out.println("Qual a quantidade em estoque? ");
		estoque = sc.nextInt();
		
		System.out.println("Qual o valor por unidade? ");
		precoUnidade = sc.nextDouble();
		
		Produtos prod1 = new Produtos(nomeProd, estoque, precoUnidade, vlrTotalEstoque);
		}
}
