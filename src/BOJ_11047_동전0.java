import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11047_동전0 {
    static int N,K,coins[];
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line[] = bf.readLine().split(" ");
        N = Integer.parseInt(line[0]);
        K = Integer.parseInt(line[1]);
        coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(bf.readLine());
        }
        System.out.println(addCoin());
    }

    private static int addCoin() {
        int amount =0;
        int coin_cnt=0;
        int num =N-1;
        while(num>=0) {
            int predictAmount = amount+coins[num];
            if(predictAmount<=K){ amount= predictAmount; coin_cnt++;}
            else num--;
            if(amount ==K) break;
        }
        return coin_cnt;
    }
}
