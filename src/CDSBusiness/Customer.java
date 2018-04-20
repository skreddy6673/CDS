package CDSBusiness;

public class Customer {

	private String name;
	private String city;
	private String state;
	private String zip; 
	private String phone;
	private String mail;
	private String closestintersection;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getClosestintersection() {
		return closestintersection;
	}
	public void setClosestintersection(String closestintersection) {
		this.closestintersection = closestintersection;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + ", phone=" + phone + ", mail=" + mail
				+ ", closestintersection=" + closestintersection + "]";
	}
	
}