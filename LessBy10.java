package codingbat;

public class LessBy10 {
	public static boolean lessBy10(int a, int b, int c) {
		  int high = Math.max(a,b);
		  high = Math.max(high, c);
          if (high - a >= 10 || high - b >= 10 || high - c >=10)
          return true;
          else
          return false;
      }
   public static void main(String[] args) {
	   System.out.println(lessBy10(1,7,11));
	   System.out.println(lessBy10(1,7,10));
	   System.out.println(lessBy10(11,1,7));



	   
	}

}
