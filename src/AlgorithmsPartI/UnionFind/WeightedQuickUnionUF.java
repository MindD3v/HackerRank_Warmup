package AlgorithmsPartI.UnionFind;

public class WeightedQuickUnionUF implements UnionFind {

    private int count;
    private final int[] array;
    private final int[] size;

    @Override
    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) { return; }

        if (size[rootP] < size[rootQ]) {
            array[rootP] = rootQ;
            size[rootQ] += size[rootP];
        } else {
            array[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }

        count--;
    }

    public WeightedQuickUnionUF(int i) {
        count = i;
        array = new int[i];
        size = new int[i];
        for (int j = 0; j < i; j++) {
            array[j] = j;
            size[j] = 1;
        }
    }

    @Override
    public int find(int p) {
        if (array[p] == p) {
            return p;
        }

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
            builder.append(i).append(" ");
        }
        builder.append("\n");
        for (int anArray : array) {
            builder.append(anArray).append(" ");
        }
        builder.append("\n");

        return builder.toString();
    }
}