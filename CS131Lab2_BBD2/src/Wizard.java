


/**
 * This class represents a wizard for
 * a D&D type game.
 * @author rkelley
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */
//Lockable interface


public class Wizard implements Lockable{
	
	private String name;
	private int health;
	private int key;
	boolean locked;
	
	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard() {
	this.name="";
	this.health=100;
	this.key=0;
	this.locked=false;
	}//end constructor
	
	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * @param name
	 */
	public Wizard(String name) {
	
	}//end constructor
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power
	 */
	public void takeDamage(int power) {
		if(this.isLocked()==true)
			this.health=this.health;
		else
			this.health=this.health-power;
	}//end takeDamage
	
	/**
	 * Getter for name
	 * @return
	 */
	public String getName() {
	return name;
	}//end getName
	
	/**
	 * Setter for name
	 * @param name
	 */
	public void setName(String name) {
	this.name=name;
	}//end setName
	
	/**
	 * Getter for health
	 * @return
	 */
	public int getHealth() {
	return health;
	}//end getHealth
	
	/**
	 * Setter for health
	 * @param health
	 */
	public void setHealth(int health) {
		this.health=health;
	}//end setHealth
	
	/**
	 * Getter for the key
	 * @return
	 */
	public int getKey() {
		return key;
	}//end getKey

	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString
	
	//Set key method to check if the key passed into is greater than zero and that this.key has not already been set
	public void setKey(int key) {
		if(key>0 && this.key==0)
			this.key=key;
	}
	//Lock method that should pass in the key that matches the value of the key already set for the object, if they match then the value of the locked should be set to true
	public void lock(int key) {
		if(key==this.key)
			this.locked=true;
	}
	//Unlock method that should pass in the key that matches the value of the key already set for the object, if they match then the value of the locked should be set to false
		public void unlock(int key) {
			if(key==this.key)
				this.locked=false;
		}
	//isLocked method should return the current value of locked
		public boolean isLocked() {
			return locked;
		}
		
}//end class
