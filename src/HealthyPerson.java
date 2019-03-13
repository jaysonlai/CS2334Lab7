
public class HealthyPerson extends Person{
/*
 * Specific type of Person admitted to a Hospital. A healthy person.
 */
		private String reason;
		
		/**
		 * Stores information about the HealthyPerson.
		 * 
		 * @param Name of a healthy person
		 * @param Age of a healthy person
		 * @param Reason for visit of healthy person
		 * 
		 * */
		
	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		this.reason = reason;
		// TODO Auto-generated constructor stub
	}
	
	public String getReason() {
		return reason;
	}
	
	/**
	 * 	Implementation method for Person's compareTo method(). 
	 * 
	 * 	@param p - The Person used to compare self with.
	 * 	@return standard comparison result:
	 * 	(1) self's name comes "before" o's name: a negative number 
	 * 	(2) self's name comes "after" p's name: a positive number 
	 * 	(3) names are equivalent: 0 
	 * 		i.e. the natural ordering of the name strings, ignoring case - orders alphabetically.
	 *
	 */
protected int compareToImpl(Person p)
{
	if(this.getName().compareTo(p.getName()) > 0 ){
		return -1;
	}
	else if(this.getName().compareTo(p.getName()) < 0 ){
		return 1;
	}
	else {
		return 0;
	}
	}
	

/**
 * 
 * @return the name, age and reason healthy person's visit
 */
@Override
public String toString()
{
	return String.format("%s, a %d-year old, in the hospital because %s.", this.getName(), this.getAge(), this.getReason());
}

}
