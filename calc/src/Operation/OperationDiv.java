package Operation;

public class OperationDiv extends Operation {
	@Override
	public double getResult() {
		double result = 0;
		try {
			result = getNumberA() / getNumberB();
		} catch (Exception e) {
			System.out.println("除数不能为0");
			e.printStackTrace();
		}
		return result;
	}
}
