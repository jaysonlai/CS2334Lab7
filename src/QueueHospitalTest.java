import org.junit.Assert;
import org.junit.Test;

public class QueueHospitalTest {
	@Test
	public void addPatientTest() {
		QueueHospital<SickPerson> list1= new QueueHospital<>();
		SickPerson one = new SickPerson("Dajuan", 31, 10);
		SickPerson two = new SickPerson("Joseph", 25, 4);
		
		list1.addPatient(one);
		list1.addPatient(two);
		
		Assert.assertEquals(2,  list1.numPatients());
		
		
	}
	@Test
	public void nextPatientTest() {
		QueueHospital<SickPerson> list2 = new QueueHospital<>();
		SickPerson one1 = new SickPerson("Mo", 11, 6);
		SickPerson two2 = new SickPerson("Jo", 6, 15);
		SickPerson three3 = new SickPerson("Bo", 5, 11);
		
		list2.addPatient(one1);
		list2.addPatient(two2);
		list2.addPatient(three3);
		
		Assert.assertEquals(one1, list2.nextPatient());
		Assert.assertEquals(one1, list2.nextPatient());
		
	}
	
	@Test
	public void treatNextPatientTest() {
		QueueHospital<SickPerson> list3 = new QueueHospital<>();
		SickPerson one = new SickPerson("Joe", 11, 4);
		SickPerson two = new SickPerson("Schmoe", 15, 6);
		SickPerson three = new SickPerson("Curls", 16, 7);
		
		list3.addPatient(one);
		list3.addPatient(two);
		list3.addPatient(three);
		
		Assert.assertEquals(one, list3.treatNextPatient());
		Assert.assertEquals(two, list3.treatNextPatient());
		Assert.assertEquals(three,  list3.treatNextPatient());
	}
	
	@Test
	public void numPatientTest() {
		QueueHospital<SickPerson> list4 = new QueueHospital<>();
		SickPerson one = new SickPerson("Marth", 55, 55);
		SickPerson two = new SickPerson("Lyn", 69, 32);
		SickPerson three = new SickPerson("Roy", 30, 99);

		list4.addPatient(one);
		list4.addPatient(two);
		Assert.assertEquals(2,  list4.numPatients());
		list4.addPatient(three);
		Assert.assertEquals(3, list4.numPatients());
	}
	
	@Test
	public void hospitalTypeTest() {
		QueueHospital<SickPerson> list5 = new QueueHospital<>();
		Assert.assertEquals("Queue Hospital",  list5.hospitalType());
		
	}
	
	@Test
	public void infoTest() {
		QueueHospital<SickPerson> list6 = new QueueHospital<>();
		SickPerson marquez = new SickPerson("Mango", 3, 3);
		list6.addPatient(marquez);
		Assert.assertEquals("Mango, a 3-year old. Severity level 3.", list6.allPatientInfo());
		Assert.assertEquals("A Queue Hospital-type hospital with 1 patients.", list6.toString());

	}
}
