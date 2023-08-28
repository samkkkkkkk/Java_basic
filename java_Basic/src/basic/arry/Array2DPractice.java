package basic.arry;

import java.util.Arrays;

public class Array2DPractice {

	public static void main(String[] args) {
		
		
		/*
		 # 2차원 배열
		 - 배열 안에 배열이 존재하는 형태를 2차원 배열이랑고 합니다.
		 - 실제 배열에는 배열의 주소값이 들어가게 됩니다.		 
		 */
		
		int[][] arr = {
				{1, 2, 3, 4},
				{5, 6, 7, 8, 9},
				{10, 11, 12, 13, 14}
				
		};
		
		System.out.println(arr.length); // arr이 가지고 있는 배열의 개수 : 3
		System.out.println(arr); // arr의 주소값을 가리킨다.
		System.out.println(Arrays.toString(arr)); // arr안에 있는 배열들의 주소값을 가리킨다.
		System.out.println(Arrays.deepToString(arr)); // arr배열안에 있는 배열안에 있는 값을 나타낸다.
		
		
		
		int [][]arr2 = new int [5][5];
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				if(i == j) {
					arr2[i][j] = i;
				}else if(j>i) {
					arr2[i][j] = i;
				}
			}
		}
		
		for(int[] n : arr2) {
			for(int n2 : n) {
				System.out.print(n2 + " ");
			}
			System.out.println();
		}
				
		
		
		
		

	}

}
