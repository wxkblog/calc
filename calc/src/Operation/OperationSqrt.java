package Operation;

public class OperationSqrt extends Operation{
	@Override
	public double getResult(){
		double result = 0;
		result = Math.sqrt(getNumberA());
		return result;
	}
}
