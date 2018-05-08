package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

        Map<String,Integer> result = new HashMap<String,Integer>();
        for (String st :collectionA){
            if (result.containsKey(st)){
                result.put(st,result.get(st)+1);
            }
            else {
                result.put(st,1);
            }
        }
        List<String> list2 = new ArrayList();
        int diff = 0;               //满3减1
        for (String string :object.get("value")){
            list2.add(string);
        }
        for (String str :list2){
            if (result.containsKey(str)){
                diff = result.get(str)/3;
                result.put(str,result.get(str)-diff);
            }
        }
        return result;
    }
}
