package Collections;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        KeyAnalyzer a = new ListKeyAnalyzerImpl();//->can use all methods of listKeyAnalyzersimpl
//        a.storeKeyword("cristiano");
//        a.storeKeyword("messi");
//        a.storeKeyword("ramos");
//        a.storeKeyword("cristiano");
//        a.storeKeyword("messi");
//        a.storeKeyword("ramos");
//        System.out.println(a.getAllKeywords());

//    KeyAnalyzer analyzer=new ListKeyAnalyzerImpl();//->can use all methods of keyanalyzer
//    analyzer.storeKeyword("messi");
//    System.out.println();

        //set used to remove duplicates
//        KeyAnalyzer k = new SetKeyAnalyzer();
//        k.storeKeyword("cristiano");
//        k.storeKeyword("messi");
//        k.storeKeyword("ramos");
//        System.out.println(k.getAllKeywords());

//        linkedHashset to maintain insertion orders
//        KeyAnalyzer k=new LinkedHashSetAnalyzer();
//        k.storeKeyword("cristiano");
//        k.storeKeyword("messi");
//        k.storeKeyword("ramos");
//        System.out.println(k.getAllKeywords());

        List<Integer>integerList=new ArrayList<>();



        

    }


}
