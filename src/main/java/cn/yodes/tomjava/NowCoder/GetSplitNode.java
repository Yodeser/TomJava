package cn.yodes.tomjava.NowCoder;

public class GetSplitNode {
    /**
     * ����git�������������ָ��
     * 
     * @param matrix ���ھ��󣬱�ʾgit����matrix[i][j] == '1' ���ҽ���git���е�i���͵�j���ڵ������ӣ��ڵ�0Ϊgit���ĸ��ڵ�
     * @param indexA �ڵ�A��index
     * @param indexB �ڵ�B��index
     * @return ����
     */
    public int getSplitNode(String[] matrix, int indexA, int indexB) {
    	String[][] arr_Node = parseStringArrToMultiArray(matrix);
		return 1;
	}
    
    public String[][] parseStringArrToMultiArray(String[] matrix){
    	String[][] result = new String[matrix.length][matrix[0].length()];
    	for(int i = 0; i < matrix.length; i++){
    		result[i] = matrix[i].split("");
    	}
    	return result;
    }

}