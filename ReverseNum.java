public class ReverseNum {

    public static void main(String[] args) {
        int n=1234;

        int digit=((int)Math.log10(n))+1;

        rev1(n);
        System.out.println(s);

        System.out.println("2nd Type");
        System.out.println(helper(n,digit));

    }
    static int s=0;
    static void rev1(int n )
    {
        if (n==0) return ;
        s=s*10+ (n%10);
        rev1(n/10);
    }

    // 2nd Type

    static int helper(int n, int digits)
    {
        if (n<10) return n;

        return ((n%10)*(int) Math.pow(10,digits-1) + helper(n/10, digits-1));
    }
}
