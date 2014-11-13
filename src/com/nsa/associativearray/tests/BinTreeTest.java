package com.nsa.associativearray.tests;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.nsa.associativearray.bintree.BinTree;

public class BinTreeTest {

	private BinTree<String, String> tree;

	@Before
	public void setUp() throws Exception {
		tree = new BinTree<String, String>();
		tree.addNode("rot", "rote Farbe"); // hash: 113111
		tree.addNode("blau", "blaue Farbe"); // hash: 3026430
		tree.addNode("gruen", "gruene Farbe"); // hash: 98634515
		tree.addNode("gelb", "gelbe Farbe"); // hash: 3168980
		tree.addNode("schwarz", "schwarze Farbe"); // hash: 1917682346
		tree.addNode("pink", "pinke Farbe"); // hash: 3441014
		tree.addNode("orange", "orange Farbe"); // hash: -1008851410
		
		/*
		 * 							rot
		 * 					orange			blau
		 * 													gruen
		 * 											gelb			schwarz
		 * 												pink
		 * 
		 * 
		 */
	}

	@Test
	public void testFindNode() {
		assertEquals(tree.findNode("auto"), null);
		assertEquals(tree.findNode("rot").getValue(), "rote Farbe");
		assertEquals(tree.findNode("blau").getValue(), "blaue Farbe");
		assertEquals(tree.findNode("gruen").getValue(), "gruene Farbe");
		assertEquals(tree.findNode("gelb").getValue(), "gelbe Farbe");
		assertEquals(tree.findNode("schwarz").getValue(), "schwarze Farbe");
		assertEquals(tree.findNode("pink").getValue(), "pinke Farbe");
		assertEquals(tree.findNode("orange").getValue(), "orange Farbe");
	}

	@Test
	public void testAddNode() {
		assertEquals(tree.getRoot().getKey(), "rot");
		assertEquals(tree.getRoot().getRight().getKey(), "blau");
		assertEquals(tree.getRoot().getRight().getRight().getKey(), "gruen");
		assertEquals(tree.getRoot().getRight().getRight().getLeft().getKey(), "gelb");
		assertEquals(tree.getRoot().getRight().getRight().getRight().getKey(), "schwarz");
		assertEquals(tree.getRoot().getRight().getRight().getLeft().getRight().getKey(), "pink");
		assertEquals(tree.getRoot().getLeft().getKey(), "orange");
		
		tree.addNode("rot", "auto");
		assertEquals(tree.getSize(),7);
		
	}
	
	@Test
	public void testGetSize() {
		
		tree.addNode("rot", "auto");
		assertEquals(tree.getSize(),7);
		
		tree.addNode("rot2", "auto");
		assertEquals(tree.getSize(),8);
		
	}
	
	@Test
	public void testClear() {
		tree.clear();
		assertEquals(tree.getRoot(),null);
		assertEquals(tree.getSize(),0);
	}
	
	@Test
	public void testIsEmpty() {
		assertEquals(tree.isEmpty(),false);
		tree.clear();
		assertEquals(tree.isEmpty(),true);
	}

}
