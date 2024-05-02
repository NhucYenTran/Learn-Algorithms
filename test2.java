public class test2 {

  public static String reverse(String str) {
    char[] charArray = str.toCharArray();

    int left = 0;
    int right = charArray.length - 1;

    while (left < right) {
        char temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;
        
        left++;
        right--;
    }

    return new String(charArray);
  }
  public static String[] reverseStringList(String[] sL){
    int n = sL.length;
    for (int i = 0; i <n/2; i++) {
      String t="";
      t = sL[i];
      sL[i] = sL[n-1-i];
      sL[n-1-i] =t;   
    }
    String[] s = sL;
    return s;


  }
  // git init
  // git remote and origin url
  // git add .
  // git commit -m".."
  // git push origin master




  public static void main(String[] args) {
    //test command line
    

  }
    
}

  


 
      