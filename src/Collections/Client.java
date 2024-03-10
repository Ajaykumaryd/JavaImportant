package Collections;

public class Client {
    public static void main(String[] args) {
    ListKeyAnalyzerImpl a=new ListKeyAnalyzerImpl();//->can use all methods of listKeyAnalyzersimpl
    a.storeKeyword("cristiano");
    a.storeKeyword("messi");
    a.storeKeyword("ramos");
    System.out.println(a.getAllKeywords());

    KeyAnalyzer analyzer=new ListKeyAnalyzerImpl();//->can use all methods of keyanallyzer
    a.storeKeyword("messi");
        System.out.println();

    }
}
