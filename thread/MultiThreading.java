package thread;
class Printer{
    public void print(int num, String docName){
        for(int i=1; i<=num; i++){
            System.out.println(">> Printing document "+docName+" "+i);
        }
    }
}
class MyTask extends Thread{
    Printer pRef;
    MyTask(Printer p){
        pRef=p;
    }

    @Override
    public void run(){
        pRef.print(10, "Document1");
    }
}

class YourTask extends Thread{
    Printer pRef;
    YourTask(Printer p){
        pRef=p;
    }

    @Override
    public void run(){
        pRef.print(10, "Document2");
    }
}

public class MultiThreading {
    public static void main(String args[]){
        System.out.println("Application started");

        Printer printer=new Printer();
        MyTask mRef= new MyTask(printer);
        YourTask yRef= new YourTask(printer);

        mRef.start();
        yRef.start();

        System.out.println("Application finished");
    }
}
