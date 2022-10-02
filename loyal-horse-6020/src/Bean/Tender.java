package Bean;

public class Tender {
	private int tender_id;
	private String tendor_name;
	private int tender_amount;
	private String tender_add;
	
	public Tender() {
	}
	
	public Tender(int tender_id, String tendor_name, int tender_amount, String tender_add) {
		super();
		this.tender_id = tender_id;
		this.tendor_name = tendor_name;
		this.tender_amount = tender_amount;
		this.tender_add = tender_add;
	}
	public int getTender_id() {
		return tender_id;
	}
	public void setTender_id(int tender_id) {
		this.tender_id = tender_id;
	}
	public String getTendor_name() {
		return tendor_name;
	}
	public void setTendor_name(String tendor_name) {
		this.tendor_name = tendor_name;
	}
	public int getTender_amount() {
		return tender_amount;
	}
	public void setTender_amount(int tender_amount) {
		this.tender_amount = tender_amount;
	}
	public String getTender_add() {
		return tender_add;
	}
	public void setTender_add(String tender_add) {
		this.tender_add = tender_add;
	}
	@Override
	public String toString() {
		return "Tender [tender_id=" + tender_id + ", tendor_name=" + tendor_name + ", tender_amount=" + tender_amount
				+ ", tender_add=" + tender_add + "]";
	}
}
