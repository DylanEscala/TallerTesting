package tallerpruebas;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
public class EmployeeTest {
	
	@Test
	public void CalculateYearBonusWorkerTest() {
		Employee employeetest=new Employee((float) 100.0, "", (float) 10.0, EmployeeType.Worker);
		assertEquals((float) 386.0, employeetest.CalculateYearBonus());
	}
	
	@Test
	public void CalculateYearBonusSupervisorUSDTest() {
		Employee employeetest=new Employee((float) 100.0, "USD", (float) 10.0, EmployeeType.Supervisor);
		assertEquals((float) 293.0, employeetest.CalculateYearBonus());
	}
	@Test
	public void CalculateYearBonusSupervisorTest() {
		Employee employeetest=new Employee((float) 100.0, "", (float) 10.0, EmployeeType.Supervisor);
		assertEquals((float) 288.0, employeetest.CalculateYearBonus());
	}
	
	@Test
	public void CalculateYearBonusManagerTest() {
		Employee employeetest=new Employee((float) 100.0, "USD", (float) 10.0, EmployeeType.Manager);
		assertEquals((float) 486.0, employeetest.CalculateYearBonus());
	}
	
}
