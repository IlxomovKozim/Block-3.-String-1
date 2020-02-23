package combostring;

public class ComboString {
   public String comboString(String a, String b){
   
       if(a.length() > b.length()){
        return b+a+b;
    }
       else
           return a+b+a;
} 
    
    public static void main(String[] args) {
        
        ComboString obj = new ComboString();
        
        System.out.println( obj.comboString("Hello", "hi") );
        System.out.println( obj.comboString("hi", "Hello") );
        System.out.println( obj.comboString("aaa", "b") );
        
    }
}
