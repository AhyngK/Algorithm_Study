import java.util.ArrayList;
import java.util.List;

public class Sieve {
    public static void main(String[] args) {
        int N = 100;
        sieve(N);
    }
    // 에라토스테네스의 체로 n보다 작은 소수를 구하는 방법
    static void sieve (int n){
        // 2-n까지의 정수를 리스트에 모두 추가, 소수를 담을 리스트 생성
        List<Integer> nums = new ArrayList<>();
        List<Integer> demical = new ArrayList<>();
        for (int i = 2; i <=n ; i++) {
            nums.add(i);
        }
        while (nums.size()>0){
            for (int i = 2; i*nums.get(0)<=n ; i++) {
                // 리스트에서 객체를 제거 할 경우, 객체 타입으로 선언해서 삭제해주어야 함 new Integer() 방식으로
                nums.remove(new Integer(i*nums.get(0)));
            }
            demical.add(nums.remove(0));
        }
        System.out.println(demical);
    }
}
