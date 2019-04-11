package com.algorithms;

//https://java2blog.com/doubly-linked-list-java/

public class DoubleLinkedListApp {

	public static void main(String[] args) {
		
		DoubleLinkedList dll = new DoubleLinkedList();
		
		dll.addAtLast(10);
		dll.addAtLast(20);
		dll.addAtLast(30);
		dll.addAtLast(40);
		dll.addAtLast(50);
		
		dll.addFirst(60);
		dll.addFirst(70);
		dll.addFirst(80);
		dll.addFirst(90);
		dll.addFirst(100);
		
		dll.printForward();
		dll.printBackward();
		

	}

}

class NodeDl{
	
	int data;
	NodeDl nNode;
	NodeDl pNode;
	
	NodeDl(int data){
		this.data = data;
	}
}

class DoubleLinkedList{
	
	NodeDl headNode;
	NodeDl tailNode;
	
	public void addFirst(int data) {
		NodeDl nodeDl = new NodeDl(data);
		
		nodeDl.data = data;
		nodeDl.nNode = headNode;
		nodeDl.pNode=null;
		if(headNode !=null)
			headNode.pNode=nodeDl;
		headNode = nodeDl;
		if(tailNode ==null)
			tailNode =nodeDl;
	}
	
	public void addAtLast(int data) {
		
		NodeDl nodeDl = new NodeDl(data);
		
		nodeDl.pNode =tailNode;
		if(tailNode != null)
			tailNode.nNode = nodeDl;
		tailNode = nodeDl;
		if(headNode ==null)
			headNode = nodeDl;
			
	}
	
	public void printForward() {
		
		System.out.println("Forward => ");
		
		if(this.headNode != null)
			tarverseForward(this.headNode);
		
	}

	private void tarverseForward(NodeDl headNode2) {
		
		if(headNode2 != null) {
			System.out.println(headNode2.data);
			tarverseForward(headNode2.nNode);
		}
			
	}
	
	public void printBackward() {
		
		System.out.println("Backward => ");
		
		if(this.tailNode != null)
			tarverseReverse(this.tailNode);
		
	}

	private void tarverseReverse(NodeDl tailNode2) {
		
		if(tailNode2 != null) {
			System.out.println(tailNode2.data);
			tarverseReverse(tailNode2.pNode);
		}
		
	}	
}
