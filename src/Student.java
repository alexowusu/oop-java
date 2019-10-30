import java.util.List;

public class Student {
    private List<Double> grade;


    public Student(List<Double> grade) {
        this.grade = grade;
    }

    public List<Double> getGrade() {
        return grade;
    }

    public double getAverageGrade(){
        double total = 0.0;

        for(Double grade : this.grade){
            total += grade;

        }



    return total/this.grade.size();
    }
}
