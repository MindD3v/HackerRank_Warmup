package AlgorithmsPartI.UnionFind;

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
        int rootP = find(p);
        int rootQ = find(q);

        if(rootP==rootQ) return;

        array[rootP] = rootQ;
    }

    @Override
    public int find(int p) {
        if(array[p]==p)
            return p;

        return find(array[p]);
    }

    @Override
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public int count() {
        return count;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < array.length;i++)
        {
            builder.append(i + " ");
        }
        builder.append("\n");
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i] + " ");
        }
        builder.append("\n");

        return builder.toString();
    }
}