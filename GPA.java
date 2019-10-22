public class GPA{
    public static void main(String[] args) {
        
        Student student = new Student("Chris", 12, "A", "B", "A");
        Student student2 = new Student("Jimbo", 11, "C", "C", "C");

        double gpa = student.calculateGPA();
        String name = student.getName();
        int gradeLevel = student.getGradeLevel();

        System.out.println(name + " is in grade " + gradeLevel + " and has a GPA of " + gpa);




        // int gradeLevel = student.getGradeLevel();
        // System.out.println(gradeLevel);

        // gpa = student2.calculateGPA();

        // student.setName("Bob");
        // student.setGradeLevel(11);

        // name = student.getName();
        // gradeLevel = student.getGradeLevel();

        // System.out.println(name);
        // System.out.println(gradeLevel);

    }


}