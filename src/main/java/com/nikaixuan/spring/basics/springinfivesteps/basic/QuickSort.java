package com.nikaixuan.spring.basics.springinfivesteps.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by nikaixuan on 5/2/18.
 */
@Component
@Primary
public class QuickSort implements SortAlgo {
        public int[] sort(int[] nums){
            return nums;
        }
}
