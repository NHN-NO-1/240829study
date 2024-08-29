import java.util.Random;
import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] array) {

        // 1번 인덱스부터 key로 설정
        for (int i = 1; i <= array.length - 1; i++) {
            int keyIndex = i;
            int sortIndex = keyIndex - 1; // 비교대상은 key-1 부터 0 까지

            for (int j = sortIndex; j >= 0; j--) { // 비교대상은 key-1 부터 0 까지
                if (array[keyIndex] < array[j]) { // array[3]보다 array[2]이 크면 / {8,2}
                    swap(array, keyIndex, j); // key(3)와 앞(2)의 자리변경 / {2,8}
                    keyIndex = j; // key의 index를 3에서 2로 바꿔줌
                }
            }

        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

class Test2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[random.nextInt(10) + 5]; // 배열 사이즈 범위는 5~10

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100); // 0부터 100까지의 숫자
        }

        // 정렬전
        System.out.println(Arrays.toString(arr));
        // 정렬후
        InsertionSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
