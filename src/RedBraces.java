import java.util.Stack;

public class RedBraces {
	 public static boolean isredbraces(String str) {
	        Stack<Character> st = new Stack<Character>(); 
	        int i= 0; 
	       for(i=0;i<str.length();i++){ 
	            if(str.charAt(i) == '(' || str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/'){ 
	                st.push(str.charAt(i)); 
	            } 
	            else if(str.charAt(i) == ')'){ 
	                if(st.peek() == '('){ 
	                    return true; 
	                } else{ 
	                    while(!st.isEmpty() && st.peek() != '('){ 
	                        st.pop(); 
	                    } 
	                    st.pop(); 
	                } 
	            } 
	       } 
	        return false; 
	    
	 }
	    public static void main(String[] args){
	        String s = "((a+b)+(c))";
	        System.out.println(isredbraces(s));
	    }
}
