/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Operator
 * 
 * 1. 개요 :	디미베네
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 * 
 * @author		: LimBeongjun
 * @version		: 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int salary=1700000,person=3,store=1500;
		long sum=1700000*12*3*1500L;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : "+String.format("%,d",1700000)+'원');
		System.out.println("점포 내 직원 수 : 3명");
		System.out.println("점포 수 : "+String.format("%,d",1500)+'개');
		System.out.println("\n\n연간 인건비 : "+String.format("%,d",sum)+'원');
	}
}
