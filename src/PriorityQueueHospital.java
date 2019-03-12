/*
 * Class representing the order the patients will be treated, 
 * unless the patients have a natural ordering
 * the patients should be treated via QueueHospital ordering
 * 
 * @author Jayson Lai
 * @version 031019
 * @param <PatientType>
 */
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueHospital<PatientType extends Comparable<PatientType>> extends Hospital<PatientType>{

	/**
	 * create a priority queue list to contain patients
	 */
	private Queue<PatientType> pqH;
	
	
/**
 *  constructor initialize the priority queue list
 */
	public PriorityQueueHospital() {
		super();
		pqH = new PriorityQueue<>();
	}
	
	
	public void addPatient(PatientType patient) {
		pqH.add(patient);
	}

	
	public PatientType nextPatient() {
		return pqH.peek();
	}

	public PatientType treatNextPatient() {
		return pqH.poll();
	}

	public int numPatients() {
		return pqH.size();
	}

	public String hospitalType() {
		return "Priority Queue Hospital";
	}

	public String allPatientInfo() {
		return pqH.toString();
	}
	

}