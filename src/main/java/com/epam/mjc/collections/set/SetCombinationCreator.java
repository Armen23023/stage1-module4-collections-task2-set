package com.epam.mjc.collections.set;

import java.util.*;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> set = new HashSet<String>();
        String next = null;
        while (secondSet.iterator().hasNext()){
             next = secondSet.iterator().next();
            if (firstSet.contains(next))
            {
                set.add(next);
            }
        }
        while (thirdSet.iterator().hasNext()){
             next = thirdSet.iterator().next();
            if (!firstSet.contains(next) && !secondSet.contains(next)){
                set.add(next);
            }
        }
        return set;
    }
}
