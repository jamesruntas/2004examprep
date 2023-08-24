package Courses;

public class Course { 
    
    private String courseName; 
    private String courseCode; // e.g., "SYSC 2004", "ELEC 2607" 
    private String section; // e.g., "A", "B", "C"  

    public Course(){
        this.courseCode ="";
        this.courseName = "";
        this.section = "";
    }

    public Course(String name, String code, String section){
        this.courseCode =code;
        this.courseName = name;
        this.section = section;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

} 
