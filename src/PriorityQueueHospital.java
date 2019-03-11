import java.util.LinkedList;

public class PriorityQueueHospital<PatientType extends Comparable<PatientType>> {

	private LinkedList<PatientType> pqH = new LinkedList<>();
	public PriorityQueueHospital() {
		super();
	}
	
	
	public void addPatient(PatientType patient) {
		pqH.addLast(patient);
	}

	public PatientType nextPatient() {
		return pqH.get(1);
	}

	public PatientType treatPatient() {
		pqH.removeFirst();
		return pqH.getFirst();
	}

	public int numPatient() {
		return pqH.size();
	}

	public String hospitalType() {
		return "Queue Hospital";
	}

	public String allPatientInfo() {
		String.format();
	}
	@Override
	public String toString() {
		return String.format("A %s-type hospital with %d patients", hospitalType(), numPatient());
	}
}
