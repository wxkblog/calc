package Calc;

import java.util.Scanner;

import Factory.SimpleFactory_reflect;
import Operation.Operation;

public class SimpleReflectCalc {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("请输入循环次数：");
		count = sc.nextInt();
		double numberA = 0, numberB = 0;
		String operation;
		while (count!=0) {
			count--;
			System.out.print("请输入参数A：");
			numberA = sc.nextDouble();
			System.out.print("请输入运算符：");
			operation =sc.next();
			System.out.print("请输入参数B：");
			numberB = sc.nextDouble();
			Operation oper = null;
			SimpleFactory_reflect factory_reflect = new SimpleFactory_reflect();
			oper = factory_reflect.createOperation(operation);
			oper.setNumberA(numberA);
			oper.setNumberB(numberB);
			double result = oper.getResult();
			System.out.println(result);
		}
		sc.close();
	}
}
