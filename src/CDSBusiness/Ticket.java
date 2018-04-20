package CDSBusiness;

public class Ticket {

	private String ticketid;
	private String PickupLocation;
	private String DeliverLocation;
	private String executiveId;
	private String executiveName;
	private String status;
	private String orderTaker;
	private String pickupCustomer;
	private String deliverCustomer;
	private String pickuptime;
	private String deliverTime;
	private String packageId;
	private String billPayee;
	private String billAmount;
	public String getTicketid() {
		return ticketid;
	}
	public void setTicketid(String ticketid) {
		this.ticketid = ticketid;
	}
	public String getExecutiveId() {
		return executiveId;
	}
	public void setExecutiveId(String executiveId) {
		this.executiveId = executiveId;
	}
	public String getExecutiveName() {
		return executiveName;
	}
	public void setExecutiveName(String executiveName) {
		this.executiveName = executiveName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOrderTaker() {
		return orderTaker;
	}
	public void setOrderTaker(String orderTaker) {
		this.orderTaker = orderTaker;
	}
	public String getPickupCustomer() {
		return pickupCustomer;
	}
	public void setPickupCustomer(String pickupCustomer) {
		this.pickupCustomer = pickupCustomer;
	}
	public String getDeliverCustomer() {
		return deliverCustomer;
	}
	public void setDeliverCustomer(String deliverCustomer) {
		this.deliverCustomer = deliverCustomer;
	}
	public String getPickuptime() {
		return pickuptime;
	}
	public void setPickuptime(String pickuptime) {
		this.pickuptime = pickuptime;
	}
	public String getDeliverTime() {
		return deliverTime;
	}
	public void setDeliverTime(String deliverTime) {
		this.deliverTime = deliverTime;
	}
	public String getPackageId() {
		return packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
	public String getBillPayee() {
		return billPayee;
	}
	public void setBillPayee(String billPayee) {
		this.billPayee = billPayee;
	}
	public String getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}
	public String getPickupLocation() {
		return PickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		PickupLocation = pickupLocation;
	}
	public String getDeliverLocation() {
		return DeliverLocation;
	}
	public void setDeliverLocation(String deliverLocation) {
		DeliverLocation = deliverLocation;
	}
	

}