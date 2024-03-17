package Collections;

import java.util.*;

public class LinkedHashSetAnalyzer implements KeyAnalyzer{

    Set<String> set;

    public LinkedHashSetAnalyzer(){
        set=new LinkedHashSet<>();
    }


    @Override
    public void storeKeyword(String keyword) {
        set.add(keyword);
    }

    @Override
    public List<String> getAllKeywords() {
      List<String>list=new ArrayList<>(set);
      return list;
    }
}
