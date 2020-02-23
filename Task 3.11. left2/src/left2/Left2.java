package left2;

public class Left2 {
    public String left2(String str){
    
       String sub = str.substring( 0, 2 );
       String sub1 = str.substring( 2, str.length() );
       return sub1+sub;
} 

    public static void main(String[] args) {
        
        Left2 obj = new Left2();
        
        System.out.println( obj.left2("Hello") );
        System.out.println( obj.left2("java") );
        System.out.println( obj.left2("Hi") );
        
    }
}
