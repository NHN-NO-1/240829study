//선택 정렬
/*
    1. 주어진 배열 중에서 최솟값을 찾는다.
    2. 최솟값을 첫번째 값과 교체한다.
    3. 반복
    4. 값이 가장 작은 순부터 배열된다.*/

    import java.util.Random;

    public class select {
        public static void main(String[] args) {
            //랜덤값 배열 만들기
            int n = 5;
            int[] list = new int[n];
            Random random = new Random();
    
            for(int i=0; i<n; i++){
                list[i] = random.nextInt(100)+1;
                for(int j=0; j<i; j++){
                    if(list[i]==list[j]){
                        i--;
                    }
                }
            }
    
            for(int i=0; i<n; i++){
                System.out.println(list[i]);
            }
            System.err.println("\n");
    
            //최솟값 찾기
            int temp=0;
            int min=0;
    
            for(int i=0; i<n; i++){
                min=i;
                for(int j=i+1; j<n; j++){
                    if(list[min] > list[j]){
                        min = j;
                    }
                }
                if(min != i){
                    temp = list[i];
                    list[i] = list[min];
                    list[min] = temp;
                }
            }
    
            for(int i=0; i<n; i++){
                System.out.println(list[i]);
            }
        }
    }
    