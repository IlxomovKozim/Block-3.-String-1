package withouend2;

public class WithouEnd2 {
    public String withouEnd2(String str){
    
        String qt= Character.toString('"');
        
        if(str.length() > 2){
        String sub = str.substring(1, str.length()-1);
        return sub;
    }
        else
            return qt+qt;
        
} 

    public static void main(String[] args) {
        
        WithouEnd2 obj = new WithouEnd2();
        
        System.out.println( obj.withouEnd2("Hello") );
        System.out.println( obj.withouEnd2("abc") );
        System.out.println( obj.withouEnd2("ab") );
        
    }
}
