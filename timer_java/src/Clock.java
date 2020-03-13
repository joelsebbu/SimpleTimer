class Clock {
    private int sec,min;
    Clock(int min,int sec){
        this.min=min;
        this.sec=sec;
        if(sec>=60 || sec<0){
            System.out.println("Error: Invalid value for Seconds !");
        }
        if(min<0){
            System.out.println("Error: Invalid value for Minutes !");
        }
    }
    Clock(){
        min=0;
        sec=0;
    }
    void printTime(){
        System.out.println("Time = "+min+":"+sec);
    }
    private void printTime(int min,int sec){
        System.out.println("Time = "+min+":"+sec);
    }
    void reset(){
        sec=0;
        min=0;
        printTime(min,sec);
    }
    void addTime(Clock c1, Clock c2){
        int _min=c1.min+c2.min+((c1.sec+c2.sec)/60);
        int _sec=(c1.sec+c2.sec)%60;
        printTime(_min,_sec);
    }
    void increment(){
        sec=(sec+1)%60;
        if(sec==0){
            min+=1;
        }
        printTime(min,sec);
    }
    void decrement(){
        if(sec==0){
            if(min==0){
                System.out.println("Not Possible");
                return;
            }
            min-=1;
        }
        sec=(59+sec)%60;
        printTime(min,sec);
    }
}
