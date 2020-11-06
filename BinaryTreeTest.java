package com.blz.code;

import org.junit.jupiter.api.Test;

import org.junit.Assert;

public class BinaryTreeTest {

	@Test
	public void given3NumbersWhenAddedToBSTShouldReturnSize3() {
		BinaryTree<Integer> BinaryTree = new BinaryTree<>();
		BinaryTree.add(56);
		BinaryTree.add(30);
		BinaryTree.add(70);
		int size = BinaryTree.getSize();
		System.out.println(size);
		Assert.assertEquals(3, size);
	}
}