package maketags;

public class MakeTags {
    public String makeTags(String tag, String word){ 
        
        String t1 = "<";
        String t2 = "</";
        String t3 = ">";
        return t1+tag+t3+word+t2+tag+t3;
        
 } 
    public static void main(String[] args) {
        
        MakeTags obj = new MakeTags();
        
        System.out.println( obj.makeTags("i", "Yay") );
        System.out.println( obj.makeTags("i", "Hello") );
        System.out.println( obj.makeTags("cite", "Yay") );
        
    }
    
}
