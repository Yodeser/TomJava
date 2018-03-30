package cn.yodes.tomjava.NowCoder;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class TakeUpperToLast {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		char[] input  = in.nextLine().toCharArray();
		for(int i = input.length - 1; i >= 0; i--){
			if(input[i] < 'a'){
//				System.out.println(input[i]);
				for(int j = i; (j < input.length - 1) && (input[j+1] >= 'a'); j++){
					input[j]   = (char)(input[j+1] ^ input[j]);
					input[j+1] = (char)(input[j+1] ^ input[j]);
					input[j]   = (char)(input[j+1] ^ input[j]);
				}
			}
		}
		for(char i:input){
			System.out.print(i);
		}
	}
}
