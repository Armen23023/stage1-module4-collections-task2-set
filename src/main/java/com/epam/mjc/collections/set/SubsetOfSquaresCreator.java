package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Iterator<Integer> iterator = sourceList.iterator();
        HashSet<Integer> set = new HashSet<>();
        while (iterator.hasNext()){
            int i = iterator.next();
            if (i * i  >= lowerBound && i * i <= upperBound) {
                set.add(i*i);
            }
        }
        return set;
    }
}
