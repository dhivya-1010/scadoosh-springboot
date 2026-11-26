package com.example.demo;

// Imports the SpringApplication class
// Used to bootstrap and launch a Spring application
import org.springframework.boot.SpringApplication;

// Marks this class as a Spring Boot application
// Combines:
// @Configuration
// @EnableAutoConfiguration
// @ComponentScan
import org.springframework.boot.autoconfigure.SpringBootApplication;

// ApplicationContext is the Spring Container
// It stores and manages all Spring Beans (objects)
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//
//        /*
//            ============================================
//                    SPRING BOOT APPLICATION START
//            ============================================
//
//            -> main() method is the entry point of Java program
//
//            -> SpringApplication.run() is used to:
//                   1. Start the Spring Boot application
//                   2. Create the Spring Container
//                   3. Perform auto configuration
//                   4. Scan all components (@Component)
//                   5. Create and manage Spring Beans
//                   6. Return an ApplicationContext object
//
//            -> DemoApplication.class
//                   Refers to the current main class
//
//            -> args
//                   Command line arguments
//
//        */
//
//        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//
//        /*
//            ============================================
//                    APPLICATION CONTEXT
//            ============================================
//
//            -> ApplicationContext is called the
//               Spring Container / IOC Container
//
//            -> It is responsible for:
//                   - Creating objects
//                   - Managing objects
//                   - Dependency Injection
//                   - Bean lifecycle management
//
//            -> Instead of creating objects manually using:
//                   Student s = new Student();
//
//               we ask Spring to provide the object.
//
//        */
//
//        /*
//            ============================================
//                    GETTING A BEAN OBJECT
//            ============================================
//
//            -> getBean(Student.class)
//               tells Spring:
//
//               "Give me the object of Student class"
//
//            -> Spring checks whether Student class
//               is available as a Bean.
//
//            -> If Student class has:
//                   @Component
//               then Spring automatically creates
//               the object and stores it in the container.
//            -> The returned object is stored in variable 's'
//        */
//
//        Student s1 = context.getBean(Student.class);
//        /*
//            ============================================
//                    CALLING METHOD
//            ============================================
//            -> study() method is called using
//               the bean object returned by Spring
//        */
//        s1.age=21;
//        s1.study();
//
//        Student s2 = context.getBean(Student.class);
//        System.out.println(s1.age+" "+s2.age); // singleton - o/p: 21 21,        prototype - o/p : 21 0
//
//        // this is singleton by default -> i have assigned age to only one but it is giving same object to both.
//        /* singleton - creates one object and shares,
//           prototype - creates separate objects for each.
//         */
//        s1.writeExam();
        SpringApplication.run(DemoApplication.class, args);
    }
}