package ntwice;

public class NTwice {
    public String nTwice(String str, int n){
    
    String sub1 = str.substring(0, n);
    String sub = sub1 + str.substring(str.length()-n, str.length());
    return sub; 
    
} 
    public static void main(String[] args) {
       
         NTwice obj = new  NTwice();
         
        System.out.println( obj.nTwice("Hello", 2) );
        System.out.println( obj.nTwice("Chocolate", 3) );
        System.out.println( obj.nTwice("Chocolate", 1) );
        
    }
}
