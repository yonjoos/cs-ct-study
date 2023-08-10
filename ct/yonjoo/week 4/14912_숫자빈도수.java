package org.example;
import java.util. *;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = sc.nextInt();
        String tmp = "";
        int cnt = 0;

        for(int num = 1; num <= n; num++){
            tmp = Integer.toString(num);
            for(int i = 0; i < tmp.length(); i++){
                if(Integer.parseInt(String.valueOf(tmp.charAt(i))) == number){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);


    }
}