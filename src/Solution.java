import AlgorithmsPartI.UnionFind.QuickFindUF;
import AlgorithmsPartI.UnionFind.QuickUnionUF;
import AlgorithmsPartI.UnionFind.WeightedQuickUnionUF;

public class Solution {

    public static void main(String[] args) {
        QuickFindUF quickFindUF = new QuickFindUF(10);

        quickFindUF.union(9, 4);
        quickFindUF.union(8, 6);
        quickFindUF.union(3, 0);
        quickFindUF.union(0, 1);
        quickFindUF.union(7, 8);
        quickFindUF.union(4, 6);

        System.out.println(quickFindUF);

        WeightedQuickUnionUF weightedQuickUnionUF = new WeightedQuickUnionUF(10);
        weightedQuickUnionUF.union(4,1);
        weightedQuickUnionUF.union(7,8);
        weightedQuickUnionUF.union(3,8);
        weightedQuickUnionUF.union(8,9);
        weightedQuickUnionUF.union(5,6);
        weightedQuickUnionUF.union(5,4);
        weightedQuickUnionUF.union(9,0);
        weightedQuickUnionUF.union(0,4);
        weightedQuickUnionUF.union(2,5);

        System.out.println(weightedQuickUnionUF);

        weightedQuickUnionUF = new WeightedQuickUnionUF(10);
        weightedQuickUnionUF.union(2,4);
        weightedQuickUnionUF.union(1,7);
        weightedQuickUnionUF.union(1,2);
        weightedQuickUnionUF.union(3,5);
        weightedQuickUnionUF.union(6,8);
        weightedQuickUnionUF.union(6,3);
        weightedQuickUnionUF.union(6,0);
        weightedQuickUnionUF.union(6,8);
        weightedQuickUnionUF.union(6,9);
        weightedQuickUnionUF.union(6,1);

        System.out.println(weightedQuickUnionUF);
    }
}