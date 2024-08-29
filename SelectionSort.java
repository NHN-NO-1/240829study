import java.util.Arrays;
import java.util.Random;

public class SelectionSort{

    public static void selectionSort(int[] array){

        // 총 회전수는 배열길이 -1 만큼
        for (int i = 0 ; i < array.length - 1; i++){
            int smallestIndex =i;
            
            // 매 회전이 끝날때마다 가장작은수가 맨 앞으로 오기때문에 시작지점이 1씩 늘어남
            // 가장 작은 숫자를 탐색한다
            // 가장 작은 숫자와 시작수의 위치를 바꾼뒤 다음 회전을 진행한다
            for (int j = i+1; j < array.length; j++){
                if(array[smallestIndex] > array[j]){
                    smallestIndex = j;
                }            
            }

            swap(array, i, smallestIndex);

        }

    }

    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

class Test{

    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[random.nextInt(10)+5]; // 배열 사이즈 범위는 5~10
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100); // 0부터 100까지의 숫자
        }

        // 정렬 전
        System.out.println(Arrays.toString(arr));
        // 정렬 후
        SelectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));

       
    }

}