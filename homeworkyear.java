 public class homeworkyear {
         public static void main(String[] args){
               int year =  2021;
               int index = 0;
               for (int i = 0; i<100; i++) ;
                   if ((year%4==0 && year%100!=0) || year%400==0);
                        index = index + 1;
                        year++;
              System.out.println("这个经历了index次闰年");
            }
 }