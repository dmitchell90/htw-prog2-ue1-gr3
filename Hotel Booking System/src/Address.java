

public class Address {
	
	private String country;
	private String zipcode;
	private String streetName;
	private String streetNumber;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	
	public Address(String country, String zipcode, String streetName, String streetNumber) {
		this.country = country;
		this.zipcode = zipcode;
		this.streetName = streetName;
		this.streetNumber = streetNumber;
	}
	@Override
	public String toString() {
		return "Addresse [Country= " + country + "zipcode= " + zipcode + "streetName= " + streetName + " streetNumber= " + streetNumber + " ]";
	}

}
