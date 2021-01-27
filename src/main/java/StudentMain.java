public class StudentMain {

    public static void main(String[] args) {
        HistoryMagisterStudent student1 = new HistoryMagisterStudent("Sam", 1, "male");
        String courseName = student1.getCourse();

        System.out.println(student1);
        System.out.println(courseName);
    }


}
