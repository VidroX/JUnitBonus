public class Employee {
    private String name;
    private double hours;
    private double totalPay;

    public static final double WORK_HOURS = 40;
    public static final double HOURLY_RATE = 15;
    public static final double OVERTIME_RATE = 16.5;

    public Employee(String name, double hours) {
        this.name = name;
        this.setHours(hours);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
        this.setTotalPay(hours);
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double hours) {
        this.totalPay = hours <= WORK_HOURS
                ? hours * HOURLY_RATE
                : WORK_HOURS * HOURLY_RATE + (hours - WORK_HOURS) * OVERTIME_RATE;
    }

    @Override
    public String toString() {
        return String.format(
                "Employee:\nName: %s\nHours worker: %.2f\nTotal Pay: %.2f",
                this.name,
                this.hours,
                this.totalPay
        );
    }
}
