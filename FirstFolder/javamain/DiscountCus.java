package javamain;

public class DiscountCus {

	public static void main(String args[])
	{
		Custm cs = new Custm();
		cs.display();
		cs.amount();
		//cs.finalBill();
		
		cs.discount();
	}
	
}
/*Person <- Customer(prodName,quantity, price, billAmount) <- Discount 

if billAmount is 20000 or greater than then 15% discount on billAmount
			15000 or more then 10% discount on billAmount
			10000 or more then 7% discount on billAmount
			below 10000 no discount.
			
			calculate discount and final bill.*/

