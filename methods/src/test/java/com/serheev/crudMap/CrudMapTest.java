package com.serheev.crudMap;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static com.serheev.crudMap.CrudService.removeAllStudents;
import static com.serheev.crudMap.CrudService.removeStudent;
import static com.serheev.crudMap.CrudService.getStudents;
import static com.serheev.crudMap.CrudService.updateStudent;
import static com.serheev.crudMap.CrudService.addStudent;
import static com.serheev.crudMap.CrudService.createGroup;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CrudMapTest {
    private static Map<Integer, Student> students;
    private static Group groupMath;

    @Before
    public void studentsListShouldBeCreate() {
        students = new HashMap<>();
        groupMath = createGroup(students, 1, 1, "Math");

        addStudent(groupMath, new Student("Alexey", 17), 1);
        addStudent(groupMath, new Student("Boris", 18), 2);
        addStudent(groupMath, new Student("Henry", 19), 3);
    }

    @Test
    public void studentShouldBeAddToList() {
        assertEquals(3, getStudents(groupMath).size());
        addStudent(groupMath, new Student("Vasiliy", 21), 4);
        assertEquals(4, getStudents(groupMath).size());
        assertEquals("Vasiliy", getStudents(groupMath).get(4).getName());
    }

    @Test
    public void studentsListShouldBeRead() {
        assertEquals(3, getStudents(groupMath).size());
        assertEquals("Boris", getStudents(groupMath).get(2).getName());
        assertEquals(18, getStudents(groupMath).get(2).getAge());
    }

    @Test
    public void studentShouldBeUpdate() {
        assertEquals("Boris", groupMath.getStudents().get(2).getName());
        updateStudent(groupMath, 2, "Yuriy", 18);
        assertEquals("Yuriy", groupMath.getStudents().get(2).getName());
    }

    @Test
    public void studentShouldBeRemove() {
        assertEquals(3, getStudents(groupMath).size());
        assertTrue(getStudents(groupMath).containsKey(2));
        removeStudent(groupMath, 2);
        assertEquals(2, getStudents(groupMath).size());
        assertFalse(getStudents(groupMath).containsKey(2));
    }

    @Test
    public void allStudentsShouldBeRemove() {
        assertEquals(3, getStudents(groupMath).size());
        removeAllStudents(groupMath);
        assertEquals(0, getStudents(groupMath).size());
    }
}