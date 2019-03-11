import java.util.LinkedList;

public class PriorityQueueHospital<PatientType extends Comparable<PatientType>> {

	private LinkedList<PatientType> pqH = new LinkedList<>();
	public PriorityQueueHospital() {
		super();
	}
	
	
	public void addPatient(PatientType patient) {
		for(int index = 0; index < pqH.size(); index++) {
			if(patient.compareTo(pqH.get(index)) > -1) {
			pqH.add(index-1, patient);
			}
			else {
				pqH.addLast(patient);
			}
		
	}
	}

	
	public PatientType nextPatients() {
		return pqH.get(1);
	}

	public PatientType treatNextPatient() {
		pqH.removeFirst();
		return pqH.getFirst();
	}

	public int numPatient() {
		return pqH.size();
	}

	public String hospitalType() {
		return "Priority Queue Hospital";
	}

	public String allPatientInfo() {
		return pqH.toString();
	}
	@Override
	public String toString() {
		return String.format("A %s-type hospital with %d patients", hospitalType(), numPatient());
	}
}
