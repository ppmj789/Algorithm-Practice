package alg;

import java.util.Scanner;
import java.util.Arrays;
/*
 * 버블소트 구현 (Bubble Sort)
 * 앞원소와 뒤원소를 비교해 앞이 더 크다면 자리를 바꿔준다
 * 이 과정을 배열의 크기 -1 만큼 반복하는 정렬이다
 */
public class BubbleSort{
	public static void main(String args[]) {

		int[] arr = {1, 12 , 10 ,3, 4, 6, 76, 54, 43}; // 임의로 배열 설정
		int size = arr.length;
		
		System.out.println(Arrays.toString(arr)); // 초기 배열 출력
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=0;j<size-1;j++) {
				if(arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr)); // 결과 배열 출력
		
		}
	
}
