package general;

import java.util.Observable;

/*public class State extends Observable {
	int timePassed;
	boolean simStop;
}*/

import java.util.Observable;

public class State extends Observable {

private boolean simStop = false;
private double timePassed;


public State(){
	this.timePassed = 0;
}

public boolean simStop(){ //returnerar simStop när det är dags att sluta.
	return simStop(); // borde väl vara bara simStop; och inte simStop(); ? den med parenteser är metoden, medan den utan är bool-variabeln
}

public double timePassed() { // returnerar tiden som har gått.
	return timePassed;
}

public void setTime(double newTime) { // sätter ett nytt tid på simulatorn.
	this.timePassed = newTime;
}
}
