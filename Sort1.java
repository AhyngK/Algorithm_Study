public class Sort1 {
    public static void main(String[] args) {
        int [] arr = {1,5,2,8,3,5,8,3,1,6,0,3,5,7,2};
        int [] arr2 = arr.clone();
        int [] arr3 = arr.clone();

        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arr);
        System.out.println();

        InsertionSort is = new InsertionSort();
        is.insertionSort(arr2);
        System.out.println();

        SelectionSort ss = new SelectionSort();
        ss.selectionSort(arr3);
        System.out.println();
    }
}

class BubbleSort{
    // 사이클 1회 당 가장 우선순위가 낮은(오름차순의 경우 큰 수)가 뒤에서 자리를 잡는다
    void bubbleSort(int[] arr){
        // 사이클은 배열의 길이만큼 돌려야 한다
        for (int i = 0; i < arr.length; i++) {
            // 내부 사이클은 사이클 1회당 1자리의 확보가 보장되므로 i번째 사이클에는 i만큼의 자리는 정렬됨
            // j+1과 비교하기 때문에 범위에서 -1을 추가로 해줌
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
}

class InsertionSort{
    void insertionSort(int [] arr){
        // 정렬할 배열의 각 원소의 비교 차례가 한번씩 돌아와야 함으로 배열 길이로 범위 설정
        for (int i = 1; i < arr.length; i++) {
            // i번째 원소를 그 앞의 원소들과 비교해 나가야 함으로 j를 i로 설정, 1이 될때까지 진행
            for (int j = i; 0<j; j--) {
                if(arr[j]>=arr[j-1]){
                    break;
                }
                else {
                    // 데이터 정렬을 바로 진행하며 비교함
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] =temp;
                }
            }
        }
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
}

class SelectionSort{
    void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int index =i;
            // 배열의 최소값을 찾고 인덱스 저장
            // j는 i 이후의 원소들이 되어야 함으로 i+1부터 시작한다
            for (int j = i+1; j <arr.length; j++) {
                if(arr[index]>arr[j]){
                    index =j;
                }
            }
            // 만약 찾은 인덱스가 i라면, 제자리에 있는 것이므로 놔둔다
            // index가 다를 경우, i번째 원소와 자리바꿈, 그럼 i자리에는 정상적인 순서로 들어감
            if(index==i){
                continue;
            }
            else {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
}
