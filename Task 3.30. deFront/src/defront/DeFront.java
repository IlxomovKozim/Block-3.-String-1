package defront;

public class DeFront {
    public String deFront(String str){ 
       
       char a = str.charAt(0);
       char b = str.charAt(1);
       String new_str;
       String sub = str.substring( 2, str.length() );
       if(a == 'a'){
           new_str = a + sub;
           return new_str;
       }
       if(b == 'b'){
           new_str = b + sub;
           return new_str;
       }
       return sub;
    
} 
    public static void main(String[] args) {
        
        DeFront obj = new DeFront();
        
        System.out.println( obj.deFront("Hello") );
        System.out.println( obj.deFront("java") );
        System.out.println( obj.deFront("away") );  
        
    } 
}
