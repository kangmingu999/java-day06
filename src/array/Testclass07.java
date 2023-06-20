package array;

import java.util.Scanner;

public class Testclass07 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String[] id = new String[5];
	String[] pwd = new String[5];
	int num;
	System.out.println("1.로그인\n2.회원가입\n3.모든 회원보기\n>>>>>> :  ");
	num = sc.nextInt();
	if(num==1) {
		System.out.println("비교 id 입력 :");
		id = sc.next();
		System.out.println("비교 pwd 입력 :");
		pwd = sc.next();
	}
	if(num==2) {
		
	}
	if(num==3) {
		if(id==null && pwd==null) {
			System.out.println("저장된 정보가 없습니다.");
		}if(id =!null && pwd =!null) {
		}
	}
}
}
