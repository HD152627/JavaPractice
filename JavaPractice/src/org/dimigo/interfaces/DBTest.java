/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ DBTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 * 
 * @author		: LimBeongjun
 * @version		: 1.0
 */
public class DBTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IDBManager[] dbs={IDBManager.getDBObject(IDBManager.ORACLE_DATABASE),IDBManager.getDBObject(IDBManager.SYBASE_DATABASE)};
		System.out.println("<<변경전>>");
		crud(dbs[1]);
		System.out.println();
		System.out.println("<<변경후>>");
		crud(dbs[0]);
	}
	private static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
	}
}
