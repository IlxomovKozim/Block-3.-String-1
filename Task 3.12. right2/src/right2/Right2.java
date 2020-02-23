package right2;

public class Right2 {
    public String right2(String str){
        
       String sub = str.substring( str.length()-2, str.length() );
       String sub1 = str.substring( 0, str.length()-2 );
       return sub+sub1;
       
} 
    public static void main(String[] args) {
        
        Right2 obj = new Right2();
        
        System.out.println( obj.right2("Hello") );
        System.out.println( obj.right2("java"));
        System.out.println( obj.right2("Hi") );
        
    } 
}
