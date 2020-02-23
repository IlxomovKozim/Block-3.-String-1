package extraend;

public class ExtraEnd {
    public String extraEnd(String str){

    int length = str.length();
    String new_str = "";
    if(length > 1){
        String sub = str.substring(length-2, length);
        for(int i=0; i<3; i++){
           new_str += sub; 
        }
        return new_str;
    }
    else 
        return str;
        
} 
    public static void main(String[] args) {
        
        ExtraEnd obj = new  ExtraEnd();
         
        System.out.println( obj.extraEnd("Hello") );
        System.out.println( obj.extraEnd("ab") );
        System.out.println( obj.extraEnd("Hi") );
        
    } 
}
