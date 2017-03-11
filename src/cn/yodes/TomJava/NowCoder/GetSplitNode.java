package cn.yodes.TomJava.NowCoder;

public class GetSplitNode {
    /**
     * 返回git树上两点的最近分割点
     * 
     * @param matrix 接邻矩阵，表示git树，matrix[i][j] == '1' 当且仅当git树中第i个和第j个节点有连接，节点0为git树的跟节点
     * @param indexA 节点A的index
     * @param indexB 节点B的index
     * @return 整型
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