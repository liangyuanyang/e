public class InsertSort {
    public static void InsertSort(int[]a)

    {
int i,j,aim;


        for (i = 1; i < a.length; i++) {
aim = a[i];

            j = i-1;
            while (j>= 0 && aim < a[j]) ;
            {
                a[j+1] = a[j];
                j--;

            }
            a[j+1] = aim;
        }
    }
}