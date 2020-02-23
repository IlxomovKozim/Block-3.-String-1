package firsthalf;

public class FirstHalf {
    public String firstHalf(String str){
    
        int length = str.length()/2;
        String sub = str.substring(0, length);
        return sub;
        
}  
    public static void main(String[] args) {
        
        FirstHalf obj = new FirstHalf();
        
        System.out.println( obj.firstHalf("WooHoo") );
        System.out.println( obj.firstHalf("HelloThere") );
        System.out.println( obj.firstHalf("abcdef") );
        
    } 
}
