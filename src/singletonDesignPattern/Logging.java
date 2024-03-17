package singletonDesignPattern;
//once instance of class throughout the project
//saves memory and reuse the same object
//Application->Logging,DataBase Connectivity/Http Connectivity
public class Logging {

//    public static Logging instance=new Logging();//early initializations
    public static Logging instance;  //static->so that instance can be called from class name Logging,Lazy Initilizations
    private Logging(){ //private->so that it can't be called from other class
    }

    public static Logging getInstance() {
      if(instance==null){
          System.out.println("instance is null");//it gets printed once only
          instance=new Logging();
      }
        return instance;
    }

    public void printMsg(String msg){
        System.out.println("Message is "+msg);
    }

    public static void main(String[] args) {
        Logging logging = Logging.getInstance();//->lazy initialization
        logging.printMsg("This is mine");

        Logging logging1 = Logging.getInstance();
        logging1.printMsg("This is mine 2");

//        Logging logging2=Logging.instance;//->//early initializations

    }

}
