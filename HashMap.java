package com.blz.code;


public class HashMap<K, V> {
	
	LinkedList<K> LinkedList;
	
	public HashMap() {
		this.LinkedList = new LinkedList<>();
	}

	public V get(K key) {
		MapNode<K, V> MapNode = (MapNode<K, V>) this.LinkedList.Search(key);
		return (MapNode == null) ? null : MapNode.getValue();
	}

	public void add(K key, V value) {
		MapNode<K, V> MapNode = (MapNode<K, V>) this.LinkedList.Search(key);
		if(MapNode == null) {
			MapNode = new MapNode<>(key, value);
			this.LinkedList.append(MapNode);
		}else {
			MapNode.setValue(value);
		}
	}	
	
	@Override
	public String toString() {
		return "HashMapNodes{" + LinkedList + '}';
	}
}