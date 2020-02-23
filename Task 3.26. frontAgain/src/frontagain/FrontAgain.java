package frontagain;

public class FrontAgain {
    public boolean frontAgain(String str){
    
        String sub1 = str.substring(0, 2);
        String sub2 = str.substring( str.length()-2, str.length() );
        
        if( sub1.equals("ed") && sub2.equals("ed") ){
            return true;
        }
        return false;
    
}
 
    public static void main(String[] args) {
        
        FrontAgain obj = new FrontAgain();
        
        System.out.println( obj.frontAgain("edited") );
        System.out.println( obj.frontAgain("edit") );
        System.out.println( obj.frontAgain("ed") );
         
    }
}
