package weel4.day2;

public interface Wrapper {
	
	/**
	 * This method launch any given browser and load given url
	 * set 30 sec time out and maximize
	 * 
	 * @param browser-for Browser
	 * @param url-loads the given url
	 * 
	 * @author MS.NEERAJA
	 * @throws Exception 
	 */
	
	public void launchBrowser(String browser,String url);
	
	
	public void enterValue();
	

}
