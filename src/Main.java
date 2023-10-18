public class Main {

    public static void main(String[] args) {
        add(10,20);
        String grade = getGrade(75);
        System.out.println("The grade is: " + grade);

        boolean age = canBuyAlcohol(19);
        System.out.println("This person can buy alcohol: " + age);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else {
            return "F";
        }
    }

    public static boolean canBuyAlcohol(int age) {
        if (age < 21){
            return false;
        }
        return true;
    }
}