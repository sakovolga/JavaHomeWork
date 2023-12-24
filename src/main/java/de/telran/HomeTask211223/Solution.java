package de.telran.HomeTask211223;

import java.util.*;

public class Solution {
    public static HashMap<String, User> removeDoublesHashMap(HashMap<String, User> map){
        HashMap<String, User> mapWithoutDoubles = new HashMap<>();
        for (Map.Entry<String, User> pare: map.entrySet()){
            if (!isExistCopy(mapWithoutDoubles, pare)){
                mapWithoutDoubles.put(pare.getKey(), pare.getValue());
            }
        }
        return mapWithoutDoubles;
    }

    public static boolean isExistCopy(HashMap<String, User> map, Map.Entry<String, User> entry){
        User userFounded = entry.getValue();
        for (Map.Entry<String, User> pare: map.entrySet()){
            User userInMap = pare.getValue();
            if (userFounded.compareTo(userInMap) == 0){
                return true;
            }
        }
        return false;
    }
}
