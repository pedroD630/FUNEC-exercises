package classes;

public abstract class Conta {
	private int conta;
	private String titular;
	protected double saldo;
	
	public Conta() {}

	public Conta(int conta, String titular, double saldo) {
		this.conta = conta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void saque(double quantia) {
		saldo -= quantia + 5.0;
	}
	
	public void deposito(double quantia) {
		saldo += quantia;
	}
	
	public String toString() {
		return "Conta [conta=" + conta + ", \ntitular" + titular + "\n Saldo: " + saldo + "]";
	}
}
