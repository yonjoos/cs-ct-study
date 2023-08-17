‘’’Java
import java.io.*;
import java.util.*;

public class Main {
// 0 1 2 3 4
    public static void func(int[] arr, int[] check, int n){
        int index = n-1;
        if(index >= arr.length) index = index - arr.length;
        else if(index < 0) index = arr.length + index;
        if (check[index] == 0){
            System.out.println(index + 1);
            check[index] = 1;
            int next_inx = index + arr[index];

            if(arr[index] < 0){
                if(next_inx < 0) {
                    next_inx = (arr.length - next_inx);
                }
                func(arr, check, next_inx + 1);
                next_inx -= 1;
                func(arr, check, next_inx + 1);

            }
            //0 1 2 3 4
            else if(arr[index] >= 0){
                if(next_inx >= arr.length){
                    next_inx = next_inx - arr.length;
                }
                func(arr, check, next_inx + 1);
                func(arr, check, ++next_inx + 1);
            }

        }
        else{

        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] check = new int[n];

        for(int i = 0; i < n; i++){
            check[i] = 0;
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        func(arr, check, 1);


    }
}
‘’’
