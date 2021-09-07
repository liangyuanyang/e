
public class homework3{
    public static  int fun1(int a1,int b1){
          int c;
                  c=a1%b1;
                  while (c>0)
                  {a1=b1; b1=c; c=a1%b1;       }
                  return b1;
                  }
public static void main(String[] args) {
        int a,b,temp;
        int m;
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        if(a<b)     {
        temp=a;a=b;b=temp;   }
        m=fun1(a,b);
        System.out.println("最大公约数为："+m);
        System.out.println("最大公倍数为：(a*b)/m)");
        }
}