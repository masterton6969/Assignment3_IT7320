package Assignment3.Assignment3;

public class CalcImplement {

	CalcInterface calcObj;
	
	public int addTwoNums(int a, int b) {
		return calcObj.add(a, b);
	}
	
	public int subtractTwoNums(int a, int b) {
		return calcObj.subtract(a, b);
	}
	
	public int multiplyTwoNums(int a, int b) {
		return calcObj.multiply(a, b);
	}
	
	public double divideTwoNums(double a, double b) {
		return calcObj.divide(a, b);
	}

	public void setIntObj(CalcInterface mockObj) {
		this.calcObj = mockObj;
	}
}
