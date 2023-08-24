package Courses;

public class Student { 
    private String name; 
    private int studentNumber; 
    private StudentCourse thisTermsCourses; 
    
    public Student(String name, int studentNumber){
        this.name =name;
        this.studentNumber = studentNumber;
        this.thisTermsCourses = new StudentCourse(this, studentNumber, name);
    }

    public void registerInCourse(Course c){
        thisTermsCourses.addCourse(c);
    }

    public boolean isRegisteredIn(String courseCode, String section) {
        return thisTermsCourses.isRegisteredIn(courseCode, section);
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public StudentCourse getThisTermsCourses() {
        return thisTermsCourses;
    }

    public void setThisTermsCourses(StudentCourse thisTermsCourses) {
        this.thisTermsCourses = thisTermsCourses;
    }





}
