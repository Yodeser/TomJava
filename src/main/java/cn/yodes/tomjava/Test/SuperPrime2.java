package cn.yodes.tomjava.Test;

import java.util.Scanner;

public class SuperPrime2 {
	public static void main(String[] args){
		int data;
		Scanner sc = new Scanner(System.in);
		data = sc.nextInt();
		
		int[] primes = new int[data/2];
		boolean flag;
		int k = 0;
		for(int i = 2; i < data; i++){
			flag = true;
			for(int j = 2; j <= (int)Math.sqrt(i); j++){
				if( (i % j) == 0){	flag = false; 	break;	}
			}
			if(flag)	primes[k++] = i;
		}
		
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
}
