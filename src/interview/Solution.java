package interview;

/**
 * desc:
 *
 * @author zhyongfeng
 * @date 2019/06/01
 */

import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution {

    public static boolean isStartWithNumber(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str.charAt(0) + "");
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }


    public static List<String> orderedJunctionBoxes(int numberOfBoxes,
                                                    List<String> boxList) {

        TreeMap<String, String> treeMapOld = new TreeMap<>();
        TreeMap<String, String> treeMapNew = new TreeMap<>();


        for (int i = 0; i < numberOfBoxes; i++) {
            String key = boxList.get(i).split(" ")[0];
            String value = boxList.get(i).substring(key.length(), boxList.get(i).length());
            if (!isStartWithNumber(value)) {
                treeMapOld.put(key, value);
            } else {
                treeMapNew.put(key, value);
            }
        }

        treeMapOld.putAll(treeMapNew);


        List<Entry<String, String>> sortList = new ArrayList<Entry<String, String>>(treeMapOld.entrySet());

        Collections.sort(sortList, new Comparator<Map.Entry<String, String>>() {
            //升序排序
            public int compare(Entry<String, String> o1, Entry<String, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        List<String> result = new ArrayList<>();
        for (Entry<String, String> entry : sortList) {
            result.add(entry.getKey() + "" + entry.getValue());
        }
        return result;
    }

    public static void main(String[] args) {

        List<String> boxList = new ArrayList<>();
        boxList.add("ykc 82 01");
        boxList.add("eo first qpx");
        boxList.add("09z cat hamster");
        boxList.add("06f 12 25 6");
        boxList.add("az0 first qpx");
        boxList.add("236 cat dog rabbit snake");

        List<String> result = orderedJunctionBoxes(boxList.size(), boxList);
        for (String box : result) {
            System.out.println(box);
        }
    }
}