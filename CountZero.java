public class CountZero {

    public static void main(String[] args) {

        System.out.println(CZero(1200034040,0));
    }

    static int CZero(int n, int c)
    {
        if (n==0) return c;

        if (n%10==0)
            return CZero(n/10, c+1);
        return CZero(n/10,c);
    }
}
