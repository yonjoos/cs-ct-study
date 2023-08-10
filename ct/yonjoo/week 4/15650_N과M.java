import java.util. *;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int N, M;
    static int[] check = new int[9];

    static void initialize(int[] arr, int init){
        for(int i = 0; i < arr.length; i++){
            arr[i] = init;
        }
    }

    static void Answer(int curr, int bound, int[] arr){
        if(curr == M){
            for(int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        else{
            for(int num = bound + 1; num <= N; num++){ // ## START POINT : bound + 1
                if(check[num] == -1){ //if yet used
                    check[num] = 1;
                    arr[curr] = num;
                    Answer(curr + 1, num, arr);
                    check[num] = -1;
                    arr[curr] = -1;
                }
                else continue;
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
        Answer(0, 0, arr);
    }

}