
public class ExercicioApp {

	public static void main(String[] args) {
		ContaCorrente c = new ContaCorrente(100,100,0);
		try {
			c.depositar(-500);
			c.depositar(0);
			c.setValorLimite(-500);
			c.setValorLimite(0);
			c.setLimite(100);
			c.depositar(10);
			c.sacar(1000);
		} catch (IllegalArgumentException e) {
			
			System.out.println(e.getMessage());
		} catch (SaldoInsuficienteExcecao e) {
			
			System.out.println(e.getMessage());
		}
		
	}

}
