package com.serheev.crudMap;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Map;

@AllArgsConstructor
@Getter
@ToString
public class Group {
    private Map<Integer, Student> students;
    private int id;
    private int course;
    private String faculty;
}
