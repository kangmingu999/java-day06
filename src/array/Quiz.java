package array;

import java.util.Scanner;

public class Quiz {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s;
	int arr[] = {10,54,13,17,25,30};
	System.out.println("짝수,홀수 입력 : ");
	s=sc.next();
	for(int i=0; i<arr.length; i++) {
		if(arr[i]%2==0) {
			System.out.println("짝수 : "+arr[i]);
		}
		else {
			if(arr[i]%2==0) {
			System.out.println("홀수 : "+arr[i]);
		}}
		
	}
}
}
