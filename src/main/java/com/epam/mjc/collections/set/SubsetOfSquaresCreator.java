package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> squaresSet = new TreeSet<>();

        for (Integer num : sourceList) {
            squaresSet.add(num * num);
        }

        return squaresSet.subSet(lowerBound, true, upperBound, true);
    }
}
