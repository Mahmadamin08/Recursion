import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[]arr={4,6,7,4,3,1,1};
        System.out.println(Arrays.toString(mergesort(arr)));
    }

    static int[] mergesort(int[]arr)
    {
        if (arr.length==1)
            return arr;

        int m=arr.length/2;
        int[] left= mergesort(Arrays.copyOfRange(arr, 0,m));
        int[] right= mergesort(Arrays.copyOfRange(arr, m,arr.length));

        return merge(left,right);
    }

    static int[] merge(int[]first, int[]sec)
    {
        int[]ans= new int[first.length+sec.length];
        int index=0;
        int i=0;
        int j=0;

        while (i<first.length && j<sec.length )
        {
            if(first[i]<sec[j])
            {
                ans[index]=first[i];
                i++;
                index++;
            }
            else
            {
                ans[index]=sec[j];
                j++;
                index++;
            }
        }

        while (i<first.length)
        {
                ans[index]=first[i];
                i++;
                index++;
        }

        while (j<sec.length)
        {
            ans[index]=sec[j];
            j++;
            index++;
        }
        return ans;
    }
}
