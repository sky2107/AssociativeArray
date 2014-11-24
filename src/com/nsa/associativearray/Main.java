package com.nsa.associativearray;

import com.nsa.associativearray.bintree.BinTree;
import com.nsa.associativearray.bintree.Node;
import java.lang.*;

/*
 * Nur zum Testen um einiges zu verstehen
 */

public class Main {

	public static <K, V> void main(String[] args) {
		
		Node <K,V>leer = new Node<>();
		

		Node <Integer,Integer> wurzel1 = new Node<Integer, Integer>(1,100);
		
		BinTree<Integer, Integer> baum = new BinTree<Integer, Integer>(leer, 0);
		
		baum.addNode(1, 100);
		baum.addNode(2, 200);
		
		System.out.println(baum.getSize());
		
		System.out.println(baum.getRoot());
		
		
		
	}	

}
