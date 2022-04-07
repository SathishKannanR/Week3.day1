package Week3.day1;

public class SmartPhone extends AndroidPhone {
	
	public void connectWhatsApp()
    { 
	     System.out.println("WhatsApp");
    }
	public void takeVideo()
    { 
	     System.out.println("Video-SmartPhone");
    }

	public static void main(String[] args) {
		
		SmartPhone sp=new SmartPhone();
		sp.sendMsg();
		sp.makeCall();
		sp.saveContact();
		sp.takeVideo();
		sp.connectWhatsApp();

	}

}
