package q대소문자바꿔서출력하기;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();
		
		//선행학습자용 풀이
	      for (int i = 0; i < a.length(); i++) {
	          char c = a.charAt(i);
	          char r = '\0';
	          if (Character.isUpperCase(c)) {
	             r = Character.toLowerCase(c);
	          } else {
	             r = Character.toUpperCase(c);
	          }
	          System.out.print(r);
	       }
		
		//배운대 까지 지식으로 풀이
//		for (int i = 0; i < a.length(); i++) {
//			char c = a.charAt(i);
//			if ('A' <= c && c <= 'Z') { // 대문자인 경우
//				System.out.print((char) (c + 32));
//			} else { // 소문자인 경우
//				System.out.print((char) (c - 32));
//			}
//		}

	}

}
