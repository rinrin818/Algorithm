package ct00;

public class ct00_7 {
//배열의 유사도
	   public int solution(String[] s1, String[] s2) {
	        int answer = 0;
	        for(int i = 0; i<s1.length; i++) {
	            for(int j = 0; j<s2.length; j++) {
	                if(s1[i].equals(s2[j])) {
	                    answer += 1;
	                 
	                }
	            }
	            
	        }
	        return answer;
	    }
	}