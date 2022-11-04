public class Permutation{
    public static void main(String[] args){
        int n = 5;
        int a ;
        // int d = n;
        // a *= n - 1;
        int f = n;


        for (int i = 1; i < n; i++){
            // int c = a * i;
            // d *= a;

            a = n - i;
            f *= a;

        }
        // System.out.println(a);
        System.out.println(f);

    }
}