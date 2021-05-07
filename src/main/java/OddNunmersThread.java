
public class OddNunmersThread extends Thread{
    public void run (){
        for (int i=0 ; i<=100 ; i++)
        {
            if (i % 2 != 0)
            {
                 try {
                    System.out.println( "Odd = " +i);
                    Thread.sleep(50);
                }
                catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        }
    }
}
