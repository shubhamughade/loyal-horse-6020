package Bean;

public class Bid {
	private int bid_id;
	private int bid_amount;
	private int bid_status;
	private String bid_date;
	
	private int Tender_id;
	private int Vender_id;
	
	public Bid() {
	}

	public Bid(int bid_id, int bid_amount, int bid_status, String bid_date, int tender_id, int vender_id) {
		super();
		this.bid_id = bid_id;
		this.bid_amount = bid_amount;
		this.bid_status = bid_status;
		this.bid_date = bid_date;
		Tender_id = tender_id;
		Vender_id = vender_id;
	}

	public int getBid_id() {
		return bid_id;
	}

	public void setBid_id(int bid_id) {
		this.bid_id = bid_id;
	}

	public int getBid_amount() {
		return bid_amount;
	}

	public void setBid_amount(int bid_amount) {
		this.bid_amount = bid_amount;
	}

	public int getBid_status() {
		return bid_status;
	}

	public void setBid_status(int bid_status) {
		this.bid_status = bid_status;
	}

	public String getBid_date() {
		return bid_date;
	}

	public void setBid_date(String bid_date) {
		this.bid_date = bid_date;
	}

	public int getTender_id() {
		return Tender_id;
	}

	public void setTender_id(int tender_id) {
		Tender_id = tender_id;
	}

	public int getVender_id() {
		return Vender_id;
	}

	public void setVender_id(int vender_id) {
		Vender_id = vender_id;
	}

	@Override
	public String toString() {
		return "Bid [bid_id=" + bid_id + ", bid_amount=" + bid_amount + ", bid_status=" + bid_status + ", bid_date="
				+ bid_date + ", Tender_id=" + Tender_id + ", Vender_id=" + Vender_id + "]";
	}
	
	
	
	
}
