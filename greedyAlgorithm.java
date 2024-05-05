import java.util.Arrays;

public class greedyAlgorithm {
    static int[] greedyAlgorithms(int[] a ,int s){
        Sort.bubbleSort(a);
        int countWeight = 0;

        for (int i = 0; countWeight <= s ; i++) {
            a[i] = s /a[i];
            countWeight +=a[i];
        }
        return  a;
    }

}
