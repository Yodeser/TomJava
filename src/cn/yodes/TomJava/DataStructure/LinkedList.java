package cn.yodes.TomJava.DataStructure;

/**
 * The LinkList moudle of my private data structure.
 * @author Yodes
 * @version 0.1
 * @Time 20170221
 */
public class LinkedList{
	private Node root;
	private Node current;
	private int size = 0;
	
	public class Node {
		public Node next;
		public Object data;
	
		public void addNode(Node newNode){
			if(this.next == null){ 			//递归的出口
				this.next = newNode;
			}else{
				this.next.addNode(newNode);	//继续判断是否是尾节点
			}
		}
		public Node(Object data){
			this.data = data;
		}
		
		public boolean containNode(Object data){
			while(this != null){
				if(data.equals(this.data)){
					return true;
				}else{
					return this.next.containNode(data);
				}
			}
			return false;
		}
		
		public void removeNode(Object data){
			if(this.next != null){
				if(data.equals(this.next.data)){
					this.next = this.next.next;
				}else{
					this.next.removeNode(data);
				}
			}
		}
	}
	
	/**
	 * print all the elements of the linkNode it blong to.
	 */
	public void printAll(){
		current = root;
		while(current != null){
			System.out.print(current.data + "\t");
			current = current.next;
		}
		System.out.println("\n");
	}
	
	/**
	 * add a new element into the linknode.
	 * @param data	the data of the new node.
	 * @return	add success or not.
	 */
	public boolean add(Object data){
		Node newNode = new Node(data);
		if(root == null){
			root = newNode;
		}else{
			root.addNode(newNode);
		}
		size++;
		return true;
	}
	
	public boolean addAll(Object data[]){
		for(Object temp : data){
			if(!add(temp))
				return false;
		}
		return true;
	}
	
	public boolean isEmpty(){
		if(root == null || size == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean contains(Object data){
		current = root;
		while(current != null){
			if(current.data == data)	return true;
			current = current.next;
		}
		return false;
	}
	
	public boolean containNode(Object data){
		return this.root.containNode(data);
	}
	
	public boolean remove(Object data){
		if(!this.contains(data))	return false;
		if(root != null){
			if(data.equals(root.data)){
				root = root.next;
				return true;
			}else{
				root.next.removeNode(data);
			}
		}
		size--;
		return true;
	}
	
	/**
	 * try to sort the linklist.
	 * @Time 20150222
	 * @return the root node of the linklist.
	 */
	public Node sort(){
//		current = root;
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size -i; i++){
				if((int)root.data > (int)root.next.data){
					root.next.data = (int)root.data - (int)root.next.data;
					root.data	  = (int)root.data - (int)root.next.data;
					root.next.data = (int)root.data + (int)root.next.data;
				}
			}
		}
		return root;
	}
//	public Object insert(Node head , Node current , Object data){
//		Node newNode = new Node(data);
//		current.next = newNode.next;
//		current.next = newNode;
//		return data.toString();
//	}
//	
//	public boolean delete(Node head , Node target){
//		if(target.next == null);
//		return true;
//	} 
	
	public static void main(String []args){
		LinkedList list = new LinkedList();
		for(int i=0 ; i<10 ; i++){
			list.add((int)((Math.random()*100)%100));	/* generate random number */
		}
//		String[] data = new String[]{"Hello","World","!"};
//		list.addAll(data);
		list.printAll();
		list.sort();
		list.printAll();
		System.out.println(list.size);
	}
}