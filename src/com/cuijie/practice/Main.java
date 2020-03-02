package com.cuijie.practice;

import com.cuijie.practice.data.structure.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {



    public static void main(String[] args) {
        Other other = new Other();
        other.print();

    }
    private static class Person {
        public String name = "tom";
    }
    private static class Other{
        String name = "tom";
        Person p = new Person();
        public void print(){
            System.out.println(p.name == name);
        }
    }
    private String findSumIsK(int[] array, int k){
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i<array.length; i++){
            int key = k-array[i];
            if(map.containsKey(key)){
                return map.get(key) + "," + i;
            }else{
                map.put(key, i);
            }
        }
        return "";
    }
    private static boolean existSumIsK(int[] array, int k){
        boolean result = false;
        int pre = 0;
        int lat = array.length-1;
        Arrays.sort(array);
        while(pre != lat){
            int sum = pre + lat;
            if(sum < k){
                pre++;
            }else if(sum > k){
                lat--;
            }else{
                return true;
            }
        }
        return result;
    }



}
