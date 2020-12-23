import java.util.*;

public class MakeStars {
  public static void main(String[]args){
    Scanner n=new Scanner (System.in);
    while (n.hasNext()){
      String temp=n.nextLine();
      String output="";
      for (int i=0;i<temp.length();i++){
        if (temp.charAt(i)==(' ')){
          output=output+" ";
        }
        output=output+"*";
      }
      System.out.println(output);
    }
  }
}
