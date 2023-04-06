package ct00;

public class ct01_7 {
//크기가 작은 부분문자열
    public int solution(String t, String p) {
        int answer = 0;
        int length = t.length() - p.length() + 1;
        for (int i = 0; i < length; i++){
            if(Long.parseLong(p) >= Long.parseLong(t.substring(i,i+p.length())))answer++;
        }
        return answer;
    }
}
