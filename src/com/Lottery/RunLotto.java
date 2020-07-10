package com.Lottery;

import java.util.HashMap;

public class RunLotto {

    public static void main(String[] arg){
        WiliLotto wiliLotto = new WiliLotto(100000000);
        HashMap<String, HashMap<Integer, Integer>> result = wiliLotto.operation();

        for(String key : result.keySet()){
            System.out.println("key: " + key);
            System.out.println(result.get(key));

        }

    }



}
