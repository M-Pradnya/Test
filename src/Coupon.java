package javamain;



import java.util.Scanner;

public class Coupon {
	int n,r,j=0,m=0,k=0;
	
	public int generateCode(int coupon)
	{
		n=coupon;
	    	
		while (n != 0)
		  {
		    r = n % 10;
		    n = n / 10;
		    if(r%2==0)	 
		    {
		    	m=m*10+r;
		    }
		
		  }
		return m;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coupon ,s=0,r,c;
		Coupon p=new Coupon();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Copon code: ");
		coupon=sc.nextInt();
		if(coupon<0)
			System.out.println("Number is too Small");
		else if(coupon>32767)
			System.out.println("Number is Too Large");
		else {
		c=	p.generateCode(coupon);
		
		while(c!=0)
		{
		r=c%10;
		s=s*10+r;
		c=c/10;
		}
	System.out.println(s);
		}
	
	}

}

/*
Q.
Read the question carefully and follow the input and output format.

In a game show everybody got one coupon with some code. They need to generate a code with only even numbers in that coupon. Find the answer.

Input and Output Format :
Input consists of  an integer. Output consist of an integer, which is the generated code.

1) Print "Number too small" when the given input number is a negative number.
2) Print "Number too large" when the given input number is greater than 32767.
3) Print 0 If the coupon does not contain any even numbers.

Include a function named generateCode(int coupon) whose return type is an integer, which is the generated code.

Sample Input 1:
4352

Sample Output 1:
42

Sample Input 2:
1357

Sample Output 2:
0

Sample Input 3:
-1357

Sample Output 3:
Number too small
*/
