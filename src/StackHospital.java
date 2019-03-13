import java.util.Stack;

public class StackHospital<PatientType> extends Hospital<PatientType>{
	
	private Stack<PatientType> stackH;
	public StackHospital() {
		stackH = new Stack<>();
	}
	
/**
* Pushes an item onto the top of this stack.
*/
public void addPatient(PatientType patient) {
	stackH.push(patient);
}

/**
 * Looks at the object at the top of this stack without removing it from the stack.
 * @return the top first item in the stack
 */
public PatientType nextPatient() {
	return stackH.peek();
}

/**
 * Removes the object at the top of this stack and returns that object as the value of this function.
 * @return the top first item in the stack
 */
public PatientType treatNextPatient() {
	return stackH.pop();
}

/**
 * Returns the number of components in this vector.
 * @return the size(number of patients left to be treated) of the stack
 */
public int numPatients() {
	return stackH.size();
}

/**
 * Returns the runtime class of this Object. The returned Class object is the object that is 
 * locked by static synchronized methods of the represented class.
 * @return The Class object that represents the runtime class of this object.
 */
public String hospitalType() {
	return "Stack Hospital";
}

/**
 * Prints all patient information.
 *
 * @return The toString of all patients
 */
public String allPatientInfo() {
	String patient ="";
	for(PatientType p: stackH) {
		patient = patient + p.toString();
	}
	return patient;
}
}
