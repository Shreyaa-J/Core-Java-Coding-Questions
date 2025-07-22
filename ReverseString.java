public class ReverseString{
  public static void main(String args[]){
    String str="Hello";
    //Using CharAt(int index) method
    for(int i=str.length()-1;i>=0;i--){
      system.out.print(str.charAt(i));
    }

    //Using char Array
    char[] chArr =str.toCharArray();
    for(int i=chArr.length()-1;i>=0;i--){
      system.out.print(chArr[i]);
    }

    //Using String Builder
    StringBuilder sb=new StringBuilder(str);
    system.out.println(sb.reverse());
    
  }
