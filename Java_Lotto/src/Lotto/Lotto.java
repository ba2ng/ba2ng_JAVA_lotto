package Lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lotto {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for(int i=1; i<=45; i++) {
			numbers.add(i);
		}
		
		//배열 랜덤으로 섞기
		Collections.shuffle(numbers);
		
		//numbers의 임의의 숫자 6개 뽑기
		int[] pick = new int[6];
		for(int i=0; i<6; i++) {
			pick[i] = numbers.get(i);
		}
		
		//Arrays.toString : 배열 내용 출력
		System.out.println(Arrays.toString(pick));

	}

}
