package array;

import java.util.Scanner;

public class Testclass06 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s;
	int arr[] = {10,54,13,17,25,30};
	System.out.println("짝수,홀수 입력 : ");
	s=sc.next();
	/*
	 짝 입력 : index번호가 짝수 번째로 출력(0,2,4)
	 	- 10,13,25
	 홀 입력 : 홀수 번째 index (1.3.5)
	 	- 54,17,30
	 */
	for(int i=0; i<arr.length; i++) {
		if(i%2==0) {
			System.out.print(arr[i]+"\t");
		}
		else {
			if(i%2==0) {
			System.out.print(arr[i]+"\t");
		}
	}	
}
	System.out.println("--------------");
	int k=0;
	if(s.equals("짝")){
		k=0;
	}else {k=1;
	
	}
	for( ; k<arr.length; k+=2) {
		System.out.println(k+"."+arr[k]);
	}
	System.out.println("-----------");
	//변수=(조건식)?참인경우:거짓인경우;
	for(int i = (s.equals("짝")?0:1);
								i<arr.length; i+=2) {
		System.out.println(i+"."+arr[i]);
	}
}
}
