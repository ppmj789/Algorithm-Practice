package alg;

import java.util.Scanner;
import java.util.Arrays;
/*
 * �������� ���� (Selection Sort)
 */
public class SelectionSort{
	public static void main(String args[]) {

		int[] arr = {1, 12 , 10 ,3, 4, 6, 76, 54, 43}; // ���Ƿ� �迭 ����
		int size = arr.length;
		
		System.out.println(Arrays.toString(arr)); // �ʱ� �迭 ���
		
		for(int i =0;i<arr.length;i++) {
			
			int max = 0;
			int maxIndex = 0;
			
			for(int j =0;j<size;j++) {
				
				if (max<arr[j]) {
					max = arr[j];
					maxIndex = j;
				}
			
		}
			//���� ū ���� ���� �� �迭�� �ű��, size ������ �������μ� �� �տ����� Ž���� �̾� ����
			int temp = arr[size-1];
			arr[size-1] = arr[maxIndex];
			arr[maxIndex] = temp;
			
			size --; 
	}
		System.out.println(Arrays.toString(arr));
		
		}
	
}
