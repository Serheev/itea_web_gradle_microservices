package com.serheev.crudMap;

import java.util.Map;

public class CrudService {
    public static Group createGroup(Map<Integer, Student> list, int id, int course, String faculty) {
        return new Group(list, 100, 1, "Math");
    }

    public static Map<Integer, Student> getStudents(Group group) {
        return group.getStudents();
    }

    public static void addStudent(Group group, Student student, Integer i) {
        getStudents(group).put(i, student);
    }

    public static void updateStudent(Group group, int id, String name, int age) {
        getStudents(group).get(id).setName(name);
        getStudents(group).get(id).setAge(age);
    }

    public static void removeStudent(Group group, int id) {
        getStudents(group).remove(id);
    }

    public static void removeAllStudents(Group group) {
        getStudents(group).clear();
    }
}

