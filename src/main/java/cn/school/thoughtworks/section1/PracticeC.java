package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List list1 = new ArrayList(collection1);
        List list2 = new ArrayList();
        for(List<String> strings : collection2.values()){
            list2.addAll(strings);
        }
        list1.retainAll(list2);
        return list1;
    }
}
