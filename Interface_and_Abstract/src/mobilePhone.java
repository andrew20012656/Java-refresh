
public class mobilePhone implements ITelephone{
	
	private int myNumber;
	private boolean isRinging;
	private boolean isOn = false;

	public mobilePhone(int myNumber) {
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		isOn = true;
		System.out.println("Mobile phone powered up.");
	}

	@Override
	public void dial(int phoneNumber) {
		// TODO Auto-generated method stub
		if(isOn) {
			System.out.println("Now ringing " + phoneNumber + " on mobilephone");
		} else {
			System.out.println("Phone is powered off");
		}
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		if(isRinging) {
			System.out.println("Answer the mobilephone");
			isRinging = false;
		}
		
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		// TODO Auto-generated method stub
		if(phoneNumber == myNumber && isOn) {
			isRinging = true;
			System.out.println("Melody playing");
		} else {
			isRinging = false;
			System.out.println("Mobile phone is not on or difference phonenumber");
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
