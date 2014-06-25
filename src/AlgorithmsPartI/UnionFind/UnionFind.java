package AlgorithmsPartI.UnionFind;

/**
 * Created with IntelliJ IDEA.
 * User: jhinojosa
 * Date: 6/25/14
 * Time: 4:44 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UnionFind {
    void union(int p, int q);

    int find(int p);

    boolean connected(int p, int q);

    int count();
}
