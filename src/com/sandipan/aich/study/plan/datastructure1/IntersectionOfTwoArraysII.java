package com.sandipan.aich.study.plan.datastructure1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i : nums1)
        {
            if(!map.containsKey(i))
                map.put(i, 1);
            else
                map.put(i, map.get(i) + 1);
        }
        
        for(int i : nums2)
        {
            if(map.containsKey(i))
            {
                list.add(i);
                if(map.get(i) == 1)
                    map.remove(i);
                else
                    map.put(i, map.get(i) -1);
            }
        }
        int[] array = list.stream().mapToInt(i->i).toArray();
        return array;
    }
}
