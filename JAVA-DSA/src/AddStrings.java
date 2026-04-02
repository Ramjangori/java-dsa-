
public class AddStrings {
  public static void main(String[] args) {
	String s = "3456";
	String s2 = "4579";
	int number = 0;
	int p = 1;
	
	for(int i = s.length()-1 ; i>=0 ; i--) {
		int rem=0;
		int num1 = (int)s.charAt(i)-'0';
		int num2 = (int)s2.charAt(i)-'0';
		number = number + ((num1+num2+rem)%10)*p;
		rem = (num1+num2)/10;
		p = p*10;	
	}
	 System.out.println(number);
}
}
