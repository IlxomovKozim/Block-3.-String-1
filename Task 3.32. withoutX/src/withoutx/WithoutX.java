package withoutx;

public class WithoutX {
    public String withoutX(String str){
    
        char xF = str.charAt(0);
        char xL = str.charAt(str.length()-1);
        if(xF == 'x' && xL == 'x'){
            return str.substring( 1, str.length()-1 );
        }
        if(xF == 'x'){
        return str.substring(1);
        }
        if(xL == 'x'){
            return str.substring( 0, str.length()-1 );
        }
        return str;
        
}  
    public static void main(String[] args) {
        
        WithoutX obj = new  WithoutX();
         
        System.out.println( obj.withoutX("xHix") );
        System.out.println( obj.withoutX("xHi") );
        System.out.println( obj.withoutX("Hxix") );
            
    }
}
