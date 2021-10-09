
public class HasStyleState implements State {
	WindowTreatments treatments;
	public HasStyleState(WindowTreatments treatments) {
		this.treatments = treatments;
	}

	@Override
	public void addStyle() {
		// TODO Auto-generated method stub
		System.out.println("You can't add more style");
	}

	@Override
	public void addLight() {
		// TODO Auto-generated method stub
		System.out.println("Adding style will add some light");
	}

	@Override
	public void removeLight() {
		// TODO Auto-generated method stub
		System.out.println("Sorry you don't have enough style to add light");
	}

	@Override
	public void providePrivacy() {
		// TODO Auto-generated method stub
		System.out.println("Privacy is needed!");
	}

	@Override
	public void removeStyle() {
		// TODO Auto-generated method stub
		System.out.println("You have selected the style. You cannot remove it");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Waiting for Lights and privacy";
	}

}
