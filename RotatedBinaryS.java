public class RotatedBinaryS {

        public static void main(String[] args) {

            int arr[]= {4, 5, 6, 7, 0, 1, 2};
            System.out.println(search(arr,0,0,arr.length-1));
        }

        static int search(int[]arr, int t, int s ,int e)
        {
            if (s>e)
                return -1;

            int m=s+(e-s)/2;

            if (arr[m]==t)
                return m;
            if (arr[s]<=arr[m])
            {
                if (t<=arr[m] && t>=arr[s])
                    return search(arr,t,s,m-1);
                else
                    return search(arr,t,m+1,e);
            }
            if (arr[m]<=t && arr[e]>=t)
                return search(arr,t,m+1,e);

            return search(arr,t,s,m-1);
        }
    }

