import java.io.*;
import java.util.Scanner;
import java.lang.Math;

/**
 * http://acm.acmcoder.com/showproblem.php?pid=2010 
 * @author AlanP
 * 
 */

public class Main {
	
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	
    	int m,n;
    	boolean exist;
    	boolean isfirst;

        while(sc.hasNext()){
        	m=sc.nextInt();
        	n=sc.nextInt();
        	exist=false;
        	isfirst=true;
        	for(int i=m;i<=n;i++){
        		if(i==(i/100)*(i/100)*(i/100)+(i/10%10)*(i/10%10)*(i/10%10)+(i%10)*(i%10)*(i%10)){
        			if(isfirst){
        				System.out.print(i);
        				isfirst=false;
        			}else{
        				System.out.print(" "+i);  //注意此处的输出控制，一旦把握不好就会出现Presentation Error
        			}
        			exist=true;
        		}
        	}
        	if(!exist){
        		System.out.println("no");
        	}else{
        		System.out.println("");
        	}
        	
        }  //The end of while.
    }  //The end of main function.
}  //The end of Main class.