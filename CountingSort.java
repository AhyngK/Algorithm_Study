import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {4,2,4,6,8,1,4,7,9,10,3,98,22};
        System.out.println(Arrays.toString(countingSort(arr)));
    }

    static int[] countingSort(int[] arr){
        // Count 배열 생성을 위한 정렬할 배열의 최대값 찾기
        int biggest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            biggest = Math.max(biggest,arr[i]);
        }
        // 정렬할 배열을 돌며, 원소를 인덱스로 하는 배열에 그 원소가 몇개인지 개수 세기
        int[] sort = new int[biggest+1];
        for (int i = 0; i < arr.length; i++) {
            sort[arr[i]]++;
        }
        // 인덱스를 원소로 개수를 담고 있는 배열을 순회하며 순차적으로 원소 추출
        int[] sorted = new int[arr.length];
        int index = 0;
        for (int i = 0; i < sort.length; i++) {
            while (sort[i]>0){
                sorted[index] = i;
                index++;
                sort[i]-=1;
            }
        }
        return sorted;
    }
}

