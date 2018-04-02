public class app {
    public static void main(String[] args) {
        Student student = new Student("khoa","Ha Noi","college",2018,58);
        System.out.println(student.toString());
        Staff staff = new Staff("vantt","Ha Noi","CD FPT",10);
        System.out.println(staff.toString());
    }
}
