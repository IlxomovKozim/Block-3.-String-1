package makeoutword;

public class MakeOutWord {
    public String makeOutWord(String out, String word){
        
        String sub = out.substring(0, 2);
        String sub1 = out.substring(2, 4);
        return sub+word+sub1;
        
} 
    
    public static void main(String[] args) {
       
         MakeOutWord obj = new  MakeOutWord();
         
        System.out.println( obj.makeOutWord("<<>>", "Yay") );
        System.out.println( obj.makeOutWord("<<>>", "WooHoo") );
        System.out.println( obj.makeOutWord("[[]]", "word") );
         
    }
}
