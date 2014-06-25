import AlgorithmsPartI.Structures.UnionFind.QuickFindUF;
import AlgorithmsPartI.Structures.UnionFind.QuickUnionUF;

public class Solution {

    public static void main(String[] args) {
        QuickUnionUF quickUnionUF = new QuickUnionUF(10);

        quickUnionUF.union(4, 3);
        quickUnionUF.union(3, 8);
        quickUnionUF.union(6, 5);
        quickUnionUF.union(9, 4);
        quickUnionUF.union(2, 1);
        quickUnionUF.union(8, 9);
        quickUnionUF.union(5, 0);
        quickUnionUF.union(7, 2);
        quickUnionUF.union(6, 1);
        quickUnionUF.union(5, 9);

        System.out.println(quickUnionUF.toString());
    }
}