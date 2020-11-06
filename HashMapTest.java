package com.blz.code;


import org.junit.Assert;
import org.junit.Test;


public class HashMapTest {
	
	@Test
	public void ReturnWordFrequency() {
		String sentence = "To be or not to be";
		HashMap<String, Integer> HashMap = new HashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value = HashMap.get(word);
			if(value == null)
				value = 1;
			else
				value = value +1;
			HashMap.add(word, value);
		}
		int frequency = HashMap.get("to");
		System.out.println(HashMap);
		Assert.assertEquals(2, frequency);
	}
}