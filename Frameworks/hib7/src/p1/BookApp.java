package p1;

public class BookApp {

	public static void main(String[] args) {

		Publisher p=new Publisher();
		p.setPname("Penguin");

		Book b1=new Book();
		b1.setBname("i too had a love story");
		b1.setPub(p);
		
		Book b2 = new Book();
		b2.setBname("You are the password of my life");
		b2.setPub(p);


		HibernateManager hbm=new HibernateManager();
		hbm.connect();
		hbm.insert(b1);
		hbm.insert(b2);
	}

}
