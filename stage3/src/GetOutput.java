
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeSet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kasia
 */
public class GetOutput {

    public static List SortOutput(HashMap <String, Double> output){
        HashMap tmpMap = new LinkedHashMap();
        List tmpMapKeys = new ArrayList(output.keySet());
        List tmpMapValues = new ArrayList(output.values());
        TreeSet sortedSet = new TreeSet(tmpMapValues);
        Object[] sortedArray = sortedSet.toArray();
        int size = sortedArray.length;

        /*for (int i=0; i<size; i++) {
            tmpMap.put(tmpMapKeys.get(tmpMapValues.indexOf(sortedArray[i])), sortedArray[i]);
            System.out.println(sortedArray[i]);
        }*/

        List returnList = new ArrayList();
        returnList.add(tmpMapKeys.get(tmpMapValues.indexOf(sortedArray[size-1])));
        returnList.add(sortedArray[size-1]);

        return returnList;
    }
}
