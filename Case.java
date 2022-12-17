import java.util.*;
public class Case {  
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in); 
        String a; 
		System.out.println("Enter String:");
		a=sc.nextLine();
        StringBuffer k=new StringBuffer(a);  
          
        for(int i = 0; i < a.length(); i++) {  
              
              
            if(Character.isLowerCase(a.charAt(i))) {  
                k.setCharAt(i, Character.toUpperCase(a.charAt(i)));  
            }  
            else if(Character.isUpperCase(a.charAt(i))) {  
                k.setCharAt(i, Character.toLowerCase(a.charAt(i)));  
            }  
        }  
        System.out.println("after changes : " + k);  
    }  
}  