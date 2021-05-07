
public class main {
    public static void main(String[] args) {
        EvenNunmersThread evenNunmersThread = new EvenNunmersThread ();
        OddNunmersThread  oddNunmersThread = new OddNunmersThread();
        
        evenNunmersThread.start();
        oddNunmersThread.start();
        
        //Runnable Interface
        RunnableThread runnableThread  = new RunnableThread();
        Thread myThread = new Thread(runnableThread);
        try{
            Thread.sleep(800);
            myThread.start();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        
    }
}
