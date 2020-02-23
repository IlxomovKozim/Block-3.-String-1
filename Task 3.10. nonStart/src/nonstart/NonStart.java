package nonstart;

public class NonStart {
    public String nonStart(String a, String b){  
    
    String sub1 = a.substring(1, a.length());
    String sub2 = b.substring(1, b.length());
    return sub1+sub2;
    
} 
    
    public static void main(String[] args) {
        
        NonStart obj = new NonStart();
        
        System.out.println( obj.nonStart("Hello", "There") );
        System.out.println( obj.nonStart("java", "code") );
        System.out.println( obj.nonStart("shotl", "java") );
        
    } 
}
