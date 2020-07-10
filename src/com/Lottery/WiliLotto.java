package com.Lottery;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class WiliLotto {

    int testTimes;
    int balls = 38;
    int groups = 8;

    int getBall = 6;

    ArrayList<Integer> numbers = new ArrayList<>();
    ArrayList<Integer> group = new ArrayList<>();

    HashMap<Integer, Integer> resultBall = new HashMap<>();
    HashMap<Integer, Integer> resultGroup = new HashMap<>();

    public WiliLotto(int testTimes){
        this.testTimes = testTimes;
        for(int i = 0; i < balls; i++){
            numbers.add(i);
            resultBall.put(i, 0);
        }
        for(int i = 0; i < groups; i++){
            group.add(i);
            resultGroup.put(i, 0);
        }

    }




    public HashMap<String, HashMap<Integer, Integer>> operation(){
        HashMap<String, HashMap<Integer, Integer>> object = new HashMap<>();



        for(int runTimes = 0; runTimes < testTimes; runTimes++) {
            if((runTimes + 1) % (testTimes / 100) == 0) System.out.println((runTimes + 1) / (testTimes / 100) + "%");
            ArrayList<Integer> numArr = (ArrayList<Integer>)numbers.clone();

            for (int i = 0; i < getBall; i++) {
                int theIndex;
                theIndex = (int) (Math.random() * numArr.size());
                int theBall = numArr.get(theIndex);
                resultBall.put(theBall, resultBall.get(theBall) + 1);

                numArr.remove(theIndex);
            }
            int tempGroup = (int) (Math.random() * groups);
            resultGroup.put(tempGroup, resultGroup.get(tempGroup) + 1);



        }
        object.put("ResultBall", resultBall);
        object.put("ResultGroup", resultGroup);
        return object;
    }

}














