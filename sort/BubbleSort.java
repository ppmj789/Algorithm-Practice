package alg;

import java.util.Scanner;
import java.util.Arrays;
/*
 * �����Ʈ ���� (Bubble Sort)
 * �տ��ҿ� �ڿ��Ҹ� ���� ���� �� ũ�ٸ� �ڸ��� �ٲ��ش�
 * �� ������ �迭�� ũ�� -1 ��ŭ �ݺ��ϴ� �����̴�
 */
public class BubbleSort{
	public static void main(String args[]) {

		int[] arr = {1, 12 , 10 ,3, 4, 6, 76, 54, 43}; // ���Ƿ� �迭 ����
		int size = arr.length;
		
		System.out.println(Arrays.toString(arr)); // �ʱ� �迭 ���
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=0;j<size-1;j++) {
				if(arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr)); // ��� �迭 ���
		
		}
	
}
