package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> intSet = new HashSet<>();
        for (Integer sourceValue: sourceList) {
            if (sourceValue % 2 == 0) {
                while (sourceValue % 2 == 0) {
                    intSet.add(sourceValue);
                    sourceValue /= 2;
                }
                intSet.add(sourceValue);

            } else {
                intSet.add(sourceValue);
                intSet.add(sourceValue * 2);
            }
        }

        return intSet;
    }
}
