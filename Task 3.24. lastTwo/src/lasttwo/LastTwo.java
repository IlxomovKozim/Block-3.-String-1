package lasttwo;

public class LastTwo {
    public String lastTwo(String str){
    
        StringBuilder sb = new StringBuilder(str);
        
        String subFirst = str.substring(0, str.length()-2);
        String subLast = str.substring(str.length()-2, str.length());
        String rvr = new StringBuffer(subLast).reverse().toString();
        return subFirst.concat(rvr);
        
 } 
    
    public static void main(String[] args) {
        
           LastTwo obj = new LastTwo();
           
        System.out.println( obj.lastTwo("coding") );
        System.out.println( obj.lastTwo("cat") );
        System.out.println( obj.lastTwo("ab") );
                
    }
}
