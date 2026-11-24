public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("REG001", "Alice", 20, 65, 70, 58);
        Student s2 = new Student("REG002", "Brian", 22, 40, 45, 38);

        s1.displayInformation();
        System.out.println("-------------------");
        s2.displayInformation();
    }
}
