
//선택정렬,삽입정렬 각자 구현해오는데 배열값은 랜덤으로받고 구현
/*
 * 선택정렬 : 배열에서 최소값을 찾아서 배열 좌측에 하나씩 정렬
 */
import java.util.Random;

public class Selection {

    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = 0;
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(10);
        }

        SelectionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}