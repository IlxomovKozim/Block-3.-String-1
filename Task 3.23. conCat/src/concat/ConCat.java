package concat;

public class ConCat {
    public String conCat(String a, String b){
    
    if(a.length() != 0 && b.length() != 0){    
    if(a.charAt(a.length()-1) == b.charAt(0)){
        return a.concat(b.substring(1));
    }
    }
    return a.concat(b);
    

        
}
    public static void main(String[] args) {
      
        ConCat obj = new ConCat ();
        
        System.out.println( obj.conCat("abc", "cat") );
        System.out.println( obj.conCat("dog", "cat") );
        System.out.println( obj.conCat("abc", "") );
        
    } 
}
