package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetKeyAnalyzer implements KeyAnalyzer{


    Set<String>set;

    public SetKeyAnalyzer(){
        set=new HashSet<>();
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
