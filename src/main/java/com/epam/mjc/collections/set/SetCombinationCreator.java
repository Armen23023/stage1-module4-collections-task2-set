package com.epam.mjc.collections.set;

import java.util.*;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> set = new HashSet<String>();
        Iterator<String> iterator = secondSet.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (firstSet.contains(next))
            {
                set.add(next);
            }
        }
        Iterator<String> it = thirdSet.iterator();
        while (it.hasNext()){
            String next = it.next();
            if (!firstSet.contains(next) ){
                if (!secondSet.contains(next)){
                    set.add(next);
                }
            }
        }
        return set;
    }
}
