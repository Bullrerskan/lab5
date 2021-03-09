package general;

import general.EventQueue;
import general.Simulator;

public abstract class Event {

    private double timeExcecution;
    
    public double getTime() {
    	return timeExcecution;
    }
   
    public void setTime(double time) { 
    	this.timeExcecution = time;
    }
    
    public abstract void excecute(Simulator state, EventQueue eventQueue);
}

