package middletwo;

public class MiddleTwo {
   public String middleTwo(String str){
  
       String md;
       if(str.length()%2 == 0){
           md = str.substring(str.length()/2-1, str.length()/2+1);
           return md;
       }
       else
           md = str.substring(str.length()/2, str.length()/2+1);
       return md;
       
}    
    public static void main(String[] args) {
        
        MiddleTwo obj = new MiddleTwo();
        
        System.out.println( obj.middleTwo("string") );
        System.out.println( obj.middleTwo("code") );
        System.out.println( obj.middleTwo("Practice") );
        
    } 
}
