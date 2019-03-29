
public class SaldoInsuficienteExcecao extends Exception{
	private double saldo;
	public SaldoInsuficienteExcecao(String message, double saldo) {
		super(message);
		this.saldo=saldo;
	}
	public double getSaldo() {
		return saldo;
	}

}
