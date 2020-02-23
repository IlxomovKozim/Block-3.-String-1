package makeabba;

public class MakeAbba {
    public String makeAbba(String a, String b){ 
        return a+b+b+a;
} 
    public static void main(String[] args) {
       
        MakeAbba obj = new MakeAbba();
        
        System.out.println( obj.makeAbba("Hi", "Bye") );
        System.out.println( obj.makeAbba("Yo", "Alice") );
        System.out.println( obj.makeAbba("What", "Up") );
        
    }  
}
