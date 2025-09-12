import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        Queue<Integer> cardBundles = new PriorityQueue<>();
        for (int i = 0; i < size; i++) {
            cardBundles.offer(Integer.parseInt(br.readLine()));
        }

        int acc = 0;
        while (cardBundles.size() > 1) {
            int cardCnt = cardBundles.poll();
            int otherCardCnt = cardBundles.peek() == null ? 0 : cardBundles.poll();
            int sum = cardCnt + otherCardCnt;
            cardBundles.offer(sum);
            acc += sum;
        }
        System.out.print(acc);
    }
}
