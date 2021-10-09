
public class PrivacyState implements State{
	WindowTreatments treatments;
	public PrivacyState(WindowTreatments treatments) {
		this.treatments = treatments;
	}
	@Override
	public void addStyle() {
		// TODO Auto-generated method stub
		System.out.println("Style added");
	}

	@Override
	public void addLight() {
		// TODO Auto-generated method stub
		System.out.println("You can't add more light");
	}

	@Override
	public void removeLight() {
		// TODO Auto-generated method stub
		System.out.println("You have selected the light. You cannot remove it.");
	}

	@Override
	public void providePrivacy() {
		// TODO Auto-generated method stub
		System.out.println("Privacy already added. Can't add more");
	}

	@Override
	public void removeStyle() {
		// TODO Auto-generated method stub
		System.out.println("Style added, can't be removed");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Completing all the treatmnents";
	}

}
