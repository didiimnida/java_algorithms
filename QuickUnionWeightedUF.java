// Weighted quick-union:
// Need to maintain an extra array sz[i] to count number of objects in tree rooted at i.
// Modify quick-union to link root of smaller tree to root of larger tree.

public class QuickUnionWeightedUF {

  private int[] id;
  private int[] sz;

  public QuickUnionWeightedUF(int N) {
    id = new int[N];
    sz = new int[N];
    for (int i = 0; i < N; i++) id[i] = i;
    for (int i = 0; i < N; i++) sz[i] = 1;
  }

  private int root(int i){
    while(i != id[i]) i = id[i];
    return i;
  }

  public boolean connected(int p, int q){
    return root(p) == root(q);
  }

  public void union(int p, int q){
    int i = root(p);
    int j = root(q);
    if (i == j) return;
    if (sz[i] < sz[j]) {
      id[i] = j;
      sz[j] += sz[i];
    } else {
      id[j] = i;
      sz[i] += sz[j];
    }
  }
}
