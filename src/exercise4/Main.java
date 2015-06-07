package exercise4;

import java.util.Scanner;

/**
 * Created by jessicamann on 6/6/15.
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        printAsterisks(num);
    }

    private static void printAsterisks(int num){
        for(int i=0; i<num; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
