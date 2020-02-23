package helloname;

public class HelloName {
    public String helloName(String name){
        
        return "Hello "+name+"!";
        
    } 
    public static void main(String[] args) {
        
        HelloName obj = new HelloName();
        
        System.out.println( obj.helloName("Bob") );
        System.out.println( obj.helloName("Alice") );
        System.out.println( obj.helloName("X") );
        
    } 
}
