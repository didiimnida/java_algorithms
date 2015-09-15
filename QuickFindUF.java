// Quick-find:
// Data Structure: Integer array of id[] of size N.
// Interpretation: p and q are connected iff they have the same id.

public class QuickFindUF {

  public static void main(String[] args){
    System.out.print("Hello World");
  }

  //Private Integer Array to support implementation.
  private int[] id;

  //Create array and set value corresponding to each value.
  public QuickFindUF(int N){
    id = new int[N];
    for (int i = 0; i < N; i++) id[i] = i;
  }

  public boolean connected(int p, int q){
    return id[p] == id[q];
  }

  public void union(int p, int q) {
    int pid = id[p];
    int qid = id[q];
    for (int i = 0; i < id.length; i++)
      if (id[i] == pid) id[i] = qid;
  }
}
