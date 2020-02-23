package lastchars;

public class LastChars {
   public String lastChars(String a, String b){
   
       char subA = 0;
       char subB = 0;
       
       if(a.length() > 1){
       subA = a.charAt(0);  }
       else {
           subA = '@'; }
       
       if(b.length() > 1){
       subB = b.charAt(b.length()-1); }
       else {
           subB = '@'; }
       
       return ""+subA+subB;
       
   } 
    
    public static void main(String[] args) {
       
        LastChars obj = new LastChars();
        
        System.out.println( obj.lastChars("last", "chars") );
        System.out.println( obj.lastChars("yo", "java") );
        System.out.println( obj.lastChars("hi", "") );
        
    } 
}
