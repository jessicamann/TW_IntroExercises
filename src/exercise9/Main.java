package exercise9;

import java.util.LinkedList;
import java.util.Collections;

/**
 * Created by jessicamann on 6/7/15.
 * Prime factor list
 */
public class Main {
    public static void main(String[] args){generate(30);}

    private static LinkedList<Integer> generate(int n){
        LinkedList<Integer> factors = new LinkedList<Integer>();
        for(int i=2; i<=n; i++){
            while(n % i == 0){
                if(!factors.contains(i)){factors.add(i);}
                n /= i;
            }
        }
        Collections.sort(factors);
        for(int num : factors){
            System.out.print(num+" ");
        }

        return factors;
    }
}
