import java.sql.Date;

public class Guest {
	
	// variable
	private String firstname;
	private String familyname;
	private Address privateAdresse;
	private Address businessAdresse;
	private Date birthday;
	
	// Getter and Setter
	public Address getPrivateAdresse() {
		return privateAdresse;
	}
	public void setPrivateAdresse(Address privateAdresse) {
		this.privateAdresse = privateAdresse;
	}
	public Address getBusinessAdresse() {
		return businessAdresse;
	}
	public void setBusinessAdresse(Address businessAdresse) {
		this.businessAdresse = businessAdresse;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getFamilyname() {
		return familyname;
	}
	public void setFamilyname(String familyname) {
		this.familyname = familyname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public Guest(String firstname, String familyname) {
		this.firstname = firstname;
		this.familyname = familyname;

	}
	
	

}
