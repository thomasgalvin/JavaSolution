package com.galvin.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implements the MergeSort algorithm.
 * 
 * The MergeSort algorithm can be defined as:
 * 
 * Given a List of values:
 * 1. Divide the unsorted list into n sublists, each containing 1 element (a list of 1 element is considered sorted).
 * 2. Repeatedly merge sublists to produce new sorted sublists until there is only 1 sublist remaining. This will be the sorted list.
 * 
 * Implement the MergeSort algorithm below. You may assume all values will be
 * non-null.
 * 
 * For more information:
 * https://en.wikipedia.org/wiki/Merge_sort
 */
public class MergeSort {
    public void sort( List<Integer> target ) {
        if( target.isEmpty() ) {
            return;
        }

        List<Integer> result = doSort(target);
        target.clear();
        target.addAll(result);
    }

    /**
     * This will sort a sublist from start (inclusive) to end (exclusive)
     * @param target
     * @param start
     * @param end 
     */
    private List<Integer> doSort( List<Integer> target ){
        if( target.size() < 2 ){
            return target;
        }
        
        List<Integer> left = new ArrayList();
        List<Integer> right = new ArrayList();
        
        int middle = target.size() / 2;
        
        for( int i = 0; i < middle; i++ ){
            left.add( target.get(i) );
        }
        
        for(int i = middle; i < target.size(); i++ ){
            right.add( target.get(i) );
        }
        
        left = doSort(left);
        right = doSort(right);
        return merge(left, right);
    }

    private List<Integer> merge( List<Integer> left, List<Integer> right ){
        
        List<Integer> result = new ArrayList();
        
        while( !left.isEmpty() && !right.isEmpty() ){
            int leftVal = left.get(0);
            int rightVal = right.get(0);
            
            if( leftVal <= rightVal ){
                result.add(leftVal);
                left.remove(0);
            }
            else{
                result.add( rightVal );
                right.remove(0);
            }
        }
        
        //one of these lists is now empty;
        //the other is already sorted, so it can be added as-is
        result.addAll( left );
        result.addAll( right );
        
        return result;
    }
}
