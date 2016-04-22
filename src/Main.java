import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Baidu 2016 trainee recruitment exam online, second programming problem.
 * @author AlanP
 * 
 */

public class Main {
    public static void main(String[] args){
    	int n,m,k;
    	int i,j;
    	Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
        	n=sc.nextInt();
        	m=sc.nextInt();
        	k=sc.nextInt();
        	ArrayList arr=new ArrayList();
        	i=1;
        	j=1;
        	while(i<=n){
        		while(j<=m){
        			if(i*j<=k){
        				arr.add(i*j);
        				j++;
        			}else{    				
        				break;
        			}
        		}
        		j=1;
        		i++;
        	}
        	Collections.sort(arr);
        	System.out.println(arr);
        	System.out.println(arr.get(k-1));
        }  //The end of while.
    }  //The end of main function.
}  //The end of Main class.