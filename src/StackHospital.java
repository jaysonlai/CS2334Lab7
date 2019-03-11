import java.util.LinkedList;

public class StackHospital<PatientType> extends Hospital<PatientType>{
	
	private LinkedList<PatientType> stackH = new LinkedList<PatientType>();
	public StackHospital() {
		super();
	}
public void addPatient(PatientType patient) {
	stackH.addLast(patient);
}

public PatientType nextPatient() {
	return stackH.get(stackH.size()-1);
}

public PatientType treatNextPatient() {
	stackH.removeLast();
	return stackH.getLast();
}

public int numPatients() {
	return stackH.size();
}

public String hospitalType() {
	return "Stack Hospital";
}

public String allPatientInfo() {
	return stackH.toString();
}
@Override
public String toString() {
	return String.format("A %s-type hospital with %d patients", hospitalType(), numPatients());
}



}
