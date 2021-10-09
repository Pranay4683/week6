
public class NoLightState implements State{
	WindowTreatments treatments;
	public NoLightState(WindowTreatments treatments) {
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
		System.out.println("You can add more light");
	}

	@Override
	public void removeLight() {
		// TODO Auto-generated method stub
		System.out.println("You haven't selected the light");
	}

	@Override
	public void providePrivacy() {
		// TODO Auto-generated method stub
		System.out.println("Adding privacy");
	}

	@Override
	public void removeStyle() {
		// TODO Auto-generated method stub
		System.out.println("Style added, can't be removed");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Waiting for more options";
	}
}
