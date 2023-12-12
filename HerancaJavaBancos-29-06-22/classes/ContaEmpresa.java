package classes;

public class ContaEmpresa extends Conta{

	private double limitEmp;
	
	
	public ContaEmpresa() {}


	public ContaEmpresa(int conta, String titular, double saldo, double limitEmp) {
		super(conta, titular, saldo);
		this.limitEmp = limitEmp;
	}


	public double getLimitEmp() {
		return limitEmp;
	}


	public void setLimitEmp(double limitEmp) {
		this.limitEmp = limitEmp;
	}
	
	public void empresta(double quantia) {
		if(quantia <= limitEmp) {}
		
	@Override
	public void saque(double quantia) {
		super.saque(quantia);
		saldo -= 2.0;
	}
}
