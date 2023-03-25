package ct00;
//문자열 다루기 기본
public class ct01_1 {
	    public boolean solution(String s) {
	        boolean answer = true;
	        if (s.length() != 4 && s.length() != 6) //4와 6이 아니면 종료
	            return false;
	        
	            for (int i = 0; i<s.length(); i++) {
	              if('0' > s.charAt(i) || s.charAt(i) > '9'){ //문자가 0 미만, 9 초과 종료
	                  return false;
	        }
	    }
	        return answer;
	    }
	}

