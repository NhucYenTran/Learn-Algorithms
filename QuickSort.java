import java.util.Arrays;

public class QuickSort {
    // Hàm QuickSort
    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            // Chọn pivot là phần tử ở giữa
            int pivot = a[(low + high) / 2];
            // Phân hoạch mảng
            int partitionIndex = partition(a, low, high, pivot);
            // Sắp xếp các phần tử bên trái và bên phải của pivot
            quickSort(a, low, partitionIndex - 1);
            quickSort(a, partitionIndex, high);
        }
    }

    // Hàm Partition
    public static int partition(int[] a, int low, int high, int pivot) {
        while (low <= high) { 
            // Di chuyển con trỏ low sang phải cho đến khi a[low] >= pivot
            while (a[low] < pivot)
                low++;
            // Di chuyển con trỏ high sang trái cho đến khi a[high] <= pivot
            while (a[high] > pivot)
                high--;
            // Nếu low <= high, đổi chỗ a[low] và a[high] và di chuyển con trỏ low và high
            if (low <= high) {
                swap(a, low, high);
                low++;
                high--;
            }
        }
        // Trả về điểm phân hoạch
        System.out.println(low);
        return low;
    }

    // Hàm hoán đổi
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] a= {1,0,2,2,9};
        quickSort(a,0, a.length-1);
        for (int i : a) {
            System.out.print(i+" ");
        }
       
    }
}
