
public class NoStyleState implements State{
	WindowTreatments treatments;
	public NoStyleState(WindowTreatments treatments) {
		this.treatments = treatments;
	}

	@Override
	public void addStyle() {
		// TODO Auto-generated method stub
		System.out.println("you added a style");
	}

	@Override
	public void addLight() {
		// TODO Auto-generated method stub
		System.out.println("Adding style will add light, but need to pay first");
	}

	@Override
	public void removeLight() {
		// TODO Auto-generated method stub
		System.out.println("You have't selected the light");
	}

	@Override
	public void providePrivacy() {
		// TODO Auto-generated method stub
		System.out.println("Privacy is needed with style");
	}

	@Override
	public void removeStyle() {
		// TODO Auto-generated method stub
		System.out.println("You haven't added a style");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Waiting for styles, lights and privacy";
	}
}
