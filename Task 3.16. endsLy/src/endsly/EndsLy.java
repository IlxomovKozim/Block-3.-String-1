package endsly;

public class EndsLy {
    public boolean endsLy(String str){
    
    if(str.length() > 1){
        String sub = str.substring(str.length()-2, str.length());
        if(sub.equals("ly")){
            return true;
    }
        return false;
    }
    return false;
    
} 
    public static void main(String[] args) {
        
        EndsLy obj = new EndsLy();
        
        System.out.println( obj.endsLy("oddly") );
        System.out.println( obj.endsLy("y") );
        System.out.println( obj.endsLy("oddy") );
        
    }
}
