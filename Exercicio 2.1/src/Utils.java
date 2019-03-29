
public class Utils {
	private static final int VALOR_1=5;
	private static final int VALOR_2=32;
	private static final int VALOR_3=9;

	public static double toCelsius(double temp) throws FahrenheitException {
		if(temp< -459.67)
			throw new FahrenheitException("O valor a ser convertido está abaixo do zero absoluto");
		double c=VALOR_1*(temp-VALOR_2)/VALOR_3;
		return c;
		
		
	}

}
