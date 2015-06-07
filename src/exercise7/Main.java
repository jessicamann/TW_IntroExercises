package exercise7;

import java.util.Scanner;

/**
 * Created by jessicamann on 6/6/15.
 */
public class Main {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        printAsterisks(num);
    }

    private static int getTotalPerLine(int row, int num){
        return num*2-1;

    }

    private static int getNumSpaces(int row, int num){
        return (getTotalPerLine(row, num)-getNumAsterisks(row))/2;
    }

    private static int getNumAsterisks(int row){
        return row*2+1;
    }

    private static void printAsterisks(int num) {
        for(int row=0; row<num; row++){
            if(row!=num-1) {
                printRow(num, row);
            } else {
                System.out.println("Jess");
            }
        }
        for(int row=num-2; row>=0; row--){
            printRow(num, row);
        }

    }

    private static void printRow(int num, int row) {
        for(int spaces=0; spaces<getNumSpaces(row, num); spaces++){
            System.out.print(" ");
        }
        for(int aster=0; aster<getNumAsterisks(row); aster++){
            System.out.print("*");
        }
        System.out.println();
    }
}
