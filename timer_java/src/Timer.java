public class Timer {
    public static void main(String[] args){
        Clock c1=new Clock(5,31);
        Clock c2=new Clock(5,31);
        Clock c3=new Clock();
        c2.addTime(c1,c2);
        c1.addTime(c1,c2);
        c3.addTime(c3,c2);
        c3.printTime();
        c1.reset();
        c1.increment();
        c2.increment();
        Clock c4=new Clock(3,65);


    }
}
