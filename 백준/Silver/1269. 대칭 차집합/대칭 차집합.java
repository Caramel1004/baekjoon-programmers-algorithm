import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sizeOfA = Integer.parseInt(st.nextToken());
        int sizeOfB = Integer.parseInt(st.nextToken());

        Set<Integer> setA = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < sizeOfA; i++){
            setA.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> setB = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < sizeOfB; i++){
            setB.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;
        Set<Integer> diffSet = new HashSet<>(setA);
        diffSet.removeAll(setB);
        count += diffSet.size();
        
        diffSet = new HashSet<>(setB);
        diffSet.removeAll(setA);
        count += diffSet.size();
        
        System.out.print(count);
    }
}