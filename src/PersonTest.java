import org.junit.Assert;
import org.junit.Test;



public class PersonTest {
	@Test
	public void SickPersonTest() {
		SickPerson freds = new SickPerson("Freds", 19, 10);
		Assert.assertEquals("Name was matching", "Freds", freds.getName());
		Assert.assertEquals("Age was matching", 19, freds.getAge(), .00001);
		Assert.assertEquals("Severity level matches", 10, freds.getSeverity(), .00001);
	}
	@Test
	public void sickToStringTest() {
		SickPerson bobo = new SickPerson("Bobs", 29, 69);
		Assert.assertEquals("Bobs, a 29-year old, severity 69.", bobo.toString());
	}
	
	@Test
	public void HealthyPersonTest() {
		HealthyPerson bares= new HealthyPerson("Barry", 19, "Almost dead");
		Assert.assertEquals("Name was matching", "Barry", bares.getName());
		Assert.assertEquals("Age was matching", 19, bares.getAge(), .00001);
		Assert.assertEquals("Reason matches", "Almost dead", bares.getReason());
	}
	@Test
	public void healthyToStringTest() {
		HealthyPerson pepe= new HealthyPerson("Frawg", 420, "pepeHands");
		Assert.assertEquals("Frawg, a 420-year old, in the hospital because pepeHands.", pepe.toString());
	}
}
