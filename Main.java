import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b=new int[a.length];
        System.arraycopy(a, 0, b, 0, a.length);
        Sort.bubbleSort(b);
        System.out.println(Arrays.toString(b));
        
        greedyAlgorithm.greedyAlgorithms(a, 10);
        System.out.println(Arrays.toString(a));
    
    }
    
}
