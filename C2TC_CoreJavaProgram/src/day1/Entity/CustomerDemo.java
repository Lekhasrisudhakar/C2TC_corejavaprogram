package day1.Entity;

public class CustomerDemo {

	public static void main(String[] args) {
		
		Customer c1=new Customer();
		c1.setCid(101);
		c1.setName("Raja");
		c1.setCity("chennai");
		System.out.println(c1);
		
		Customer c2=new Customer();
		c2.setCid(102);
		c2.setName("Priya");
		c2.setCity("Puducherry");
		System.out.println(c2);

	}

	

}
