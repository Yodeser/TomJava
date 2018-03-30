package cn.yodes.tomjava.Test;

import java.util.Scanner;

public class SuperPrime {
	public static void start(long data){
		long[] primes = findPrime(data);
		boolean flag;
		for(int i =0 ; (primes[i] != 0); i++){
			for(int j = 2; ( Math.pow(primes[i], j) <= data ); j++){
				if(Math.pow(primes[i], j) == data){
					System.out.println(primes[i] + " "+j);
					return ;
				}
			}
		}
		System.out.println("No");
		return ;
	}
	
	public static long[] findPrime(long maxData){
		long[] result = new long[(int) (maxData/2)];
		boolean flag;
		int k = 0;
		for(long i = 2; i < maxData; i++){
			flag = true;
			for(long j = 2; j <= (int)Math.sqrt(i); j++){
				if( (i % j) == 0){	flag = false; 	break;	}
			}
			if(flag)	result[k++] = i;
		}
		return result;
	}
	public static void main(String[] args){
		long testNumber;
		Scanner sc = new Scanner(System.in);
		testNumber = sc.nextInt();
		start(testNumber);
	}
}
