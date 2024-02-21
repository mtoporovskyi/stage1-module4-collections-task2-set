package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        HashSet<String> firstHashSet = new HashSet<>(firstSet);
        firstHashSet.retainAll(secondSet);
        firstHashSet.removeAll(thirdSet);

        thirdSet.removeAll(firstSet);
        thirdSet.removeAll(secondSet);

        firstHashSet.addAll(thirdSet);

        return firstHashSet;
    }
}
