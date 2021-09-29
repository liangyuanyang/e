import java.util.Arrays;
public class shellSort {
    public static void shellSort(int[] arr){
        int [] count = new int[]{23, 33, 6, 88, 44};
        for(int gap = arr.length/2; gap > 0; gap /= 2){
            for(int i = 0; i < gap; i++){
                for (int j = i + gap; j < arr.length; j += gap){
                    int insertData = arr[j];
                    int insertIndex;
                    insertIndex = j - gap;
                    while (insertIndex >= 0 && insertData < arr[insertIndex]){
                        arr[insertIndex + gap] = arr[insertIndex];
                        insertIndex -= gap;
                    }
                    if (insertIndex + gap != j){
                        arr[insertIndex + gap] = insertData;
                    }
                }
            }
            System.out.println("第" +count+ "次分组排序后：");
            System.out.println(Arrays.toString(arr));
        }
    }
}
