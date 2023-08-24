package Courses;

import java.util.ArrayList;

public class StudentCourse extends Course{
    private int year;
    private String term;
    private ArrayList<Course> courseList;

    public StudentCourse(Student s, int year, String term){
        super();
        this.year = year;
        this.term = term;
        courseList = new ArrayList<>();
    }

    public void addCourse(Course c) {
        courseList.add(c);
    }

    public boolean isRegisteredIn(String courseCode, String section) {
        for (Course course : courseList) {
            if (course.getCourseCode().equals(courseCode) && course.getSection().equals(section)) {
                return true;
            }
        }
        return false;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
    
}
