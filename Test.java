// class Test
// {
//     int a=10;
//     static int b=20;
//     public static void main(String[] args)
//     {
//         int c=30;
//         final int D=40;
//         Test t=new Test();
//         System.out.println(t.a);
//         System.out.println(b);
//         System.out.println(c);
//         System.out.println(D);
//     }    
// }

// import java.util.Scanner;
// class Airthmatic
// {
//     public static void main(String args[])
//     {
//         int a,b;
//         System.out.print("enter data");
//         Scanner obj=new Scanner(System.in);
//         a=obj.nextInt();
//         b=obj.nextInt();
//         System.out.println("Addition "+(a+b));
//         System.out.println("Subtraction "+(a-b));
//         System.out.println("Multiplication "+(a*b));
//         System.out.println("Division "+(a/b));
//         System.out.println("Remainder "+(a%b));
//     }
// }

import java.util.Scanner;
class Test
{
    public static void main(String args [])
    {
        int n;
        System.out.print("Enter number of terms");
        Scanner r=new Scanner (System.in);
        n=r.nextInt();
        for(int i=1; i<=n; i++)
        {
            System.out.print(i + "");
        }
    }
}