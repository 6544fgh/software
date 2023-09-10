package Èí¼þ¹¤³Ì;

import java.util.Random;

public class Main {
	 public static void main(String[] args) {
	     Random r = new Random();
	     Consequence result = new Consequence();
	     
	     int i =1;
	     while(i <= 300) {
	         int n1 = r.nextInt(99) + 1;
	         int n2 = r.nextInt(99) + 1;
	         int n3 = r.nextInt(99) + 1;
	         int op1 = r.nextInt(4);
	         int op2 = r.nextInt(4);
	         String s1 = result.getOperator(op1);
	         String s2 = result.getOperator(op2);
	         int res = result.getResult(n1, n2, n3, s1, s2);
	         if (res < 100 && res > 0) {   
	             System.out.println(i + ":" + n1 + s1 + n2 + s2 + n3 + "=" + res);
	             ++i;
	         }
	     }

 }
 
}
