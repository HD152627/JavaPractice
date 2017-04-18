/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ PiggyBankTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 * 
 * @author		: LimBeongjun
 * @version		: 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FamilyMember[] a={
				new FamilyMember("아빠"),
				new FamilyMember("엄마"),
				new FamilyMember("나"),
				new FamilyMember("남동생")
		};
		int[] amounts = {10000,5000,2000,1000,1000};
		FamilyMember.printMemberCnt();
		for(int i=0;i<4;i++){
			PiggyBank.putMoney(a[i], amounts[i]);
		}
		PiggyBank.printBalance();
		PiggyBank.putMoney(a[2], amounts[4]);
		PiggyBank.printBalance();
	}

}
