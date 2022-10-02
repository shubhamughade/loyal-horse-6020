package Bean;

public class Admin {
	private int Admin_id;
	private String Admin_Name;
	private String Admin_email;
	private String Admin_password;
	
	public Admin() {
	}

	public Admin(int admin_id, String admin_Name, String admin_email, String admin_password) {
		Admin_id = admin_id;
		Admin_Name = admin_Name;
		Admin_email = admin_email;
		Admin_password = admin_password;
	}

	public int getAdmin_id() {
		return Admin_id;
	}

	public void setAdmin_id(int admin_id) {
		Admin_id = admin_id;
	}

	public String getAdmin_Name() {
		return Admin_Name;
	}

	public void setAdmin_Name(String admin_Name) {
		Admin_Name = admin_Name;
	}

	public String getAdmin_email() {
		return Admin_email;
	}

	public void setAdmin_email(String admin_email) {
		Admin_email = admin_email;
	}

	public String getAdmin_password() {
		return Admin_password;
	}

	public void setAdmin_password(String admin_password) {
		Admin_password = admin_password;
	}

	@Override
	public String toString() {
		return "Admin [Admin_id=" + Admin_id + ", Admin_Name=" + Admin_Name + ", Admin_email=" + Admin_email
				+ ", Admin_password=" + Admin_password + "]";
	}
	
}
