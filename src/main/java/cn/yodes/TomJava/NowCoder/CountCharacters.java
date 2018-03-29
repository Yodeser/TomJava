package cn.yodes.TomJava.NowCoder;

import java.util.Scanner;
import java.io.BufferedInputStream;

public class CountCharacters {

	//递归调用，时间复杂度O(n).
	public static void Count(char[] data , int start){
		int count = 1;
		for(int i = start; i < data.length - 1; i++){
			if(data[i] != data[i+1]){
				System.out.print(data[i]);
				System.out.print(count);
				Count(data , i + 1);
				return;
			}else{
				count++;
			}
			if(i == data.length - 2){
				if(data[i] == data[i + 1]){
					System.out.print(data[i]);
					System.out.print(count);
				}
			}
		}
	}
	
	//遍历数组，时间复杂度O(n).
	public static void Count(char[] data){
		int count = 1;
		for(int i = 1; i < data.length; i++){
			if(data[i] != data[i - 1]){
				System.out.print(data[i - 1]);
				System.out.print(count);
				count = 1;
			}else{
				count++;
			}
			if(i == data.length - 1){
				System.out.print(data[i - 1]);
				System.out.print(count);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
//		Count(sc.nextLine().toCharArray() , 0);
		Count(sc.nextLine().toCharArray());
	}
}
