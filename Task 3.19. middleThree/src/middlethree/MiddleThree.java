package middlethree;

public class MiddleThree {
    public String middleThree(String str){
    
    String sub = str.substring( str.length()/2-1, str.length()/2+2 );
    return sub;
    
} 
    
    public static void main(String[] args) {
       
        MiddleThree obj = new MiddleThree();
    
        System.out.println( obj.middleThree("Candy") );
        System.out.println( obj.middleThree("uzbekista") );
        System.out.println( obj.middleThree("solving") );
    
    }
}
