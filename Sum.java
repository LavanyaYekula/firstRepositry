public class SumOfDigits {

	public static void main(String[] args) {
		int num=742,digit,sum=0;
		for(int i=num;i<=100;i++)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("Sum of Digits: "+sum);
	}