import org.junit.Assert;
import org.junit.Test;



public class PatientTest {
	
	@Test
	public void animalTest() {
		Animal kuzco = new Animal("Llama", 3);
		Animal kronk = new Animal("Squirrel", 2);
		Animal yoo = new Animal("Panda", 7);
		
		Assert.assertEquals("Llama", kuzco.getBreed());
		Assert.assertEquals("Squirrel", kronk.getBreed());
		
		Assert.assertEquals(2, kronk.getAge());
		Assert.assertEquals(7, yoo.getAge());
	}
	@Test
	public void animalToString() {
		Animal timmy = new Animal("Not Right", 5);
		Animal turner = new Animal("On Ice", 66);
		
		Assert.assertEquals("A 5-year old Not Right.", timmy.toString());
		Assert.assertEquals("A 66-year old On Ice.", turner.toString());
	}
	
	@Test
	public void animalCompare() {
		Animal one = new Animal("Son", 420);
		Animal two = new Animal("Locator", 69);
		Animal three = new Animal("Father", 69);
		
		Assert.assertEquals(-351, one.compareTo(three));
		Assert.assertEquals(0, two.compareTo(three));
		Assert.assertEquals(351, three.compareTo(one));
		
	}
	
	
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
		Assert.assertEquals("Bobs, a 29-year old. Severity level 69.", bobo.toString());
	}
	
	@Test
	public void sickCompareTo() {
		SickPerson leffen = new SickPerson("Leffen",15, 1);
		SickPerson hBox = new SickPerson("HungryBox", 12, 2);
		SickPerson juan = new SickPerson("hbox", 13, 2);
		Assert.assertEquals(1, leffen.compareTo(hBox));
		Assert.assertEquals(-1, hBox.compareTo(leffen));
		Assert.assertEquals(0, hBox.compareTo(juan));
	}	
	
	
	
	
	
	@Test
	public void HealthyPersonTest() {
		HealthyPerson notRight= new HealthyPerson("Doug DimmaDome", 666, "Doug Dimmadome owner of the Dimmsdale Dimmadome.");
		Assert.assertEquals("Name was matching", "Doug DimmaDome", notRight.getName());
		Assert.assertEquals("Age was matching", 666, notRight.getAge(), .00001);
		Assert.assertEquals("Reason matches", "Doug Dimmadome owner of the Dimmsdale Dimmadome.", notRight.getReason());
	}
	
	@Test
	public void healthyToStringTest() {
		HealthyPerson pepe= new HealthyPerson("Frawg", 420, "pepeHands");
		Assert.assertEquals("Frawg, a 420-year old. In for pepeHands", pepe.toString());
	}
	@Test
	public void healthyCompareTo() {
		HealthyPerson jebailey = new HealthyPerson("Floridian", 35, "Jebaited");
		HealthyPerson mang0W = new HealthyPerson("SoCal", 25, "The GOAT");
		HealthyPerson mang0 = new HealthyPerson("SoCal", 25, "Always Drunk");
		
		Assert.assertEquals(-1, jebailey.compareTo(mang0W));
		Assert.assertEquals(1, mang0W.compareTo(jebailey));
		Assert.assertEquals(0, mang0W.compareTo(mang0));
		
	}
}
