import java.util.Scanner;

/**
* 3개의 합이 M을 넘지 않는 가장 큰 수 만들기
 */
public class BOJ_2798_블랙잭 {
    static int max_cards = 3;
    static int arr[];
    static int N,M;
    static int max = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr= new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=sc.nextInt();
        }

        comb(0,0,0);
        System.out.println(max);
    }

    private static void comb(int i,int cnt, int sum) { // 확정 카드 갯수, 찾기 시작할 카드 번호, 카드들 합
        if(i>=max_cards){
            if(sum>max) max = sum;
            return;
        }
        for (int j = cnt; j < N; j++) {
            if(sum+arr[j]<=M) {
                comb(i+1,j+1,sum+arr[j]);
            }
        }
    }
}
