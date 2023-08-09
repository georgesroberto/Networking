public class Basics{
    public static void main(String [] args){
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();        
        Thread thread4 = new Thread("Classes");
        Thread thread3 = new Thread();

        System.out.println(thread1.getName());
        System.out.println(thread2.getName());
        System.out.println(thread3.getName());
        System.out.println(thread4.getName());
    }
}