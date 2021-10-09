
public class WindowTreatments {
	State hasStyleState;
	State noStyleState;
	State lightState;
	State noLightState;
	State privacyState;
	State winnerState;
	
	State state = hasStyleState;
	
	public WindowTreatments() {
		hasStyleState = new HasStyleState(this);
		noStyleState = new NoStyleState(this);
		lightState = new LightState(this);
		noLightState = new NoLightState(this);
		privacyState = new PrivacyState(this);
		winnerState = new WinnerState(this);
		
	}
	
	public void addStyle() {
		state.addStyle();
	}
	
	public void removeStyle() {
		state.removeStyle();
	}
	
	public void addLight() {
		state.addLight();
	}
	
	public void removeLight() {
		state.removeLight();
	}
	
	public void providePrivacy() {
		state.providePrivacy();
	}
	
	void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return state;
	}

	public State getHasStyleState() {
		return hasStyleState;
	}

	public State getNoStyleState() {
		return noStyleState;
	}

	public State getLightState() {
		return lightState;
	}

	public State getNoLightState() {
		return noLightState;
	}

	public State getPrivacyState() {
		return privacyState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	@Override
	public String toString() {
		return "Window Treatment state is: "+state;
	}
	
	
	
}
