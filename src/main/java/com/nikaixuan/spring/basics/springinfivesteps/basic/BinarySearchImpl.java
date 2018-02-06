package com.nikaixuan.spring.basics.springinfivesteps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by nikaixuan on 5/2/18.
 */
@Component
public class BinarySearchImpl {

    private Logger LOGGER = LoggerFactory.getLogger(BinarySearchImpl.class);

    @Autowired
    private SortAlgo sortAlgo;

//    public BinarySearchImpl(SortAlgo sortAlgo){
//        this.sortAlgo = sortAlgo;
//    }

    public void setSortAlgo(SortAlgo sortAlgo) {
        this.sortAlgo = sortAlgo;
    }

    public int binarySearch(int[] nums, int numberToSearch){
        //Use sort algo
        //do binary search
        int[] numafter = sortAlgo.sort(nums);
        System.out.println(sortAlgo);
        return 3;
    }

    @PostConstruct
    public void postConstruct(){
        LOGGER.info("postconstruct");
    }

    @PreDestroy
    public void preDestroy(){
        LOGGER.info("predestroy");
    }
}
