package without2;

public class Without2 {
    public String without2(String str){
    
    int length = str.length();
    if(length  > 3){
        
        String sub1 = str.substring(0, 2);
        String sub2 = str.substring(length-2, length);
        
        if(sub1.equals(sub2)){
            return str.substring(2, length);
        }
        return str;
    }
    return "'";
    
} 
    public static void main(String[] args) {
        
        Without2 obj = new Without2 ();
         
        System.out.println( obj.without2("HelloHe") );
        System.out.println( obj.without2("HelloHi") );
        System.out.println( obj.without2("Hi") );    
        
    }
}
