package com.blz.code;

import org.junit.jupiter.api.Test;

import org.junit.Assert;

public class BinaryTreeTest {

	@Test
	public void AddedNumbersSizeThreeNumbers() {
		BinaryTree<Integer> BinaryTree = new BinaryTree<>();
		BinaryTree.add(56);
		BinaryTree.add(30);
		BinaryTree.add(70);
		int size = BinaryTree.getSize();
		System.out.println(size);
		Assert.assertEquals(3, size);
	}
	
	@Test
	public void AddedNumbersSizeBT() {
		BinaryTree<Integer> BinaryTree = new BinaryTree<>();
		BinaryTree.add(56);
		BinaryTree.add(30);
		BinaryTree.add(70);
		BinaryTree.add(22);
		BinaryTree.add(40);
		BinaryTree.add(60);
		BinaryTree.add(95);
		BinaryTree.add(11);
		BinaryTree.add(65);
		BinaryTree.add(3);
		BinaryTree.add(16);
		BinaryTree.add(63);
		BinaryTree.add(67);
		int size = BinaryTree.getSize();
		System.out.println(size);
		Assert.assertEquals(13, size);
	}
}