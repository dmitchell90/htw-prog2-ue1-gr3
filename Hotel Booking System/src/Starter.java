
public class Starter {

	public static void main(String[] args) {
		
		Guest matt = new Guest("Matt", "Heinz");
		Guest ana = new Guest("Anna", "Müller");
		
		Address address = new Address("Germany", "12055 Berlin", "Treskowallee", "24");
		
		matt.setPrivateAdresse(address);
		ana.setPrivateAdresse(address);
		
		System.out.println(matt);
		System.out.println(ana);

	}

}
