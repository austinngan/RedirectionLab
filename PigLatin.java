import java.util.*;

public class PigLatin {
  public static String pigLatinSimple(String s){
    s=s.toLowerCase();
    String firstChar=s.substring(0,1);
    if (firstChar.equals('a')||firstChar.equals('e')||firstChar.equals('i')||firstChar.equals('o')||firstChar.equals('u')){
      return (s+"hay");
    }
    else{
      return (s.substring(1)+firstChar+"hay");
    }
  }
}
