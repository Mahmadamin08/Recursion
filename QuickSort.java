import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[]arr={4,6,7,4,3,1,1};
        Quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void Quick(int[]arr, int low, int high)
    {
        if (low>=high)
            return;

        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        int pivot=arr[m];   // pivot game e lai sakay s e chale and e bhi chale . ANS badha ma same j ave Pan ComplexCity ma  farak pade thodo

        while (s<=e)
        {
            while (arr[s]<pivot)
            {
                s++;
            }
            while (arr[e]>pivot)
            {
                e--;
            }
            if (s<=e)
            {
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }

        Quick(arr,low,e);
        Quick(arr,s,high);
    }
}
