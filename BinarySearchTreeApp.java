package com.algorithms;

public class BinarySearchTreeApp {

	public static void main(String[] args) {
			
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(80);
		bst.add(40);
		bst.add(10);
		bst.add(70);
		bst.add(30);
		bst.add(20);
		
		bst.traverse();
	}

}

class Node {

	int data;
	Node leftNode;
	Node rightNode;

	Node(int data) {
		this.data = data;
	}

}

class BinarySearchTree {

	Node rootNode;

	public void add(int data) {

		if (rootNode == null) {
			rootNode = new Node(data);
		} else {
			generateNode(rootNode, data);
		}

	}

	private void generateNode(Node rootNode, int data) {
		
		Node tempNode = rootNode;
		
		if (tempNode.data > data) {
			if(tempNode.leftNode != null) {
				generateNode(tempNode.leftNode, data);	
			}else {
				tempNode.leftNode = new Node(data);
			}
		} else {
			if(tempNode.rightNode != null) {
				generateNode(tempNode.rightNode, data);	
			}else {
				tempNode.rightNode = new Node(data);
			}
		}

	}
	
	public void traverse() {
		
		if(rootNode != null)
			treeTraverse(rootNode);
	}

	private void treeTraverse(Node rootNode) {
		
		if(rootNode == null)
			return;
			
		treeTraverse(rootNode.leftNode);
		System.out.println(rootNode.data);
		treeTraverse(rootNode.rightNode);
		
	}

}
