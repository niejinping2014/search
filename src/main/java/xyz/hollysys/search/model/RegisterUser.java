package xyz.hollysys.search.model;

public class RegisterUser{
	public String account;
	public String password;
	
	public String newpassword; // 忘记密码时重围的新密码
	
	@Override
	public String toString() {
		return "RegisterUser [account=" + account + ", password=" + password + ", newpassword=" + newpassword + "]";
	}
}