/*
 * Class representing the order the patients will be treated, 
 * unless the patients have a natural ordering
 * the patients should be treated via QueueHospital ordering
 * 
 * @author Jayson Lai
 * @version 03-11-19
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
	
	/**
	 * Inserts the specified element into this priority queue.
	 * 
	 */
	public void addPatient(PatientType patient) {
		pqH.add(patient);
	}

	/**
	 * Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
	 * @return the first item of the list
	 * 
	 */
	public PatientType nextPatient() {
		return pqH.peek();
	}

	/**
	 * Retrieves and removes the head of this queue, or returns null if this queue is empty.
	 * @return the first item of the list 
	 * 
	 */
	public PatientType treatNextPatient() {
		return pqH.poll();
	}

	/**
	 * Returns the number of components in this vector.
	 * @return the size(number of patients left to be treated) of the stack
	 * 
	 */
	public int numPatients() {
		return pqH.size();
	}

	/**
	 * Returns the runtime class of this Object. The returned Class object is the object that is 
	 * locked by static synchronized methods of the represented class.
	 * @return The Class object that represents the runtime class of this object.
	 * 
	 */
	public String hospitalType() {
		return "Priority Queue Hospital";
	}

	/**
	 * Prints all patient information.
	 * @return The toString of all patients
	 * 
	 */
	public String allPatientInfo() {
		return pqH.toString();
	}
	

}