package startword;

public class StartWord {
    public String startWord(String str, String word){

        if(word.length() > 0 ){
            String sub1  = str.substring( 1, word.length() );
            String sub2 = word.substring( 1 );
            if( sub1.equals(sub2)){
                return  str.substring( 0, word.length() );
            }
        }
        return "";
} 
    public static void main(String[] args) {
       
        StartWord obj = new StartWord();
        
        System.out.println( obj.startWord("hippo", "hip") );
        System.out.println( obj.startWord("hippo", "xip") );
        System.out.println( obj.startWord("hippo", "i") );
        
        
    }
}
