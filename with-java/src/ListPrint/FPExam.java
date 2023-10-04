package ListPrint;

import java.util.List;

public class FPExam {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
                "Kubernetes");

        printOddNumbers(numbers);
        printCourses(courses);
        printCoursesWithSpring(courses);
        printCoursesLength4(courses);
        printOddSquare3(numbers);
        printCourseLength(courses);
    }

    private static void printCourseLength(List<String> courses) {
        courses.stream().map(course -> course + ":" + course.length()).forEach(System.out::println);
    }

    private static void printOddSquare3(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 != 0).map(number -> number * number * number)
                .forEach(System.out::println);
        line();
    }

    private static void printCoursesLength4(List<String> courses) {
        courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);
        line();
    }

    private static void printCoursesWithSpring(List<String> courses) {
        courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
        line();
    }

    private static void printOddNumbers(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
        line();
    }

    private static void printCourses(List<String> courses) {
        courses.stream().forEach(System.out::println);
        line();
    }

    private static void line() {
        System.out.println("---------------------------------");

    }
}
