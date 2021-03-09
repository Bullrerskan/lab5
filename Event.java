package general;


import general.EventQueue;
import general.Simulator;

public abstract class Event {

    private double time;
    
    public double getTime() {
    	return time;
    }
   
    public void setTime(double time) { 
    	this.time = time;
    }
    
    public abstract void runEvent(Simulator state, EventQueue eventQueue);
}

