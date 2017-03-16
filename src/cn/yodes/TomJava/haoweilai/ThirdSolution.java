package cn.yodes.TomJava.haoweilai;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ThirdSolution {
	public class Node{
		Node left;
		Node right;
		boolean view = false;
		Object data;
	}
	
//	public void printSameRoute(Node root){
//		Map map = new HashMap<>();
//		DFS(root , map);
//		Map tem = map;
//		Iterator iter1 = map.entrySet().iterator();
//		Iterator iter2 = map.entrySet().iterator();
//		while (iter1.hasNext() && iter2.hasNext()) {
//			¡¡¡¡map.Entry entry1 = iter1.next();
//				map.Entry entry2 = iter1.next();
//				if(entry1.getKey() != entry2.getKey()
//						&& entry1.getValue() == entry2.getValue()){
//					System.out.println(entry1.getKey());
//					System.out.println(entry2.getKey());
//				}
//		}
//		
//	}
	
	public void DFS(Node root , Map map){
		int k = 0;
		StringBuffer route = null;
		if(root.view == true){
			root.view = true;
			k += Integer.parseInt(root.data.toString());
			route.append(root.data + ",");
			if(root.left==null && root.left==null)
				map.put(route, k);
			DFS(root.left , map);
			DFS(root.right , map);
		}
	}
}
