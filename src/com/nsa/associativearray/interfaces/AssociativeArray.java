package com.nsa.associativearray.interfaces;

import java.util.AbstractMap.SimpleEntry;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 * Defines an interface for an associative array. This array is typesafe and
 * maps non numeric keys to generic values.
 * 
 * @author Adrian Endrich, Marcel Heuser, Felix Navas
 *
 * @param <T> the datatype for our value
 */
public interface AssociativeArray<T> {

	/**
	 * clears the associative array.
	 */
	public void clear();

	/**
	 * checks if the given value is in this associative array.
	 * 
	 * @param value
	 *            value to check
	 * @return true if the value is in the array
	 */
	public boolean containsValue(T value);

	/**
	 * checks if the given key is in this associative array.
	 * 
	 * @param key
	 *            key to check
	 * @return true if the key is in the array
	 */
	public boolean containsKey(String key);

	/**
	 * returns the value at a given key.
	 * 
	 * @param key
	 *            the key
	 * @return the value
	 */
	public T get(String key);

	/**
	 * checks if this associative array is empty.
	 * 
	 * @return true if it is empty
	 */
	public boolean isEmpty();

	/**
	 * puts a key-value-pair into the associative array.
	 * 
	 * @param pair
	 *            the pair to put in
	 */
	public void put(SimpleEntry<String, T> pair);

	/**
	 * puts all a key-value-pair objects into the associative array.
	 * 
	 * @param pairs
	 *            the pairs to put in
	 */
	public void putAll(SimpleEntry<String, T>... pairs);

	/**
	 * removes a certain key-value-pair from the array and returns it.
	 * 
	 * @param key
	 *            the key
	 * @return the removed pair's value
	 */
	public T remove(String key);

	/**
	 * returns the size of the associative array (0 meaning empty).
	 * 
	 * @return size
	 */
	public int size();

	/**
	 * updates an entry at a given key with a specific value.
	 * 
	 * @param key
	 *            the key
	 * @param newValue
	 *            the new value
	 */
	public void update(String key, T newValue);

	/**
	 * runs a given biConsumer on every pair in this array.
	 * 
	 * @param biConsumer
	 *            the biConsumer
	 */
	public void forEach(BiConsumer<String, T> biConsumer);

	/**
	 * copies all pairs into another associative array.
	 * 
	 * @param destination
	 *            the other array
	 */
	public void extractAll(AssociativeArray<T> destination);

	/**
	 * executes the given bifunction on every pair in this associative array and
	 * creates a new associative array which maps the changed values on the old
	 * keys.
	 * 
	 * @param biFunction
	 *            the bifunction for mapping
	 * @return the new associative array
	 */
	public AssociativeArray<T> map(BiFunction<String, T, AssociativeArray<T>> biFunction);

}