import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int[] lottery = new int[6];
        System.out.println("번호 :");
        for(int k = 0; k < 5; k++) {
            for (int i = 0; i < lottery.length; i++) {
                int num = (int) (Math.random() * 45) + 1;
                lottery[i] = num;
                for (int j = 0; i < j; j++) { // 출력 후 중북된 숫자가 나오면 다시 하나 뒤로 간다.
                    if (lottery[i] == lottery[j]) {
                        i--;
                        break;
                    }
                }

            }
        }
        // 오름차순 기능 추가
        for(int i = 0; i<lottery.length; i++){
            for(int j = i+1; j < lottery.length; j++){
                if (lottery[i] > lottery[j]){
                    int temp = lottery[i];
                    lottery[i] = lottery[j];
                    lottery[j] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(lottery));
    }
}