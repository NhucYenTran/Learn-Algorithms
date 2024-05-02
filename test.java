import java.math.BigInteger;
import java.util.ArrayList;

public class test {

    public static String[] addition(String str1,String str2){
        String[] number1 = test2.reverseStringList(str1.split(""))  ;
        String[] number2 = test2.reverseStringList(str2.split("")) ;
        int lnumber1 = number1.length,lnumber2 = number2.length;
        int lMax = ( lnumber1 > lnumber2) ? lnumber1:lnumber2;
        int lMin = ( lnumber1 < lnumber2) ? lnumber1:lnumber2;
        ArrayList<String> result = new ArrayList<>();
        int rememberValue = 0;
        for (int i = 0; i < lMin; i++) {
            int num1 = Integer.parseInt(number1[i]);
            int num2 = Integer.parseInt(number2[i]);
            int res = num1 + num2 + rememberValue;
            
            if (res <10){
                result.add(String.valueOf(res))  ;
                rememberValue = 0;
            }
            else{
                result.add( String.valueOf(res % 10));
                rememberValue = res /10;        
            }       
        }

        String[] nlm = (lnumber1 == lMax) ? number1 : number2;
        for (int i = lMin; i < nlm.length; i++) {
            int num = Integer.parseInt(nlm[i]) + rememberValue;
            if (num <10){
                result.add(String.valueOf(num));
                rememberValue =0;
            }
            else{
                result.add(String.valueOf(num % 10)) ;
                rememberValue = num /10;
            }     
        }
        result.add(String.valueOf(rememberValue));
        int resultSize = result.size();
        if (result.get(resultSize-1).equals("0")){
            result.remove(resultSize-1);
            resultSize--;
        }
        String[] outpuString =new String[resultSize];
        for (int i = 0; i < outpuString.length; i++) {
            outpuString[i] = result.get(i);
        }
        return test2.reverseStringList(outpuString);   
    }

    public static void main(String[] args) {
        String s1 ="9999974452129454632234343449996",s2="995887348545454545454244423255446634348866";
        String[] result = addition(s1, s2); 
        String resulString ="";

        for (String string : result) {
            resulString += string;
            System.out.print(string);
        }
        System.out.println();
        BigInteger n1 = new BigInteger(s1);
        BigInteger n2 = new BigInteger(s2);

        BigInteger r = n1.add(n2);
        System.out.println(r);
        
        if (resulString.equals(String.valueOf(r))){
            System.out.println(true);

        }

        


   
      
    }
}

