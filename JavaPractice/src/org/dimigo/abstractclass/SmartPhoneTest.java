/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 16.
 * </pre>
 * 
 * @author		: LimBeongjun
 * @version		: 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone[] ps={new IPhone("애플","iPhone 7",900000),new Galaxy("삼성","갤럭시 S8",800000)};
		for(SmartPhone p:ps){
			System.out.println(p);
			p.turnOn();
			p.pay();
			p.useSpecialFunction(p);
			p.turnOff();
		}
	}

}
