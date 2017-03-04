package cn.yodes.TomJava.Test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

/** 请完成下面这个函数，实现题目要求的功能 **/
 /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static boolean resolve(int[] A) {
        int sum_arr = 0;
        int []temp = {0,0,0,0};
        int j = 3;
        for(int i : A){
           sum_arr += i;
        }
        sum_arr = (sum_arr - 4) / 4;
        for(int i = 0 ; i < A.length ; i++){
        	if(temp[j] < sum_arr){
        		temp[j] += A[i];
        		System.out.println(A[i]);
        		if(temp[j] != temp[j - 1]) return false;
        	}else{
        		j--;
        		System.out.println();
        	}
        }
        if(j != 3){
        	return false;
        }else{
        	return true;
        }
        
    }

    public static void main(String[] args){
        ArrayList<Integer> inputs = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        while(line != null && !line.isEmpty()) {
            int value = Integer.parseInt(line.trim());
            if(value == 0) break;
            inputs.add(value);
            line = in.nextLine();
        }
        int[] A = new int[inputs.size()];
        for(int i=0; i<inputs.size(); i++) {
            A[i] = inputs.get(i).intValue();
        }
        Boolean res = resolve(A);

        System.out.println(String.valueOf(res));
    }
    
    /*
     * 
     * 
     * 
     * 
     */
    
    
}