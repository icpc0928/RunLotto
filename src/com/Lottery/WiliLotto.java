package com.Lottery;

import java.lang.reflect.Array;
import java.util.*;

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




    public HashMap<String, List> operation(){
        HashMap<String, List> object = new HashMap<>();



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

        //排序
        List<Map.Entry<Integer, Integer>> ballList = new ArrayList<>(resultBall.entrySet());
        Collections.sort(ballList, ((o1, o2) -> (o2.getValue() - o1.getValue())));
        List<Map.Entry<Integer, Integer>> groupList = new ArrayList<>(resultGroup.entrySet());
        Collections.sort(groupList,(o1, o2) -> (o2.getValue() - o1.getValue()));


        object.put("ResultBall", ballList);
        object.put("ResultGroup", groupList);
        return object;
    }

}














