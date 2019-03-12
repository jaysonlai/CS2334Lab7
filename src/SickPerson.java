/*
 * Class to represent a person with the a status of sick
 * 
 * @author Jayson Lai 
 * @version 03-11-19
 * 
 */
public class SickPerson extends Person{
	
	private int severity;
	
	/**
	 * Stores information about the SickPerson.
	 * 
	 * @param The SickPerson's name
	 * @param The SickPerson's age
	 * @param The severity of the illness in the SickPerson. 
	 * The higher the value, the more severe the illness.
	 */
	
public SickPerson(String name, int age, int severity) {
	super(name,age);
	this.severity = severity;
}
public int getSeverity()
{
	return severity;
}
/*
 * Implementation method for Person's compareTo method(). 
 * Does the actual legwork of comparison to compare a SickPerson (self) vs. another Person (o).
 * @param p - The other Person to compare self to.
 * @return If p is not of type SickPerson, return 0.
 * 	  
 * If p is not of type SickPerson, return 0. 
 * Else, return (ignoring case): 
 * (1) self's severity is greater than o's severity: negative number 
 * (2) self's severity is less than o's severity: positive number 
 * (3) severity are equivalent: 0 Orders by decreasing severity.
 */
protected int compareToImpl(Person p) {
	if(p instanceof SickPerson) {
	if(this.getSeverity() < ((SickPerson) p).getSeverity()) {
		return 1;
	}
	else if(this.getSeverity() > ((SickPerson) p).getSeverity()) {
		return -1;
	}
	else {
		return 0;
	}
	}
	return 0;
}

/**
 * Gives some information about the SickPerson.
 * 
 * @return The String "%s Severity level %d" with replacements of the super's toString and the SickPerson severity.
 */

@Override
public String toString() {
	return String.format("%s, a %d-year old, severity %d.", this.getName(), this.getAge(), this.getSeverity());
}

}
