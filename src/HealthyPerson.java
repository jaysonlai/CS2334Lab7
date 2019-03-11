
public abstract class HealthyPerson extends Person{

		private String reason;
	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		this.reason = reason;
		// TODO Auto-generated constructor stub
	}
	public String getReason() {
		return reason;
	}
protected int compareToImpl(Person p)
{
	if(this.getName().charAt(0) > p.getName().charAt(0)) { 
		return -1;
	}
	else if(this.getName().charAt(0) < p.getName().charAt(0)) {
		return 1;
	}
	else {
		return 0;
	}
}

@Override
public String toString()
{
	return String.format("%s, %d, %s", getName(), getAge(), this.reason);
}

}
