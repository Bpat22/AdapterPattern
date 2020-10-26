/* @ Author: Bina
 * File: CoffeeTouchScreenAdaptor.java
 * Program lets user select touch screen option from new coffee machine
 * by implementing CoffeeMachineInterface class and using OlfdCoffeeMachine class
 */


package CoffeeMachine;

public class CoffeeTouchScreenAdaptor implements CoffeeMachineInterface{
	
	
	private OldCoffeeMachine oldMachine;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			OldCoffeeMachine oldMachine = new OldCoffeeMachine();
		
			CoffeeTouchScreenAdaptor newCM = new CoffeeTouchScreenAdaptor(oldMachine);
			
			newCM.chooseFirstSelection();
			
			newCM.chooseSecondSelection();
	}
	
	public CoffeeTouchScreenAdaptor(OldCoffeeMachine newCM) {
		this.oldMachine = newCM;
	}
	
	//touch 1
	public void chooseFirstSelection() {
		System.out.println("Choose your selection");
		oldMachine.SelectA();
	}
	
	//touch 2
	public void chooseSecondSelection() {
		System.out.println("Choose your selection");
		oldMachine.SelectB();
	}

}
