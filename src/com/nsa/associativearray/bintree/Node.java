package com.nsa.associativearray.bintree;

/*
 * Node Class
 */

//Wieso können wir keine Vererbung benutzen mit dem tree oder
//emuteration via TREENODE zb Adrian

public class Node<K, V> {

	private K key;
	private V value;
	private Node<K, V> left;
	private Node<K, V> right;
	
	/*
	 * constructor
	 */
	
	//Frage left und right node muss doch null gesetz werden 
	//besserer style oder
	
	//CHANGED PUBLIC!!!!!
	
	//Default constructor just in case
	public Node  (){
		
	}

	public Node(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	/*
	 * Getter and Setter easy
	 */

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public Node<K, V> getLeft() {
		return left;
	}

	public void setLeft(Node<K, V> left) {
		this.left = left;
	}

	public Node<K, V> getRight() {
		return right;
	}

	public void setRight(Node<K, V> right) {
		this.right = right;
	}

}