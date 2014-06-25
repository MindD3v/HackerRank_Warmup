package AlgorithmsPartI.UnionFind;

public class QuickFindUF implements UnionFind {
    private int count;
    int[] array;
    public QuickFindUF(int i)
    {
        count = i;
        array = new int[i];
        for(int j=0; j < i; j++)
            array[j]=j;
    }
    @Override
    public void union(int p, int q)
    {
        if(connected(p,q)) return;
        int arrayp = array[p];
        array[p] = array[q];
        for(int i=0;i < array.length;i++)
        {
            if(array[i]==arrayp)
                array[i]=array[q];
        }
        count--;
    }
    @Override
    public int find(int p)
    {
        return array[p];
    }
    @Override
    public boolean connected(int p, int q)
    {
        return array[p] == array[q];
    }
    @Override
    public int count()
    {
        return count;
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