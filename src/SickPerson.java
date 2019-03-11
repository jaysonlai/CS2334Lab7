
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
	
	return this.severity - ((SickPerson) p).getSeverity();
}
@Override
public String toString() {
	return String.format("%s, %d, %d", getName(), getAge(), this.severity);
}

}
