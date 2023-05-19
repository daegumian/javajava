package aProgrammers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
주사위 게임 3
문제 설명
1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.

네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.

제한사항
a, b, c, d는 1 이상 6 이하의 정수입니다.
입출력 예
a	b	c	d	result
2	2	2	2	2222
4	1	4	4	1681
6	3	3	6	27
2	5	2	6	30
6	4	2	5	2
 */


public class Solution {

	public int solution(int a, int b, int c, int d) {
		int answer = 0;
		List<Integer> list = new ArrayList<>();

		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);

		Collections.sort(list);
		if(list.get(1)==list.get(2) && list.get(0) < list.get(3)) {
			Collections.reverse(list);
			if(list.get(0)>list.get(1)) {
				Collections.reverse(list);
			}
		}
		System.out.println(list.toString());
		int num1 = list.get(0); 
		int num2 = list.get(2); 

		if(a == b && b == c && c == d && d == a) { // p = 4

			answer = a*1111;
		}

		else if(num1 !=list.get(3) && num1 ==list.get(1) && num1 == num2 && num2 != list.get(3)) { // p = 3, q = 1

			answer = (10 * num1 + list.get(3))*(10 * num1 + list.get(3));
		}

		else if(num1 != num2 && num1==list.get(1) && num2==list.get(3)) { // p = 2, q = 2

			answer = (num1 + num2) * Math.abs((num1 - num2));
		}

		else if(num1 != list.get(1) && list.get(1) != num2 && num2 != list.get(3) && num1 != list.get(3)) { // p = 1, q = 1, r = 1, s = 1 

			answer = Collections.min(list);
		}

		else { // p = 2, q = 1, r = 1

			if(num2==list.get(3)) {
				answer = num1 * list.get(1);
			}
			else if(list.get(1)==num2) {
				answer = num1 * list.get(3);
			}
			else {
				answer = num2 * list.get(3);
			}
		}
		
		return answer;
	}		

	public static void main(String[] args) {

		Solution s = new Solution();
		int[] arr = {1, 4, 2, 5, 3};

		System.out.println(s.solution(4,4,	3,	6));


	}


}




