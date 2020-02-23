package extrafront;

public class ExtraFront {
    public String extraFront(String str){
    
    if(str.length() > 1){
        String sub = str.substring(0, 2);
        return sub+sub+sub;
    }
    
    return str+str+str;
    
} 
    public static void main(String[] args) {
        
        ExtraFront obj = new ExtraFront();
       
        System.out.println( obj.extraFront("Hello") );
        System.out.println( obj.extraFront("ab") );
        System.out.println( obj.extraFront("H") );
           
    }
}
