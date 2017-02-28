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
        //固定的切分方式
        int key=array[lo];
        while(lo<hi){
            while(array[hi]>=key&&hi>lo){//从后半部分向前扫描
                hi--;
            }
            array[lo]=array[hi];
            while(array[lo]<=key&&hi>lo){//从前半部分向后扫描
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
	
    public void MergeArray(int []array , int left , int mid , int right , int []temp){
    	int i = left , j = mid + 1;
    	int m = mid  , r = right;
    	int k = 0;
    	
    	while(i <= m && j <= r){
    		if(array[i] <= array[j]){
    			temp[k++] = array[i++];
    		}else{
    			temp[k++] = array[j++];
    		}
    	}
    	
    		while(i < m)
    			temp[k++] = array[i++];
    		
    		while(j < r)
    			temp[k++] = array[j++];
    		
    		
    		for(i = 0 ; i < k ; i++) {
    			array[left + i] = temp[i];
    		}
    }
    
    public void DivideMerge(int []data , int left , int right , int []temp){
    	
    	
    	if(left < right){
    		int mid = (left + right)/2;
    		DivideMerge(data , left  , mid , temp);
    		DivideMerge(data , mid+1 , right , temp);
    		MergeArray(data , left , mid , right , temp);
    	}
    }
    
    public void MergeSort(int []data){
    	int []temp = new int[data.length];
    	DivideMerge(data , 0 , data.length - 1 , temp);
    }
    
	public static void main(String[] args) {
		int[] testCase = new int[10];
		for(int i=0 ; i<testCase.length ; i++){
			testCase[i] = (int)((Math.random()*100)%100);
		}
		for(int i:testCase)
			System.out.print(i+"\t");
		System.out.println("\n\n");
		new SortUtils().MergeSort(testCase);
		for(int i:testCase)
			System.out.print(i+"\t");
	}
}


/**
 * 26	70	26	21	8	95	36	4	12	38	
 * 
 * 
 */


