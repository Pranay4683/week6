
public class WindowTreatmentsTest {
	public static void main(String[] args) {
		WindowTreatments treatments = new WindowTreatments();
		
		HasStyleState hasStyleState = new HasStyleState(treatments);
		System.out.println("Has Style State");
		hasStyleState.addStyle();
		hasStyleState.removeStyle();
		hasStyleState.addLight();
		hasStyleState.removeLight();
		hasStyleState.providePrivacy();
		System.out.println(hasStyleState);
		System.out.println("============================================");
		
		NoStyleState noStyleState = new NoStyleState(treatments);
		System.out.println("No Style State");
		noStyleState.addStyle();
		noStyleState.removeStyle();
		noStyleState.addLight();
		noStyleState.removeLight();
		noStyleState.providePrivacy();
		System.out.println(noStyleState);
		System.out.println("============================================");
		
		LightState lightState = new LightState(treatments);
		System.out.println("Light State");
		lightState.addStyle();
		lightState.removeStyle();
		lightState.addLight();
		lightState.removeLight();
		lightState.providePrivacy();
		System.out.println(lightState);
		System.out.println("============================================");
		
		NoLightState noLightState = new NoLightState(treatments);
		System.out.println("No light State");
		noLightState.addStyle();
		noLightState.removeStyle();
		noLightState.addLight();
		noLightState.removeLight();
		noLightState.providePrivacy();
		System.out.println(noLightState);
		System.out.println("============================================");
		
		PrivacyState privacyState = new PrivacyState(treatments);
		System.out.println("Privacy State");
		privacyState.addStyle();
		privacyState.removeStyle();
		privacyState.addLight();
		privacyState.removeLight();
		privacyState.providePrivacy();
		System.out.println(privacyState);
		System.out.println("============================================");
		
		WinnerState winnerState = new WinnerState(treatments);
		System.out.println("Winner State");
		System.out.println(winnerState);
		System.out.println("============================================");
	}
}