package atfirst;

public class AtFirst {
   public String atFirst(String str){ 
   
   if(str.length() > 1){
       String sub = str.substring(0, 2);
       return sub;
   }
       return str + '@';
       
} 
    public static void main(String[] args) {
        
        AtFirst obj = new AtFirst();
        
        System.out.println( obj.atFirst("hello") );
        System.out.println( obj.atFirst("hi") );
        System.out.println( obj.atFirst("h") );
        
    }
}
