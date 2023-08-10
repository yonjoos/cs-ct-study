import java.util. *;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int N, M;
    static int[] check = new int[9];
    public static StringBuilder sb = new StringBuilder();

    static void initialize(int[] arr, int init){
        for(int i = 0; i < arr.length; i++){
            arr[i] = init;
        }
    }


    static void Ans(int curr, int[] arr){
        if(curr == M){
            for(int i=0; i < M; i++){
                sb.append(arr[i] + " ");
            }
            sb.append('\n');
            return;
        }
        else{
            for(int i = 1; i <= N; i++){
                arr[curr] = i;
                Ans(curr + 1, arr);
            }
        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        int[] arr = new int[M];

        initialize(arr, -1);
        initialize(check, -1);
        Ans(0,arr);
        System.out.print(sb);


    }

}