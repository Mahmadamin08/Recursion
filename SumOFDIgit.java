public class SumOFDIgit {

    public static void main(String[] args) {
        System.out.println(Sum(1234564));
    }

    static int Sum(int n)
    {
        if (n==0) return n;

        return n%10+Sum(n/10);
    }
}
