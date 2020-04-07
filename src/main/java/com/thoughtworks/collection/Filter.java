package com.thoughtworks.collection;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;


    public Filter(List<Integer> array) {
     this.array = array;


    }

    public List<Integer> filterEven() {

        List<Integer> result = array.stream()
                .filter(element -> element % 2 == 0).collect(Collectors.toList());
        return result;

        //throw new NotImplementedException();
    }


    public List<Integer> filterMultipleOfThree() {
        List<Integer> result = array.stream()
                .filter(element -> element % 3 == 0).collect(Collectors.toList());

        return result;
        //throw new NotImplementedException();
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList){

        List<Integer> result = new ArrayList<Integer>(firstList);
        result.retainAll(secondList);
        return result;

        //// result now contains only the elements which are contained in listA and listB.
        //throw new NotImplementedException();
    }

    public List<Integer> getDifferentElements() {
        List<Integer> result = array.stream()
        .distinct().collect(Collectors.toList());
        return result;
    }
}