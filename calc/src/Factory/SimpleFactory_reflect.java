package Factory;

import Operation.Operation;

public class SimpleFactory_reflect {
	private Operation oper = null;

	public Operation createOperation(String operate) {
		//利用反射原理获取实例
		try {
			oper = (Operation) Class.forName("Operation." + operate).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return oper;
	}

}
