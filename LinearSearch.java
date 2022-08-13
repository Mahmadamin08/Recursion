import java.util.ArrayList;
import java.util.List;

public class LinearSearch {

    public static void main(String[] args) {

        int[]arr={1,2,3,4,5,6,6,6,6,7,8};
        System.out.println(Linear(arr,7,0));
        System.out.println(CLinear(arr,9,0));
        AddToList(arr,6,0);
        System.out.println(l);
        System.out.println(ReturnList(arr,new ArrayList<>(), 6,0));
        System.out.println(ReturnListWithOutParameter(arr,6,0));
    }

    static int Linear(int[]arr, int t, int i)
    {
        if (i==arr.length-1)
            return -1;
        if (arr[i]==t)
            return i;
        return Linear(arr,t,i+1);
    }

    static boolean CLinear(int[]arr, int t, int i)
    {
        if (i==arr.length-1)
            return false;

        return arr[i]==t || CLinear(arr,t,i+1);
    }

    static List<Integer>l=new ArrayList<>();
    static void AddToList(int[]arr, int t, int i)
    {
        if (i==arr.length-1)
            return;
        if (arr[i]==t)
            l.add(i);
        AddToList(arr,t,i+1);
    }

    static ArrayList<Integer> ReturnList(int[] arr, ArrayList<Integer>l, int t, int i)
    {
        if (i==arr.length-1)
            return l;
        if (arr[i]==t)
            l.add(i);
        return ReturnList(arr,l,t,i+1);
    }


    static ArrayList<Integer> ReturnListWithOutParameter(int[]arr, int t, int i)
    {
        ArrayList<Integer> list= new ArrayList<>();

        if (i==arr.length-1)
            return list;
        if (arr[i]==t)
            list.add(i);

        ArrayList<Integer> prevCallList= ReturnListWithOutParameter(arr,t,i+1);
        list.addAll(prevCallList);
        return list;
    }
}
