
public class AddNumbers {

	private double number1;
	private double number2;
	public AddNumbers(double numb1, double numb2) {
			
		number1=numb1;
		number2=numb2;
	}
		
	public double add () {
		return number1+number2;
	}
	public double sub () {
		return number1-number2;
	}
	public double multi () {
		return number1*number2;
	}
	public double div () {
		return number1/number2;
	}

}
