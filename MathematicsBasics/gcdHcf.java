/**
 * 
 */
package MathematicsBasics;

/**
 * @author vishw
 *
 */
public class gcdHcf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(gcd(14,36));
		System.out.println(gcdModified(60,15));

	}

	private static int gcdModified(int i, int j) {
		// TODO Auto-generated method stub
		if(i<j) return gcdModified(j,i);
		if(j==0) return i;
		return gcdModified(i%j,j);
		
	}

	private static int gcd(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i +" i and j "+j);
		if(i==j) return i;
		if(i<j) return gcd(j,i);
		return gcd(i-j,j);
	}

}
