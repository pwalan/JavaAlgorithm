import java.io.*;
import java.util.Scanner;
import java.lang.Math;

/**
 * This is the solution of the second problem of JingDong trainee recruitment exam online. 
 * @author AlanP
 * @date 2016.4.9
 */

public class Main {
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	
    	String S;
        String T;
        int x=0,y=0;
        int abs_x,abs_y;
        int min,max;
        int abs_sub;
        int i;

        while(sc.hasNextLine()){
        	S=sc.nextLine();
        	T=sc.nextLine();
        	
            x=S.charAt(0)-T.charAt(0);
            y=S.charAt(1)-T.charAt(1);
            
            abs_x=Math.abs(x);
            abs_y=Math.abs(y);
            min=Math.min(abs_x, abs_y);
            max=Math.max(abs_x, abs_y);
            abs_sub=Math.abs(abs_x-abs_y);
            
            /*System.out.println("S+T:"+S+" "+T);
            System.out.println(x+" "+y);*/

            if(abs_x==abs_y){
                //在对角线上 
                System.out.println(abs_x);
                for(i=0;i<abs_x;i++){
                    if(x<0&&y<0){
                        System.out.println("RU"); 
                    }else if(x<0&&y>0){
                    	System.out.println("RD");
                    } else if(x>0&&y<0){
                    	System.out.println("LU"); 
                    }else{
                    	System.out.println("LD"); 
                    }
                }
            }else if(x==0){
                //在同一列
            	System.out.println(abs_y);
                for(i=0;i<abs_y;i++){
                    if(y<0){
                    	System.out.println("D"); 
                    }else{
                    	System.out.println("U"); 
                    }
                } 
            }else if(y==0){
                //在同一行
            	System.out.println(abs_x);
                for(i=0;i<abs_y;i++){
                    if(x<0){
                    	System.out.println("R"); 
                    }else{
                    	System.out.println("L"); 
                    }
                }  
            }else{
                //不在特殊位置上 
            	System.out.println(max);
                if(x<0&&y<0){
                    for(i=0;i<min;i++){
                    	System.out.println("RU"); 
                    }
                    if(abs_x>abs_y){
                        for(i=0;i<abs_sub;i++){
                        	System.out.println("R"); 
                        }                  
                    }else{
                        for(i=0;i<abs_sub;i++){
                        	System.out.println("U"); 
                        } 
                    }

                }else if(x<0&&y>0){
                    for(i=0;i<min;i++){
                    	System.out.println("RD"); 
                    }
                    if(abs_x>abs_y){
                        for(i=0;i<abs_sub;i++){
                        	System.out.println("R");
                        } 
                    }else{
                        for(i=0;i<abs_sub;i++){
                        	System.out.println("D");;
                        } 
                    }
                } else if(x>0&&y<0){
                    for(i=0;i<min;i++){
                    	System.out.println("LU");
                    }
                    if(abs_x>abs_y){
                        for(i=0;i<abs_sub;i++){
                        	System.out.println("L");
                        } 
                    }else{
                        for(i=0;i<abs_sub;i++){
                        	System.out.println("U");
                        } 
                    }
                }else{
                    for(i=0;i<min;i++){
                    	System.out.println("LD");
                    }
                    if(abs_x>abs_y){
                        for(i=0;i<abs_sub;i++){
                        	System.out.println("L");
                        } 
                    }else{
                        for(i=0;i<abs_sub;i++){
                        	System.out.println("D");
                        } 
                    }
                }
            } 
        }  //The end of while.
    }  //The end of main function.
}  //The end of Main class.