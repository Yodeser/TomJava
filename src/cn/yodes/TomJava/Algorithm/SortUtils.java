package cn.yodes.TomJava.Algorithm;

public class SortUtils {
	public int[] BubbleSort(int[] data){
		for(int i=0 ; i<data.length-1 ; i++){
			for(int j=0 ; j<data.length -i -1 ; j++){
				if(data[j] > data[j+1]){
					data[j+1] = data[j] - data[j+1];
					data[j]   = data[j] - data[j+1];
					data[j+1] = data[j] + data[j+1];
				}
			}
//			for(int p:data)
//				System.out.print(p+"\t");
//			System.out.println("\n");
		}
		
		return data;
		
	}
	
	public static void main(String[] args) {
		int[] testCase = new int[10];
		for(int i=0 ; i<testCase.length ; i++){
			testCase[i] = (int)((Math.random()*10)%100);
		}
		for(int i:testCase)
			System.out.print(i+"\t");
		System.out.println("\n\n");
		new SortUtils().BubbleSort(testCase);
		for(int i:testCase)
			System.out.print(i+"\t");
	}
}
/**5 2 4 8 5 2 1 6 2*/