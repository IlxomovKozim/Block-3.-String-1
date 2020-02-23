package firsttwo;

public class FirstTwo {
    public String firstTwo(String str){
    
    int length = str.length();
    String sub = "";
    
    if(length > 1){
        sub = str.substring(0, 2);  
        return sub;
    }
    else
        return str;
   
} 
    public static void main(String[] args) {
        
        FirstTwo obj = new FirstTwo();
        
        System.out.println( obj.firstTwo("Hello") );
        System.out.println( obj.firstTwo("abcdefg") );
        System.out.println( obj.firstTwo("ab") );
        
    } 
}
