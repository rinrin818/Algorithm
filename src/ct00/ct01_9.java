package ct00;

import java.util.ArrayList;
//같은 숫자는 싫어 
public class ct01_9 {

	 public int[] solution(int []arr) {
	        ArrayList<Integer> tempList = new ArrayList<Integer>();
	        int preNum = 10; 
	        for (int num : arr) {
	            if(preNum != num) 
	                tempList.add(num);
	            preNum = num;
	        }
	        int[] answer = new int[tempList.size()]; 
	        for(int i = 0; i < answer.length; i++) {
	            answer[i] = tempList.get(i).intValue();
	        }
	        return answer;
	    }
	}
