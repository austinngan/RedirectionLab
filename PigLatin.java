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
  public static String pigLatin(String s){
    s=s.toLowerCase();
    String firstChar=s.substring(0,1);
    String[] digraphs= {"bl","br","ch","ck","cl","cr","dr","fl","fr","gh","gl","gr","ng","ph","pl","pr","qu","sc","sh","sk","sl","sm","sn","sp","st","sw","th","tr","tw","wh","wr"};
    if (firstChar.equals('a')||firstChar.equals('e')||firstChar.equals('i')||firstChar.equals('o')||firstChar.equals('u')){
      return (s+"hay");
    }
    if (s.length()>1){
      String firstTwo=s.substring(0,2);
      for (int i=0;i<digraphs.length;i++){
        if (firstTwo.equals(digraphs[i])){
          return s.substring(2)+firstTwo+"ay";
        }
      }
    }
    return (s.substring(1)+firstChar+"hay");
  }
}
