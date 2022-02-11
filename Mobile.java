package week1.day1;

public class Mobile {
	public static void main(String[] args) {
		Mobile msg = new Mobile();
		Mobile call = new Mobile();
		Mobile contact = new Mobile();
		msg.sendMsg();
		call.endCall();
		contact.saveContact();
		}
		
		public void sendMsg() {
			 String message = "Message Sent"; 
			 System.out.println("Message Status:"+message);
			  }
		
	    private void endCall() {
			 String call = "Call Completed"; 
			 System.out.println("Call Status:"+call);
			  }
	    
		 public void saveContact() {
			 String contact = "Contact Saved"; 
			 System.out.println("Contact Status:"+contact);
			  }

}
