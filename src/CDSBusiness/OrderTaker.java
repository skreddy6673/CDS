package CDSBusiness;

public class OrderTaker {

	@Override
	public String toString() {
		return "OrderTaker [number=" + number + ", name=" + name + "]";
	}

	private String number;
	private String name;
	private String password;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void get() {
		// TODO - implement OrderTaker.get
		throw new UnsupportedOperationException();
	}

	public void set() {
		// TODO - implement OrderTaker.set
		throw new UnsupportedOperationException();
	}

}