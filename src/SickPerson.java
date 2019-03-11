
public abstract class SickPerson extends Person{
	
	private int severity;

public SickPerson(String name, int age, int severity) {
	super(name,age);
	this.severity = severity;
}
public int getSeverity()
{
	return severity;
}

protected int compareToImpl(Person p) {
	if(this.severity  > ((SickPerson) p).getSeverity()){
		return this.severity;
	}
	else if(this.severity  < ((SickPerson) p).getSeverity()) {
		return ((SickPerson) p).getSeverity();
	}
	else {
		return 0;
	}
}
}
