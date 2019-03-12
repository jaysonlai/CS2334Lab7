import java.util.LinkedList;
import java.util.Queue;
/**
 * Class representing the order the patients will be treated, 
 * First in, First out
 * @author Jayson Lai
 * @version 03-09-19
 * 
 * @param <PatientType> The generic type for the type of patient that the Hospital accepts.
 **/
public class QueueHospital<PatientType> extends Hospital<PatientType>{
	
	private Queue<PatientType> queueH;
	public QueueHospital() {
		super();
		queueH = new LinkedList<>();
	}
	
	
	/**
	* Pushes an item onto the top of this stack.
	*/
	public void addPatient(PatientType patient) {
		queueH.add(patient);
	}

	/**
	 * Looks at the object at the top of this stack without removing it from the stack.
	 * @return the top first item in the stack
	 */
	public PatientType nextPatient() {
		return ((LinkedList<PatientType>) queueH).peekFirst();
	}

	/**
	 * Removes the object at the top of this stack and returns that object as the value of this function.
	 * @return the top first item in the stack
	 */
	public PatientType treatNextPatient() {
		return queueH.remove();
	}

	/**
	 * Returns the number of components in this vector.
	 * @return the size(number of patients left to be treated) of the stack
	 */
	public int numPatients() {
		return queueH.size();
	}

	/**
	 * Returns the runtime class of this Object. The returned Class object is the object that is 
	 * locked by static synchronized methods of the represented class.
	 * @return The Class object that represents the runtime class of this object.
	 */
	public String hospitalType() {
		return "Queue Hospital";
	}

	/**
	 * Prints all patient information.
	 *
	 * @return The toString of all patients
	 */
	public String allPatientInfo() {
		return queueH.toString();
	}
	}