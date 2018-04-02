package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
//要考虑的特殊情况更多
        Map<String, Integer> result = new HashMap<String, Integer>();
        for (String str :collection1){
            //一般情况
            if (str.length() == 1){
                if (result.containsKey(str)){
                    result.put(str,result.get(str)+1);
                }
                else{
                    result.put(str,1);
                }
            }
            //长度不为1的特殊情况，用正则表达式截取其中的数字
            else {
                String strvalue = str.substring(0,1);
                String regExp = "[^0-9]";
                Pattern pattern = Pattern.compile(regExp);
                Matcher matcher = pattern.matcher(str);

                int strcount = Integer.parseInt(matcher.replaceAll(""));
                if (result.containsKey(strvalue)){
                    result.put(strvalue,result.get(strvalue)+strcount);
                }
                else{
                    result.put(strvalue,strcount);
                }

            }
        }
        return result;
    }
}
