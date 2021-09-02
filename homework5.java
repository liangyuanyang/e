import Java.util.Scanner;
public class homework5 {
       public static void main(String[] args) {
             System.out.println("请你输入一个数字a（其中a代表要输入数的个数）:");
             Scanner sc=new Scanner(System.in);
             int a = sc.nextInt();
             int[] arr=new int[a];
             int sum = 0;
             for (int i = 0;i < arr.length;i++) {
                   arr[i]=sc.nextInt();
            }for(int i:arr)  {
                   sum+=i;
            }int average;
            average=sum/a;

            if(a>average) {
                    System.out.println(a);
                   }
             }
}
