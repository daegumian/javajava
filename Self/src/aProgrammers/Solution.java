package aProgrammers;

import java.util.Arrays;

/*
수열과 구간 쿼리 3
문제 설명
정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.

각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.

위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ arr의 길이 ≤ 1,000
0 ≤ arr의 원소 ≤ 1,000,000
1 ≤ queries의 길이 ≤ 1,000
0 ≤ i < j < arr의 길이
입출력 예
arr	queries	result
[0, 1, 2, 3, 4]	[[0, 3],[1, 2],[1, 4]]	[3, 4, 1, 0, 2]

 */


public class Solution {
	public int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];
		String str1 = "";
		String str2 = "";
		String str3 = "";

		for (int i = 0; i < arr.length; i++) {
			str1 += arr[i];

		}
		System.out.println(str1);

		String[][] stringQueries = new String[queries.length][queries[0].length];

		// 2차원 배열의 값을 String 배열에 저장
		for (int i = 0; i < queries.length; i++) {
		    for (int j = 0; j < queries[i].length; j++) {
		        stringQueries[i][j] = String.valueOf(queries[i][j]);
		    }
		}
		for (int i = 0; i < stringQueries.length; i++) {
		    for (int j = 0; j < stringQueries[i].length; j++) {
		        str2 += stringQueries[i][j];
		    }
		}

		System.out.println(str2);
		
		for (int i = 0; i < stringQueries.length; i++) {
			str1.replaceAll(str2, str3);
		}
		System.out.println(str1);
		return answer;
	}

	public static void main(String[] args) {

		Solution s = new Solution();

		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 3},{1,2},{1,4}};

		System.out.println(s.solution(arr, queries));


	}


}



