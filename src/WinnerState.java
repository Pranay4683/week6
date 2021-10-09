
public class WinnerState implements State{
	WindowTreatments treatments;
	public WinnerState(WindowTreatments treatments) {
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
		System.out.println("privacy added");
	}

	@Override
	public void removeStyle() {
		// TODO Auto-generated method stub
		System.out.println("Style added, can't be removed");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Adding more styles and lights, because you are the winner";
	}

}
