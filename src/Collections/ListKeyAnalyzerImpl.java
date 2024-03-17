package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListKeyAnalyzerImpl implements KeyAnalyzer{


    List<String>list;

    public ListKeyAnalyzerImpl()
    {    //lazyIniatilization
        list=new ArrayList<>();
    }

    public void Show(){
        System.out.println("print show");
    }


    @Override
    public void storeKeyword(String keyword) {
        list.add(keyword);
    }

    @Override
    public List<String> getAllKeywords() {
        return list;
    }


}
