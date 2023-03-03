package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String>list=new ArrayList<>();
        for (Map.Entry<String, Set<String>> map: projects.entrySet()){
            for (String s : map.getValue()) {
                if (s.equals(developer)){
                    list.add(map.getKey());
                }
            }
        }
//        list.sort(Comparator.comparingInt(String::length));
//        list.sort(String::compareToIgnoreCase);
//        list.sort(Comparator.reverseOrder());
        list.sort((o1, o2) -> {
            if (o1.length()!=o2.length()) {
                return o2.length()-o1.length(); //overflow impossible since lengths are non-negative
            }
            return o2.compareTo(o1);
        });
//        list.sort(Comparator.reverseOrder());
        return list;
    }
}
