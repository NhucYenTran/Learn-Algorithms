import java.util.Arrays;

public class Sort {
    static void Swap(int[] arr,int a,int b){
        if (a != b){

            arr[a] = arr[a]+arr[b];
            arr[b] = arr[a]-arr[b];
            arr[a] = arr[a]-arr[b];
        }

    }
    static void bubbleSort(int[] a){
        int n = a.length;
        for (int i = 0; i <n-1; i++) {
            for (int j = 0; j <n-1-i; j++) {
                if (a[j] < a[j+1]){
                    Swap(a, j, j+1);

                }
                 
            }
            
        }
    }
    static void selectionSort(int a[]){
        int n= a.length;
        for (int i = 0; i < n-1; i++) {
            int maxIndex = i;
            for (int j = i+1; j < n; j++) {
                if (a[j] < a[maxIndex]){
                    maxIndex =j;

                }          
            }
            Swap(a, i,maxIndex);
            
        }

    }
    static void insertionSort(int[] a){
        int n= a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 ;j--) {
                if (a[j] < a[j-1]){
                    Swap(a, j-1, j);
                }
            }  
        }
    }
    
}
