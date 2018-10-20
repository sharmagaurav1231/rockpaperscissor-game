class A implements Runnable
{
  public void run()
  {
    System.out.println("Inside thread A");
    for(int i=1;i<=5;i++)
    {
      System.out.println("Thread A"+i);
    }
    System.out.println("Exiting thread A");
  }
}
class thread3
{
  public static void main(String arg[])
  {
    A runobj=new A();
    Thread t=new Thread(runobj);
    t.start();
  }
}