package CDSBusiness;

import java.math.BigDecimal;
import java.util.Date;

public class BillRate {

	private Date effbasedate;
	private BigDecimal baserate;
	public Date getEffbasedate() {
		return effbasedate;
	}
	public void setEffbasedate(Date effbasedate) {
		this.effbasedate = effbasedate;
	}
	public BigDecimal getBaserate() {
		return baserate;
	}
	public void setBaserate(BigDecimal baserate) {
		this.baserate = baserate;
	}


}