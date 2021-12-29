public class Teacher {

    private Long id;
    private String name;
    private Double salary;
    private Double salaryEarned;

    public Teacher(Long id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void receiveSalary(Double value){
        this.salary += value;
        School.updateTotalMoneySpent(value);
    }



    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
