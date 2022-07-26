package Practice;
import java.util.*;
public class SubArraySumZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(check())	;
		
	}
	
	public static boolean check() {
		int a[]= {1,2,4,5,-1,2,-5,-1};
		int n=8;
		Set<Integer> set =new HashSet<>();
		int sum=0;
		for(int i=0;i<n;i++) {
			sum +=a[i];
			if(set.contains(sum)) {
//				System.out.print("Yes Present");
//				break;
				return true;
			}
			set.add(sum);
		}
		return false;
//		System.out.print("Not Present");

	}

}
