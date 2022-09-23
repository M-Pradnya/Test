package javamain;

public class Custm extends Person{
	
	 String prodName;
	 float quantity, price, billAmount , finalbillamount;
	 double discount;
	public Custm()
	{
		super();
		prodName = "ss";
		quantity = 20;
		price = 700;
		
	}
	public Custm(int id , String name , MyDate dob ,String prodName , float quantity ,  float price) 
	{
		super(id,name,dob);
		this.prodName=prodName;
		this.quantity=quantity;
		this.price=price;
	}
	
	public void discount()
	{
		if(billAmount>=20000)
		{
			discount=0.15*billAmount;
		}
		else if (billAmount >=15000) {
			discount=0.10*billAmount;
		}
		else if(billAmount>=10000)
		{
			discount=0.07*billAmount;
		}
		else if (billAmount<10000)
		{
			discount = billAmount;
		}
		System.out.println("Discount "+discount);
		System.out.println("finalbill "+ discount*billAmount);
	}
	public void amount()
	{
		billAmount=price*quantity;
		System.out.println("Billamount "+billAmount);
	}
	//public void finalBill()
//	{
		//finalbillamount = billAmount*discount;
		//System.out.println("finabillamount "+finalbillamount);
	//}
	public void display()
	{
		super.display();
		System.out.println("Product Name "+prodName);
		//System.out.println("Discount " + discount);
		
	}

}
