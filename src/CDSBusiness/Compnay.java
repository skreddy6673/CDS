package CDSBusiness;

import java.math.BigDecimal;

public class Compnay {

	private String name;
	private String contactnumber;
	private String companyhrs;
	private String location;
	private String blockpermiles;
	private String rateperblock;
	private String timetopickup;
	public String getCompanyhrs() {
		return companyhrs;
	}
	public void setCompanyhrs(String companyhrs) {
		this.companyhrs = companyhrs;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBlockpermiles() {
		return blockpermiles;
	}
	public void setBlockpermiles(String blockpermiles) {
		this.blockpermiles = blockpermiles;
	}
	public String getRateperblock() {
		return rateperblock;
	}
	public void setRateperblock(String rateperblock) {
		this.rateperblock = rateperblock;
	}
	public String getTimetopickup() {
		return timetopickup;
	}
	public void setTimetopickup(String timetopickup) {
		this.timetopickup = timetopickup;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
}