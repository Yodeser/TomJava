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
		}
		return data;
		
	}
	
	public int[] SelectionSort(int[] data){
		for(int i=0 ; i<data.length-1 ; i++){
			for(int j=i+1 ; j<data.length ; j++)
				if(data[i] > data[j]){
					data[j] = data[i] - data[j];
					data[i] = data[i] - data[j];
					data[j] = data[i] + data[j];
				}
		}
		return data;
	}
	
	
	public int partition(int []array,int lo,int hi){
        //�̶����зַ�ʽ
        int key=array[lo];
        while(lo<hi){
            while(array[hi]>=key&&hi>lo){//�Ӻ�벿����ǰɨ��
                hi--;
            }
            array[lo]=array[hi];
            while(array[lo]<=key&&hi>lo){//��ǰ�벿�����ɨ��
                lo++;
            }
            array[hi]=array[lo];
        }
        array[hi]=key;
        return hi;
    }
    
    public void QuickSort(int[] array,int lo ,int hi){
        if(lo>=hi){
            return ;
        }
        int index=partition(array,lo,hi);
        QuickSort(array,lo,index-1);
        QuickSort(array,index+1,hi); 
    }
	
	public static void main(String[] args) {
		int[] testCase = new int[10];
		for(int i=0 ; i<testCase.length ; i++){
			testCase[i] = (int)((Math.random()*100)%100);
		}
		for(int i:testCase)
			System.out.print(i+"\t");
		System.out.println("\n\n");
		new SortUtils().QuickSort(testCase , 0 , testCase.length - 1);
		for(int i:testCase)
			System.out.print(i+"\t");
	}
}


/**
 * 26	70	26	21	8	95	36	4	12	38	
 * 
 * 
 */


