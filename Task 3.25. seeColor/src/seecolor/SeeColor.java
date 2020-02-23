package seecolor;

public class SeeColor {
    public String seeColor(String str){
    
      String sub = str.substring(0, 4);
      if( str.substring(0, 4).equals("blue") ){
          return "blue";
      }
      if( str.substring(0, 3).equals("red") ){
          return "red";
      }
       return "'";
} 
    public static void main(String[] args) {
        
        SeeColor obj = new SeeColor();
        
        System.out.println( obj.seeColor("redxx") );
        System.out.println( obj.seeColor("xxred") );
        System.out.println( obj.seeColor("blueTimes"));
        
    }
}
