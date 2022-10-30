import java.util.ArrayList;
public class UF {
    
    // UF(init N);

    // void union (int p, int q);
    // Boolean connected (int p, int q);
    // int find (int p);
    // int count();
    public static void main(String[] args){
        // int N = StdIn.readInt();
    
        // UF uf = new UF(N);
        // while (!StdInt.isEmpty()) {
        //     int p = StdIn.readInt();
        //     int q = StdIn.readInt();

        //     if (!uf.connected(p.q)) {
        //         uf.union(p,q);
        //         Stdout.println(p + " " + q);
        //     }
        // }
    }
    public class QuickFindUF {
        private int[] id;
        public QuickFindUF(int N) {
            id = new int[N];
            for (int i = 0; i < N; i++){
                id[i] = i;
            }
            
            
        }
        public boolean connected (int p, int q){
            return id [p] == id[q];
        }
        public void union (int p, int q) {
            int pid = id[p];
            int qid = id[q];
            for (int i = 0; i < id.length; i++){
                if (id[i] == pid){
                    id[i] = qid;
                }
            }
    
        }
        
        
    }
    
    
}
