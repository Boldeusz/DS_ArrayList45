package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Marcin", "Nienajadlo", 123));
        employeeList.add(new Employee("Agata", "Yatta", 456));
        employeeList.add(new Employee("Jan", "Kowalski", 789));
        employeeList.add(new Employee("Frank", "Murarski", 763));

//        employeeList.forEach(employee -> System.out.println(employee));

//        System.out.println(employeeList.get(3));
//        System.out.println(employeeList.size());
        employeeList.add(2, new Employee("Michal", "Janowski", 9870));
//        employeeList.forEach(System.out::println);

//        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
//        for (Employee employee: employeeArray){
//            System.out.println(employee);
//        }
        System.out.println(employeeList.contains(new Employee("Jan", "Kowalski", 789)));
        System.out.println(employeeList.indexOf(new Employee("Jan", "Kowalski", 789)));
//        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));

    }
}
