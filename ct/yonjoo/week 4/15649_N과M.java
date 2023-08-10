import java.util.*;
public class Main {
    static int M, N;
    public static void initialize(int[] c){
        for(int i = 0; i < c.length; i++){
            c[i] = -1;
        }
    }

    public static boolean check(int[] c){ // 다 체크되면 OK
        for(int i = 0; i < c.length; i++){
            if(c[i] == -1) return false;
        }
        return true;
    }




    public static void find(int cur, int[] arr, int[] ck){
        if(cur == M){
            for(int i : arr){
                System.out.print(i + " ");
                
            }
            System.out.println();
        }
        else{
            for(int i = 1; i <= N; i++){
                if(ck[i] == -1){
                    arr[cur] = i;
                    ck[i] = 1;
                    find(cur +1, arr, ck);
                    ck[i] = -1;
                    arr[cur] = -1;
                }
                else continue;
            }
        }

    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        M = m;
        N = n;

        int[] arr = new int[m];
        int[] ck = new int[n+1];
        initialize(arr);
        initialize(ck);

        find(0, arr, ck);




    }
}