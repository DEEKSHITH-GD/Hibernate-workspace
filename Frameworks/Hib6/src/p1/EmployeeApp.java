package p1;

public class EmployeeApp {

	public static void main(String[] args) {

		Employee emp=new Employee();
		emp.setEmpname("Rahul");

		Address addr=new Address();
		addr.setAddline("2nd cross");
		addr.setCity("Bangalore");
		addr.setState("Karnataka");
		addr.setCountry("India");


		emp.setAddr(addr);

		HibernateManager hbm=new HibernateManager();
		hbm.connect();
		hbm.insert(emp);
		
	}

}
