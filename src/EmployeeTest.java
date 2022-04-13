import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {
    @Test
    void setTotalPay() {
        Employee employee = new Employee("Test Employee", 20);
        assertEquals(employee.getName(), "Test Employee", "Employee name should be Test Employee");
        assertEquals(employee.getTotalPay(), 300, 0.01, "Employee Total Pay should be $" + 20 * Employee.HOURLY_RATE);

        employee.setHours(48);
        assertEquals(employee.getTotalPay(), 732, 0.01, "Employee Total Pay should be $732");
    }
}