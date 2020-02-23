package theend;

public class TheEnd {
    public String theEnd(String str, boolean front){
    
        String sub;
    if(front == true){
        sub = str.substring(0, 1);
        return sub;
    } 
    else
        sub = str.substring(str.length()-1);   
    return sub;
    
} 
    public static void main(String[] args) {
        
        TheEnd obj = new TheEnd();
        
        System.out.println( obj.theEnd("Hello", true) );
        System.out.println( obj.theEnd("Hello", false) );
        System.out.println( obj.theEnd("oh", true) );
        
    } 
}
