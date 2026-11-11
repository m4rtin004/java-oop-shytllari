public class UniversityApp {
    public static void main(String[] args) {
        Student student = new Student("S-1001", "Alice Smith", 2024);
        student.updateGpa(3.5);

        Professor prof = new Professor("P-2001", "Dr. Alan Turing", "Computer Science", 6);
        Course course = new Course("CS101", "Introduction to Programming", 4, "Fall 2026");

        System.out.println(student);
        System.out.println("Standing: " + student.academicStanding());
        System.out.println("Years enrolled: " + student.yearsEnrolled(2026));

        System.out.println(prof);
        System.out.println("Title: " + prof.academicTitle());

        System.out.println(course);
        System.out.println("Full Name: " + course.fullName());
        System.out.println("Is Major: " + course.isMajorCourse());
    }
}