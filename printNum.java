public class printNum {

    public static void main(String[] args) {
        OnetoN(5);
        System.out.println("N to One");
        NtoOne(5);
    }
    static void OnetoN(int n)
    {
        if (n==0) return;

        OnetoN(n-1);
        System.out.println(n);
    }

    static void NtoOne(int n)
    {
        if (n==0) return;

        System.out.println(n);
        NtoOne(n-1);
    }
}
