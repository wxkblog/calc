package Factory;

import Operation.Operation;
import Operation.OperationAdd;
import Operation.OperationDiv;
import Operation.OperationMul;
import Operation.OperationSqrt;
import Operation.OperationSub;

public class SimpleFactory {
	public static Operation createOperation(String operate) {
		Operation oper = null;
		switch (operate) {
			case "+":
				oper = new OperationAdd();
				break;
			case "-":
				oper = new OperationSub();
				break;
			case "*":
				oper = new OperationMul();
				break;
			case "/":
				oper = new OperationDiv();
				break;
			case "sqrt":
				oper = new OperationSqrt();
			default:
				break;
		}
		return oper;
	}
}
