package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {

        Operation<Integer> op = x -> {
            List<Integer> list = new ArrayList<>();
            for(int i : x){
            list.add(i/divider);
            }
            return list;
        };
        return op;
    }
}
