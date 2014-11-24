package com.nsa.associativearray.bintree;

/*
 * class for binary tree with generic types KEY and VALUE
 * 
 * Fehlt da nicht der Konstruktor oder reicht der Default Konstruktor
 */

public class BinTree<K, V> {

	private Node<K, V> root;
	private int size = 0;
	
	/*
	 *  Searchmode to find the exact KEY via HASH method
	 */

	public Node<K, V> findNode(K key) {

		Node<K, V> currentNode = root;

		while (currentNode.getKey() != key) {

			if (key.hashCode() < currentNode.getKey().hashCode()) {
				currentNode = currentNode.getLeft();
			} else {
				currentNode = currentNode.getRight();
			}

			if (currentNode == null)
				return null;

		}

		return currentNode;
	}
	
	/*
	 * adding a new NODE to the binary tree
	 */

	public void addNode(K key, V value) {

		Node<K, V> newNode = new Node<K, V>(key, value);

		if (root == null) {

			root = newNode;
			size++;

		} else {

			Node<K, V> currentNode = root;
			Node<K, V> parentNode;
			boolean inserted = false;

			while (!inserted) {
				parentNode = currentNode;

				if (key.hashCode() < currentNode.getKey().hashCode()) {

					currentNode = currentNode.getLeft();

					if (currentNode == null) {
						parentNode.setLeft(newNode);
						inserted = true;
						size++;
					}

				} else if (key.hashCode() == currentNode.getKey().hashCode()) {

					inserted = true;

				} else {

					currentNode = currentNode.getRight();

					if (currentNode == null) {
						parentNode.setRight(newNode);
						inserted = true;
						size++;
					}

				}
			}

		}
	}

	/*
	 * Getter 
	 */
	
	public Node<K, V> getRoot() {
		return root;
	}
	
	public int getSize(){
		return size;
	}
	
	/*
	 * to clear the binary tree
	 */
	
	public void clear(){
		this.root = null;
		this.size = 0;
	}
	
	/*
	 * check if the binary tree is EMPTY
	 */
	
	public boolean isEmpty(){
		return size==0;
	}
	
	//Method are here not necessary or??

	// public void inOrderTraverse(Node<K,V> currentNode) {
	// if (currentNode != null) {
	// inOrderTraverse(currentNode.left);
	// System.out.println(currentNode);
	// inOrderTraverse(currentNode.right);
	// }
	// }
	//
	// public void preorderTraverse(Node<K,V> currentNode) {
	// if (currentNode != null) {
	// System.out.println(currentNode);
	// preorderTraverse(currentNode.left);
	// preorderTraverse(currentNode.right);
	// }
	// }
	//
	// public void postOrderTraverse(Node<K,V> currentNode) {
	// if (currentNode != null) {
	// postOrderTraverse(currentNode.left);
	// postOrderTraverse(currentNode.right);
	// System.out.println(currentNode);
	// }
	// }

}
