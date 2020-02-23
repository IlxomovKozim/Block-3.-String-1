package mincat;

public class MinCat {
    public String minCat(String a, String b){ 
    
    int lenA = a.length();
    int lenB = b.length();
    int diff = Math.abs(lenA - lenB);
    
        if( lenA > lenB ){
        String sub = a.substring(diff, lenA);
        return sub.concat(b);
    }
        else if( lenA < lenB ){
        String sub1 = b.substring(diff, lenB);
        return a.concat(sub1);
    }
        
    return a.concat(b);
    
} 

    public static void main(String[] args) {
        
        MinCat obj = new MinCat();
        
        System.out.println( obj.minCat("Hello", "Hi") );
        System.out.println( obj.minCat("Hello", "java") );
        System.out.println( obj.minCat("java", "Hello") );
        
    }
}
