package Èí¼þ¹¤³Ì;

public class Consequence {

	public String getOperator(int index) {
	     String s = null;
	     switch(index) {
	     case 0:
	         s = "+";break;
	     case 1:
	         s = "-";break;
	     case 2:
	         s = "*";break;
	     case 3:
	         s = "/";
	     }
	     return s;
	 }
	
	 public int result(int n1, int n2, String s1) {
	     if (s1.equals("+")) {
	         return n1 + n2;
	     } else if (s1.equals("-")) {
	         return n1 - n2;
	     } else if (s1.equals("*")) {
	         return n1 * n2;
	     } else if (s1.equals("/")) {
	         int s = n1 / n2;
	         return s;
	     } else {
	         return 0;
	     }
	 }
	public int getResult(int n1, int n2, int n3, String op1, String op2) {
	    
	     if (op1.equals("+")||op1.equals("-"))  
	    	 if(op2.equals("*")||op2.equals("/"))
	    		 return result(n1, result(n2, n3, op2), op1);
	     
	     return result(result(n1, n2, op1), n3, op2);
	     
	 }
	
}
