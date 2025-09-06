import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int netuNum = Integer.parseInt(br.readLine());
        int hansuCount = 0;//한수 갯수 
        int tmp = 0;//임시저장 변수 -> 그냥 의미없는 수 담는 변수
        int[] diff;//수 차이 배열

        for (int num = 1; num <= netuNum; num++) {
            tmp = 0;//임시저장
            String[] str = Integer.toString(num).split("");
            diff = new int[str.length - 1];//차이를 순서대로 문자열로 저장 수차이 배열길이 -> ex) 1 | 2 | 3 | 4 작대기가 diff갯수
            if(num < 100){
                hansuCount++;
            }else{
                for (int i = 1; i <= diff.length; i++) {
                    tmp = Integer.parseInt(str[i]) - Integer.parseInt(str[i - 1]);
                    diff[i - 1] = tmp;
                }
                tmp = 0;
    
                for (int i = 0; i < diff.length; i++) {
                    if(diff[0] == diff[i]){
                        tmp++;
                    }
                }
                    
                if(diff.length == tmp){
                    // System.out.println(num); -> 한수 보고 싶으면 주석처리 해제
                    hansuCount++;
                }
            }
        }

        System.out.println(hansuCount);
    }
}
