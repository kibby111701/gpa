public class GPA{
    public static void main(String[] args) {
        
        Student student = new Student("Chris", 12);
        Student student2 = new Student("Jimbo", 11);

        double gpa = student.calculateGPA();

        System.out.println(gpa);

        String name = student.getName();
        System.out.println(name);

        int gradeLevel = student.getGradeLevel();
        System.out.println(gradeLevel);

        gpa = student2.calculateGPA();

        student.setName("Bob");
        student.setGradeLevel(11);

        name = student.getName();
        gradeLevel = student.getGradeLevel();

        System.out.println(name);
        System.out.println(gradeLevel);

    }


}