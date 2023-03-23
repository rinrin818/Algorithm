package ct00;
//배열의 평균값
public class ct00_6 {
	    public double solution(int[] numbers) {
	        double answer = 0;
	        double result = 0; //연산을 위해 초기값 0으로 선언
	    for(int i = 0; i < numbers.length; i++)
	        result += numbers[i];
	    // numbers 배열에 저장된 값을 모두 추출하여 result 변수에 다 더한다. 
	        answer = result/numbers.length;
	        return answer;
	    }
	}
