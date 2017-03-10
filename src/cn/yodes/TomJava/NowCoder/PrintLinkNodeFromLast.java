package cn.yodes.TomJava.NowCoder;

import java.util.ArrayList;

/**
 * 题目描述
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * @author Yodes
 *
 */
public class PrintLinkNodeFromLast {
	public static class ListNode {
       int val;
       ListNode next = null;

       ListNode(int val) {
          this.val = val;
       }
	}
	
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> temp   = new ArrayList<>();
		ArrayList<Integer> output = new ArrayList<>();
		while(listNode.next != null){
			temp.add(listNode.val);
			listNode = listNode.next;
		}
		for(int i = temp.size() - 1; i >= 0; i--){
			output.add(temp.get(i));
		}
		return output;
	}
	
	public static void main(String[] args) {
		ListNode list = new ListNode(5);
		ListNode list_t = list;
		int i = 20;
		while(i-- > 0){
			list.next = new ListNode((int)Math.random()*100);
			System.out.print(list.next.val+"\t");
			list = list.next;
		}
		System.out.println(new PrintLinkNodeFromLast().printListFromTailToHead(list_t));
	}
}
