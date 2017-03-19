package cn.yodes.TomJava.haoweilai;

public class FirstSolution {
	int flag = 0;
	public class LinkNode{
		public Object data;
		public LinkNode head;
		public LinkNode next;
		
		public int getLenth(){
			int length = 0;
			while(head.next != null){
				length++;
				head = head.next;
			}
			return length;
		}
	}
	
	public Object printLast_NoK(LinkNode linknode , int k){
		if(flag++ != linknode.getLenth() - k){
			printLast_NoK(linknode.next , k);
		}else{
			return linknode.data;
		}
		return 0;
	}
}
