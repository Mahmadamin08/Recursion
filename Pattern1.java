public class Pattern1 {

    public static void main(String[] args) {

        P1(5,0);
        System.out.println();
        P2(5,0);
    }

    static void P1(int r, int c)
    {
        if (r==0) return;

        if (r>c)
        {
            System.out.print("* ");
            P1(r,c+1);
        }
        else {
            System.out.println();
            P1(r-1,0);
        }
    }

    static void P2(int r, int c)
    {
        if (r==0) return;

        if (r>c)
        {
            P2(r,c+1);
            System.out.print("* ");
        }
        else {
            P2(r-1,0);
            System.out.println();
        }
    }
}
