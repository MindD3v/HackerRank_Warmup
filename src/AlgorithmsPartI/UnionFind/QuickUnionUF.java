package AlgorithmsPartI.UnionFind;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class QuickUnionUF implements UnionFind {

    private int count;
    private int[] array;

    public QuickUnionUF(int i)
    {
        count =i;
        array = new int[i];
        for(int j=0;j<i;j++)
            array[j]=j;
    }

    @Override
    public void union(int p, int q) {
        array[root(p)] = root(q);
    }

    @Override
    public int find(int p) {
        throw new NotImplementedException();
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public int count() {
        return count;
    }

    private int root(int p)
    {
        if(array[p]==p)
            return p;

        return root(array[p]);
    }
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<array.length;i++)
            builder.append(array[i]+" ");

        return builder.toString().trim();
    }
}