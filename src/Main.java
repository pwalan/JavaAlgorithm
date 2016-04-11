import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

/**
 * http://acm.acmcoder.com/showproblem.php?pid=2005 
 * @author AlanP
 * 
 */

public class Main {
	
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	String date;
    	SimpleDateFormat sdf=new SimpleDateFormat("D");
        while(sc.hasNextLine()){
        	System.out.println(sdf.format(new Date(sc.nextLine())));
        }  //The end of while.
    }  //The end of main function.
}  //The end of Main class.