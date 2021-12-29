

public class Student {

    private Long id;
    private String name;
    private Integer grade;
    private Double feesPaid;
    private Double feesTotal;

    public Student(Long id, String name, Integer grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0.0;
        this.feesTotal = 1000.0;
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

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Double getFeesPaid() {
        return feesPaid;
    }

    public void payFees(Double fees) {
        this.feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public Double getFeesTotal() {
        return feesTotal;
    }

    public void setFeesTotal(Double feesTotal) {
        this.feesTotal = feesTotal;
    }

    public Double getRemainingFees(){
        return feesTotal - feesPaid;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + feesTotal +
                '}';
    }
}
