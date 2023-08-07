/*
Prob :-
   Given an integer n, return all the structurally unique BST's (binary search trees), which has exactly n nodes of unique values from 1 to n. Return the answer in any order.

Example 1:
    Input: n = 3
    Output: [[1,null,2,null,3],[1,null,3,2],[2,1,3],[3,1,null,null,2],[3,2,null,1]]
    Example 2:

Example 2:
    Input: n = 1
    Output: [[1]]
*/

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
      /*  List<TreeNode> treeNodes = binarySearchTree.generateTrees(3);
        System.out.println(treeNodes); */
        List<TreeNode> treeNodes = binarySearchTree.generateTrees(1);
        System.out.println(treeNodes);
    }
}