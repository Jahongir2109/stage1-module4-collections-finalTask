package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer,Set<String>> map=new HashMap<>();
        Set<String>stringSet;
        for (Map.Entry<String,Integer> entry:sourceMap.entrySet()){
            stringSet=map.get(entry.getKey().length());
            if(stringSet!=null){
                if(stringSet.add(entry.getKey())){
                    map.put(entry.getKey().length(),stringSet);
                }else {
                    map.put(entry.getKey().length(),stringSet);
                }
            }else {
                stringSet=new HashSet<>();
                stringSet.add(entry.getKey());
                map.put(entry.getKey().length(),stringSet);
            }


        }
        return map;
    }
}
