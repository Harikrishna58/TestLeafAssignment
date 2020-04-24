package weel4.day2;

public class Login extends SeleniumBase {
	
	//login
	
	public void login() {
		launchBrowser("chrome","https://www.linkedin.com");
		enterValue();
		}
	
	public static void main(String[] args) {
		Login lg=new Login();
		lg.login();
	}

}
