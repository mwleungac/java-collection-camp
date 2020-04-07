package com.thoughtworks.collection;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> result = array.stream()
                .map(element -> element*3)
                .collect(Collectors.toList());
        return result;
        //throw new NotImplementedException();
    }

    public List<String> mapLetter() {
        List<String> result = array.stream()
                .map(element -> letterList.get(element - 1))
                .collect(Collectors.toList());
        //throw new NotImplementedException();
        return result;
    }

    public List<Integer> sortFromSmall() {
        List<Integer> result = array.stream()
                .sorted()
                .collect(Collectors.toList());
        return result;
        //throw new NotImplementedException();
    }

    public List<Integer> sortFromBig() {
        List<Integer> result = array.stream()
                .collect(Collectors.toList());
        Collections.reverse(result);
        return result;
        // throw new NotImplementedException();
    }
}
