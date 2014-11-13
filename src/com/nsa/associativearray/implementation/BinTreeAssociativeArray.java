package com.nsa.associativearray.implementation;

import java.util.AbstractMap.SimpleEntry;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

import com.nsa.associativearray.interfaces.AssociativeArray;

public class BinTreeAssociativeArray<T> implements AssociativeArray<T> {

	@Override
	public void clear() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean containsValue(T value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsKey(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void put(SimpleEntry<String, T> pair) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void putAll(SimpleEntry<String, T>... pairs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T remove(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(String key, T newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void forEach(BiConsumer<String, T> biConsumer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void extractAll(AssociativeArray<T> destination) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AssociativeArray<T> map(BiFunction<String, T, AssociativeArray<T>> biFunction) {
		// TODO Auto-generated method stub
		return null;
	}



}
