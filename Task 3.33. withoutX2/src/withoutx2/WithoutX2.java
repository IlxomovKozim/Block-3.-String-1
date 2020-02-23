package withoutx2;

public class WithoutX2 {
    public String withoutX2(String str){
    
        StringBuilder sb = new StringBuilder(str);
        char xF = str.charAt(0);
        char xL = str.charAt(1);
        
        if(xF == 'x' && xL == 'x'){
            return str.substring( 2, str.length() );
        }
        if(xF == 'x'){
        return str.substring(1);
        }
        if(xL == 'x'){
            return sb.deleteCharAt(1).toString();
        }
        return str;
        
}  
    public static void main(String[] args) {
        
        WithoutX2 obj = new  WithoutX2();
         
        System.out.println( obj.withoutX2("xHi")  );
        System.out.println( obj.withoutX2("Hxi")  );
        System.out.println( obj.withoutX2("Hi")  );
            
    }
}
