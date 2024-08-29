import java.util.Random;

public class Insertion {

    public static void InsertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int temp=0;
            int index=i; // 기준점이 되는 인덱스
            for(int j=i-1; j>=0; j--){ // 역순으로 비교
                if(arr[index]<arr[j]){ //기준점보다 작으면 자리교체
                    temp=arr[j];
                    arr[j]=arr[index];
                    arr[index]=temp;
                    index=j; //기준점을 바꾼 인덱스로 대입
                }
            }

        }
    }  

    public static void main(String[] args) {
        int[] arr=new int[10];
        for(int i=0; i<arr.length; i++){
            Random random=new Random();
            arr[i]=random.nextInt(10);
        }

        InsertionSort(arr);
        
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}