public class SortedArray {

    public static void main(String[] args) {

        int[]arr={1,2,3,4,5,9,7};
        System.out.println(Issoeted(arr,0));
    }

    static boolean Issoeted(int[]arr, int index)
    {
        if (index==arr.length-1)
            return true;

        return (arr[index]<arr[index+1] && Issoeted(arr,index+1));
    }
}
