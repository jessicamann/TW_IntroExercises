package exercise5;

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

    private static void printAsterisks(int num) {

        int astericksCounter = 1;
        int perLine = num*2-1;

        for(int row=0; row<num; row++){
            for(int space=0; space<num-row-1; space++){
                System.out.print(" ");
            }
            for(int aster=0; aster<astericksCounter; aster++){
                System.out.print("*");
            }
            astericksCounter+=2;
            System.out.println();
        }
    }
}
