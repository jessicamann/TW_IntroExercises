package exercise8;

/**
 * Created by jessicamann on 6/7/15.
 */
public class Main {
    public static void main(String[] args){
        fizzBuzz();
    }

    private static void fizzBuzz(){
        for(int i=1; i<=100; i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%3==0){
                System.out.println("Fizz");
            } else if (i%5==0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}