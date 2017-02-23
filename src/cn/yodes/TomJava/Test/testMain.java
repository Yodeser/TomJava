package cn.yodes.TomJava.Test;

public class testMain {
	public static void main(String[] args) {
		int a='a',b='b';
		b = a - b;
		a = a - b;
		b = a + b;
		System.out.println(a+"\t"+b);
	}
}
