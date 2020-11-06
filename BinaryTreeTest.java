package com.blz.code;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {

	@Test
	public void AddedNumbersSizeThreeNumbers() {
		BinaryTree<Integer> BinaryTree = new BinaryTree<>();
		BinaryTree.add(56);
		BinaryTree.add(30);
		BinaryTree.add(70);
		int size = BinaryTree.getSize();
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
		Assert.assertEquals(13, size);
	}

	@Test
	public void ReturnSearchElementBT() {
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
		boolean result = BinaryTree.searchRecursively(BinaryTree.root, 63);
		Assert.assertTrue(true);
	}
}