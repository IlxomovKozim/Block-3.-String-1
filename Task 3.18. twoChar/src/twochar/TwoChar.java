package twochar;

public class TwoChar {
    public String twoChar(String str, int index){
    
        int length = str.length();
        String sub;
    if(length < index || length-1 == index){
        sub = str.substring(0, 2);
        return sub;
    }
    sub = str.substring(index, index+2);
    return sub;
    
} 
    
    public static void main(String[] args) {
        
        TwoChar obj = new TwoChar();
        
        System.out.println( obj.twoChar("java", 0) );
        System.out.println( obj.twoChar("java", 2) );
        System.out.println( obj.twoChar("java", 3) );
        
    }
}
