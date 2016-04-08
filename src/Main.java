import java.io.*;
import java.util.Scanner;

/**
 * This is the solution of problem http://acm.acmcoder.com/showproblem.php?pid=2001 
 * @author AlanP
 *
 */

public class Main {
    public static void main(String[] args){
        int i=0;
        double[] xy=new double[10];
        Scanner sc=new Scanner(System.in);

        while(sc.hasNext()){ 
            xy[i]=sc.nextDouble();
            i++;
            if(4==i){
                System.out.println(String.format("%.2f", Math.sqrt((xy[0]-xy[2])*(xy[0]-xy[2])+(xy[1]-xy[3])*(xy[1]-xy[3]))));
                i=0;
            }
        }
    }
}