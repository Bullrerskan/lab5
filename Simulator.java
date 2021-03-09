package general;

import java.util.Observable;

/* Denna innehåller i princip bara en metod "run" med en loop
	 * som plockar ut den händelse som står på tur ur kön. 
	 * kommer anropa "utför mig"
	 * loopen i simulators metod slutar när nödbromsen aktiverats. 
	 */

public class Simulator extends Observable {

	    boolean simulating;
	    
	    public void breakSimulation() {
	    	simulating = false;
	    }
	}