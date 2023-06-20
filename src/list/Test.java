package list;

import java.util.Scanner;

public class Test {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String[] id = new String[5];
	String[] pwd = new String[5];
	int num;
	String a,b;
	System.out.println("번호 입력 : ");
	num = sc.nextInt();
	if(num==1) {
		System.out.println("1. 아이디 입력 :");
		a = sc.next();
		System.out.println("2. 비밀번호 입력 :");
		b = sc.next();
			if(a.equals(id)&& b.equals(pwd)) {
				System.out.println("1. 비밀번호 변경\n 2. 아이디 삭제");
				num = sc.nextInt();
					if(num==1){
						
				}	
					if(num==2) {
						
					}
					else{
						if(a.equals(id)&&!b.equals(b)) {
							System.out.println("비밀번호가 틀렸습니다.");
						}
						if(!a.equals(id)&&b.equals(b)) {
							System.out.println("아이디가 틀렸습니다.");
						}
					}
			}
	if(num==2) {
		System.out.println("저장할 id 입력");
		id = input.next();
		System.out.println("저장할 pwd 입력");
		b =add.String[pwd];
	}
	}

	}

}
