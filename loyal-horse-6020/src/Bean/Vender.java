package Bean;

public class Vender {
	private int vender_id;
	private String vender_name;
	private String vender_email;
	private String vender_password;
	
	public Vender() {
	}

	public Vender(int vender_id, String vender_name, String vender_email, String vender_password) {
		super();
		this.vender_id = vender_id;
		this.vender_name = vender_name;
		this.vender_email = vender_email;
		this.vender_password = vender_password;
	}

	public int getVender_id() {
		return vender_id;
	}

	public void setVender_id(int vender_id) {
		this.vender_id = vender_id;
	}

	public String getVender_name() {
		return vender_name;
	}

	public void setVender_name(String vender_name) {
		this.vender_name = vender_name;
	}

	public String getVender_email() {
		return vender_email;
	}

	public void setVender_email(String vender_email) {
		this.vender_email = vender_email;
	}

	public String getVender_password() {
		return vender_password;
	}

	public void setVender_password(String vender_password) {
		this.vender_password = vender_password;
	}

	@Override
	public String toString() {
		return "Vender [vender_id=" + vender_id + ", vender_name=" + vender_name + ", vender_email=" + vender_email
				+ ", vender_password=" + vender_password + "]";
	}
	
}
