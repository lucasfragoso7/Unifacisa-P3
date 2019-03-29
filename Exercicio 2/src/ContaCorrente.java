
public class ContaCorrente {

	private double limite;
	private double saldo;
	private double valorLimite;

	public ContaCorrente(double limite, double saldo, double valorLimite) {
		super();
		this.limite = limite;
		this.saldo = saldo;
		this.valorLimite = valorLimite;
	}

	public void sacar(double valor) throws IllegalArgumentException,SaldoInsuficienteExcecao {
		if (valor>saldo)
			throw new SaldoInsuficienteExcecao("O valor que voc� deseja sacar � maior que seu saldo", getSaldo());
		if (valor < 0)
			throw new IllegalArgumentException("valor que voc� deseja sacar est� abaixo de 0");
		if (valor == 0)
			throw new IllegalArgumentException("valor que voc� deseja sacar � igual a 0");
		if (valor > this.limite)
			throw new IllegalArgumentException("O valor est� acima do limite da sua conta");

		this.saldo = -valor;
	}

	public void depositar(double valor) throws IllegalArgumentException {
		if (valor < 0)
			throw new IllegalArgumentException("valor que voc� deseja depositar est� abaixo de 0");
		if (valor == 0)
			throw new IllegalArgumentException("valor que voc� deseja depositar � igual a 0");
		this.saldo=+valor;

	}

	public void setValorLimite(double valor) throws IllegalArgumentException {

		if (valor < 0)
			throw new IllegalArgumentException("valor que voc� deseja colocar como limite est� abaixo de 0");
		if (valor == 0)
			throw new IllegalArgumentException("valor que voc� deseja colocar como limite � igual a 0");
		this.valorLimite=valor;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getValorLimite() {
		return valorLimite;
	}
	
	
	

}
