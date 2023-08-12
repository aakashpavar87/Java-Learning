// import java.lang;
public class Sorting{
    public static void main(String[] args) {
        int[] arr = {34,12,10,33,23};
        //Bubble sort
        // for(int i=0;i<arr.length-1;i++) {
        //     for(int j=0;j<arr.length-i-1;j++) {
        //         if(arr[j]>arr[j+1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        //Selection Sort
        // int smallest;
        // for(int i=0;i<arr.length-1;i++) {
        //     smallest = i;
        //     for(int j=i+1;j<arr.length;j++) {
        //         if(arr[smallest]<arr[j]) {
        //             smallest = j;
        //         }
        //         int temp = arr[smallest];
        //         arr[smallest] = arr[j];
        //         arr[j] = temp;
        //     }
        // }
        //Insertion Sort
        for(int i=0;i<arr.length;i++) {
            int j=i+1;
            while(arr[i]<arr[j]||j>=0) {
                arr[j] = arr[j+1];
                j--;
            }
            arr[j+1] = arr[i];
        }
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}