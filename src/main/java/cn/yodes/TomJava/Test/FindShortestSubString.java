package cn.yodes.TomJava.Test;

import java.util.Scanner;

public class FindShortestSubString {
	public static void start(long number , int length){
		boolean flag = false;
		int k;
		for(int i = length; !flag && i < Math.sqrt(2*number+2) -1; i++){
			for(int j = 1; j <= number; j++){
				if((i*(2*j + i -1)/2) == number){
					flag = true;
					for(k = j; k < i+j-1; k++)
						System.out.print(k+" ");
					System.out.print(k+"");
					break;
				}
			}
		}
		if(!flag){
			System.out.print("No");
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int  l = sc.nextInt();
		start(n , l);
	}
}
