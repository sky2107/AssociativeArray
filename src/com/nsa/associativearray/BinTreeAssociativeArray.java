package com.nsa.associativearray;

import java.util.AbstractMap.SimpleEntry;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

import com.nsa.associativearray.interfaces.AssociativeArray;

/**
 * Implementation of the associative array using a bin tree structure.
 * 
 * @author Adrian Endrich, Marcel Heuser, Felix Navas
 *
 * @param <K>
 *            the datatype for our key
 * @param <V>
 *            the datatype for our value
 */
public class BinTreeAssociativeArray<K, V> implements AssociativeArray<K, V> {

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean containsValue(V value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsKey(K key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void put(SimpleEntry<K, V> pair) {
		// TODO Auto-generated method stub

	}

	@Override
	public void putAll(SimpleEntry<K, V>... pairs) {
		// TODO Auto-generated method stub

	}

	@Override
	public V remove(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(K key, V newValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void forEach(BiConsumer<K, V> biConsumer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void extractAll(AssociativeArray<K, V> destination) {
		// TODO Auto-generated method stub

	}

	@Override
	public AssociativeArray<K, V> map(BiFunction<K, V, SimpleEntry<K, V>> biFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
