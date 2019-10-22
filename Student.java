public class Student {
    
    //data
    private String name;
    private int gradeLevel;
    
    private String mathScore;
    private String englishScore;
    private String csScore;

    //constructor
    public Student(String name, int gradeLevel, String mathScore, String englishScore, String csScore) {
        setName(name);
        setGradeLevel(gradeLevel);

        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.csScore = csScore;
    }

    //functions - abilities

    //getters and setters baybee

    public String getName(){
        return this.name;

    }

    public int getGradeLevel(){
        return this.gradeLevel;

    }

    public void setName(String name){
        this.name = name;
    }

    public void setGradeLevel(int gradeLevel){
        if (gradeLevel >= 9 && gradeLevel <= 12){
            this.gradeLevel = gradeLevel;
        }
    }

    public void setMathScore(String mathScore){
        if (mathScore.equals("A") || mathScore.equals("B") || mathScore.equals("C") || mathScore.equals("D") || mathScore.equals("F")){
            this.mathScore = mathScore;
        }
    }

    public void setEnglishScore(String englishScore){
        if (englishScore.equals("A") || englishScore.equals("B") || englishScore.equals("C") || englishScore.equals("D") || englishScore.equals("F")){
            this.englishScore = englishScore;
        }
    }

    public void setCsScore(String csScore){
        if (csScore.equals("A") || csScore.equals("B") || csScore.equals("C") || csScore.equals("D") || csScore.equals("F")){
            this.csScore = csScore;
        }
    }


    //calculate gpa
    private double convertGrade(String grade){
        if (grade.equals("A")){
            return 4.0;
        }
        else if (grade.equals("B")){
            return 3.0;
        }
        else if (grade.equals("C")){
            return 2.0;
        }
        else if (grade.equals("D")){
            return 1.0;
        }
        else{
            return 0.0;
        }
    }

    public double calculateGPA(){
        return (convertGrade(mathScore) + convertGrade(englishScore) + convertGrade(csScore))/3;
    }
    
}