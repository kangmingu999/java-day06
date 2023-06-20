package list;

import java.util.ArrayList;
import java.util.Scanner;

public class Testclass04 {

	public static void main(String[] args) {
	ArrayList<String> arr = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	for(int i = 0; i<3;i++) {
		System.out.println(i+"번째입력");
		String msg = sc.next();
		arr.add(msg);
		//arr.add(sc.next());
		
	}
	
	System.out.println("arr : "+arr);
	
	
	System.out.println("찾는 값 입력 >>> ");
	String search = sc.next();
	System.out.println("constain : " + arr.contains(search));
	System.out.println("indexof : "+ arr.indexOf(search));
	}

}
