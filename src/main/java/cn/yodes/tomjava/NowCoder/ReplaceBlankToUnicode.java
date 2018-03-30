package cn.yodes.tomjava.NowCoder;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class ReplaceBlankToUnicode {
	public String replaceSpace(StringBuffer str) {
		String[] array = str.toString().split("");
		String result = "";
		for (int i = 0; i <= array.length - 1; i++) {
			if (" ".equals(array[i])) {
				result += "%20";
			} else {
				result += array[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		System.out.println(new ReplaceBlankToUnicode().replaceSpace(new StringBuffer(sc.nextLine())));
	}
}
