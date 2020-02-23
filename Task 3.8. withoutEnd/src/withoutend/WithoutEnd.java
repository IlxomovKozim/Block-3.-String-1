package withoutend;

public class WithoutEnd {
    public String withoutEnd(String str){

    String sub = str.substring(1, str.length()-1);
    return sub;
    
}
    public static void main(String[] args) {
        
        WithoutEnd obj = new WithoutEnd();
        
        System.out.println( obj.withoutEnd("Hello") );
        System.out.println( obj.withoutEnd("java") );
        System.out.println( obj.withoutEnd("coding") );
                
    }
}
