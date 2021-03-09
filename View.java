package general;

import java.util.Observable;
import java.util.Observer;

import java.util.Observable;
import java.util.Observer;


	/* observatör av State.
	 * metod update är tom.
	 * den ska ärvas till en specifik vy som kan följa simuleringen i steg.
	 */

	public class View implements Observer {
	
	private State state;
	
	public View(){
		state.addObserver(this);
	}
	
	public void update(Observable arg0, Object f) {
		
	}
}