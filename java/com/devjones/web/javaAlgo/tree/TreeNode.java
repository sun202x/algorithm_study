package com.devjones.web.javaAlgo.tree;

import java.util.List;

public class TreeNode {

	Object label;
	TreeNode parent;
	List<TreeNode> children;
//	TreeNode left;
//	TreeNode right;
	
	void printLabels(TreeNode root) {
		
		System.out.println(root.label);
		
		for(int i = 0; i < root.children.size(); i++) {
			
			printLabels(root.children.get(i));
		}
	}
	
	int height(TreeNode root) {
		
		int h = 0;
		
		for(int i = 0; i < root.children.size(); i++) {
			h = Math.max(h, 1 + height(root.children.get(i)));
		}
		
		return h;
	}
}
