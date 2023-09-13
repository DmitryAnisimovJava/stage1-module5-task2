package com.epam.mjc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
    	
    	Operation<Integer> divideOperation = x -> {
    		List<Integer> returnList = new ArrayList<>();
    		for (Iterator<Integer> iterator = x.iterator(); iterator.hasNext();) {
				Integer integer = iterator.next();
				returnList.add(integer / divider);
			}
    		return returnList;
    	};
    	return divideOperation;
    }
}
