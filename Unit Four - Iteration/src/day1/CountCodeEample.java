package day1;

public class CountCodeEample {
public static void main(String[] args) {
    System.out.println("");
}

public int countCode(String str) {
    int numCode = 0;
   
    for (int i = 0; i <= str.length()-4; i++) {
      String co = str.substring(i, i+2);
      String e = str.substring(i+3, i+4);
      if (co.equals("co") && e.equals("e") ){
        numCode++;
      }
    }
   
    return numCode;
  }


}
