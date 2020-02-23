package hasbad;

public class HasBad {
    public boolean hasBad(String str){ 
    
        String bad = str.substring(0, 3);
        String xbad = str.substring(1, 4);
        if(bad.equals("bad") || xbad.equals("bad")){
            return true;
        }
        return false;
    
} 
    public static void main(String[] args) {
        
        HasBad obj = new HasBad();
        
        System.out.println( obj.hasBad("badxx") );
        System.out.println( obj.hasBad("xbadxx") );
        System.out.println( obj.hasBad("xxbadxx") );  
        
    }
}
