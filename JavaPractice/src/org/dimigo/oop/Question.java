/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 3.
 * </pre>
 * 
 * @author		: LimBeongjun
 * @version		: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String[] questions={"가장 좋아하는 가수는?","가장 좋아하는 배우는?","가장 좋아하는 과목은?"};
		String[] answers={"성소","share","화학"};
		for(int i=0;i<3;i++){
			System.out.printf("%d.%s\n",i+1,questions[i]);
			String answer=scanner.nextLine();
			if(answer.equals(answers[0])) System.out.println("정답입니다!");
			else System.out.println("틀렸습니다!");
		}
		StringBuilder sb=new StringBuilder(questions[0]);
		sb.append("성소입니다").append("\n").append(questions[1]).append("share입니다").append("\n").append(questions[2]).append("화학입니다");
		System.out.println("<<결과출력>>");
		System.out.println(sb);
		
	}

}
