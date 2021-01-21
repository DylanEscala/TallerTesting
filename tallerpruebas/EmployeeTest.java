package tallerpruebas;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
public class EmployeeTest {
	
	
	/*
	 * Prueba que hace Test a metodo cs para calcular el salario de Manager
	 * Salario=100
	 * Porcentaje de Bonus = 50
	 * Currency USD
	 * 
	 */
	
	@Test
	public void csManagerTest() {
		
		Employee empleado= new Employee((float)100,"USD",(float)50,EmployeeType.Manager);
		float salary= empleado.cs();
		assertEquals((float) 181.83334,(float)((float)((float)(100)+((float)(50)*0.35F))+(float)(386.0)/12*2));
		
		
	}
	/*
	 * Prueba que hace Test a metodo cs para calcular el salario de Supervisor
	 * Salario=100
	 * Porcentaje de Bonus = 50
	 * Currency USD
	 * 
	 */
	
	@Test
	public void csSupervisorTest() {
		
		Employee empleado= new Employee((float)100,"USD",(float)50,EmployeeType.Supervisor);
		float salary= empleado.cs();
		assertEquals((float) 199.33334,(float)((float)((float)(100)+((float)(50)*0.7F))+(float)(386.0)/12*2));
		
		
	}
	
	
	/*Se prueba que el valor arrojado por el metodo de la clase employee cuando el tipo de empleado sea Worker, sea el correcto
	 * 
	 */
	@Test
	public void CalculateYearBonusWorkerTest() {
		Employee employeetest=new Employee((float) 100.0, "", (float) 10.0, EmployeeType.Worker);
		assertEquals((float) 386.0, employeetest.CalculateYearBonus());
	}
	/*Se prueba que el valor arrojado por el metodo de la clase employee cuando el tipo de empleado sea Supervisor y el currency USD, sea el correcto
	 * 
	 */
	@Test
	public void CalculateYearBonusSupervisorUSDTest() {
		Employee employeetest=new Employee((float) 100.0, "USD", (float) 10.0, EmployeeType.Supervisor);
		assertEquals((float) 293.0, employeetest.CalculateYearBonus());
	}
	/*Se prueba que el valor arrojado por el metodo de la clase employeet cuando el tipo de empleado sea Supervisor, sea el correcto
	 * 
	 */
	@Test
	public void CalculateYearBonusSupervisorTest() {
		Employee employeetest=new Employee((float) 100.0, "", (float) 10.0, EmployeeType.Supervisor);
		assertEquals((float) 288.0, employeetest.CalculateYearBonus());
	}
	/*Se prueba que el valor arrojado por el metodo de la clase employee cuando el tipo de empleado sea Manager, sea el correcto
	 * 
	 */
	@Test
	public void CalculateYearBonusManagerTest() {
		Employee employeetest=new Employee((float) 100.0, "USD", (float) 10.0, EmployeeType.Manager);
		assertEquals((float) 486.0, employeetest.CalculateYearBonus());
	}
	
}
