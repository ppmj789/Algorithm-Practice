package alg;

import java.util.Scanner;
import java.util.Arrays;
/*
 * 선택정렬 구현 (Selection Sort)
 */
public class SelectionSort{
	public static void main(String args[]) {

		int[] arr = {1, 12 , 10 ,3, 4, 6, 76, 54, 43}; // 임의로 배열 설정
		int size = arr.length;
		
		System.out.println(Arrays.toString(arr)); // 초기 배열 출력
		
		for(int i =0;i<arr.length;i++) {
			
			int max = 0;
			int maxIndex = 0;
			
			for(int j =0;j<size;j++) {
				
				if (max<arr[j]) {
					max = arr[j];
					maxIndex = j;
				}
			
		}
			//가장 큰 값을 제일 끝 배열로 옮기고, size 변수를 줄임으로서 그 앞에서만 탐색을 이어 나감
			int temp = arr[size-1];
			arr[size-1] = arr[maxIndex];
			arr[maxIndex] = temp;
			
			size --; 
	}
		System.out.println(Arrays.toString(arr));
		
		}
	
}
