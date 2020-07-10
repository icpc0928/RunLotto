package com.Lottery;

import java.util.HashMap;
import java.util.List;

public class RunLotto {

    public static void main(String[] arg){
        WiliLotto wiliLotto = new WiliLotto(100);
        HashMap<String, List> result = wiliLotto.operation();




        for(String key : result.keySet()){
            System.out.println("key: " + key);
            System.out.println(result.get(key));

        }


    }



}
