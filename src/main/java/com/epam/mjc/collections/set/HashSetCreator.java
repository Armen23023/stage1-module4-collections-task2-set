package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet();
        int a;
        for (int i = 0; i < sourceList.size(); i++) {
            a = sourceList.get(i);
            if (a % 2 == 0) {
                hashSet.add(a);
                while (a % 2 == 0) {
                    a = a / 2;
                    hashSet.add(a);
                }
            } else {
                hashSet.add(a);
                a = a * 2;
                hashSet.add(a);
            }
        }
        return hashSet;
    }
}
