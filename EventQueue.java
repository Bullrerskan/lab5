package general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* denna kö ordnar instoppade händelser efter beräknad tid och
 * ger ut den händelser som står op tur.
 */

public class EventQueue {
	
	private ArrayList <Event> queue = new ArrayList <Event> ();
	
	// lägger till event på nextEvent.
	
	public void nextEvent (Event nextEvent) { 
		queue.add(nextEvent);
	}

	void addToQueue(Event e) {
		queue.add(e);

	}

	void sortQueue () {
		Collections.sort(queue, new Comparator<Event>() {
			
            public int compare(Event firstevent, Event secondevent) {
            	
                if (secondevent.getTime() > firstevent.getTime())
                	return -1;
                
                if (secondevent.getTime() > firstevent.getTime()) 
                	return 1;
                
                else return 0;
            }
        });	
	}
}



