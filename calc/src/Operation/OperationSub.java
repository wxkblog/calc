package Operation;

public class OperationSub extends Operation{
	@Override
	public double getResult() {
		double result = getNumberA() - getNumberB();
		return result;
	}
}
