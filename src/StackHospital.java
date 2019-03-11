import java.util.LinkedList;

public class StackHospital<PatientType> {
	private LinkedList<PatientType> stackH = new LinkedList<>();
	public StackHospital() {
		super();
	}
public void addPatient(PatientType patient) {
	stackH.addLast(patient);
}

public PatientType nextPatient() {
	return stackH.get(stackH.size()-1);
}

public PatientType treatPatient() {
	stackH.removeLast();
	return stackH.getLast();
}

public int numPatient() {
	return stackH.size();
}

public String hospitalType() {
	return "Stack Hospital";
}

public String allPatientInfo() {
	String.format();
}
@Override
public String toString() {
	return String.format("A %s-type hospital with %d patients", hospitalType(), numPatient());
}


}
