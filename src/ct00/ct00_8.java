package ct00;

public class ct00_8 {
//배열 두배 만들기
	   public int[] solution(int[] numbers) {
	        int[] answer = new int [numbers.length];
	        for(int i = 0; i<numbers.length; i++) { 
	            answer[i] =  numbers[i]*2;
	        }
	        return answer;
	    }
	}
