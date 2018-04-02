package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

        Map<String,Integer> result = new HashMap<String,Integer>(collectionA);
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
