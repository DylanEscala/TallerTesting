package tallerpruebas;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.Test;

public class EmployeeTest {
	/*
	 * Se comprueba que el mes generado por el programa sea PAR.
	 */
	@Test
	public void csMonthParTest() {
		LocalDateTime monthLater = LocalDateTime.now();
		if(monthLater.getMonthValue()%2!=0) {
			monthLater = LocalDateTime.now().plusMonths(1);
		}
    	Employee employeetest=new Employee((float) 100.0, "USD", (float) 10.0, EmployeeType.Worker);
		
		TimeMachine.useFixedClockAt(monthLater);
		System.out.println(monthLater);
		float salary = employeetest.cs();
		assertEquals((float)100, salary);
		TimeMachine.useSystemDefaultZoneClock();
	}
	
	/*
	 * Se comprueba que el valor calculado dentro del metodo CS corresponda a lo previsto si es que usa un
	 * currency distinto a USD.
	 */
    @Test
    public void csNoUSDTest() {
    	Employee employeetest=new Employee((float) 100.0, "", (float) 10.0, EmployeeType.Worker);
		assertEquals((float) 159.33334, employeetest.cs());
    }

	/*Se prueba que el valor arrojado por el metodo cs() cuando el tipo de empleado sea Worker 
	 * 
	 */
	
	@Test
	public void CsWorkerTest() {
		Employee employeetest=new Employee((float) 100.0, "USD", (float) 10.0, EmployeeType.Worker);
		assertEquals((float) 164.33334, employeetest.cs());
	}
	
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
		assertEquals((float) 199.33334,salary);
		
		
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
		assertEquals((float) 181.83334,salary);
		
		
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
