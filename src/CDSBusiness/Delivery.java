package CDSBusiness;

import java.util.Date;

public class Delivery {

	private Date pickdatetime;
	private Date estdeliverydatetime;
	private Date bill;
	private Date departuredatetime;
	private Date actdeliverydatetime;

	public Date getPickdatetime() {
		return pickdatetime;
	}

	public void setPickdatetime(Date pickdatetime) {
		this.pickdatetime = pickdatetime;
	}

	public Date getEstdeliverydatetime() {
		return estdeliverydatetime;
	}

	public void setEstdeliverydatetime(Date estdeliverydatetime) {
		this.estdeliverydatetime = estdeliverydatetime;
	}

	public Date getBill() {
		return bill;
	}

	public void setBill(Date bill) {
		this.bill = bill;
	}

	public Date getDeparturedatetime() {
		return departuredatetime;
	}

	public void setDeparturedatetime(Date departuredatetime) {
		this.departuredatetime = departuredatetime;
	}

	public Date getActdeliverydatetime() {
		return actdeliverydatetime;
	}

	public void setActdeliverydatetime(Date actdeliverydatetime) {
		this.actdeliverydatetime = actdeliverydatetime;
	}

	public void estdeliverytime() {
		// TODO - implement Delivery.estdeliverytime
		throw new UnsupportedOperationException();
	}

	public void estdeparturetime() {
		// TODO - implement Delivery.estdeparturetime
		throw new UnsupportedOperationException();
	}

	public void bill() {
		// TODO - implement Delivery.bill
		throw new UnsupportedOperationException();
	}

}