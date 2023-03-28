// Composite
class Manager implements Employee {
    private String name;
    private String department;
    private List<Employee> employees = new ArrayList<Employee>();

    public Manager(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Manager: " + name + ", Department: " + department);
        for (Employee employee : employees) {
            employee.showEmployeeDetails();
        }
    }
}