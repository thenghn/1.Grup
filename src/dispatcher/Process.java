package dispatcher;



public class Process {
	int id;
    private int arrivalTime;
    private int priority;
    private int burstTime;
    public int startingBurstTime;

// 'int id' işlem idsini tutan değişken
// 'int desireTime' oluşturma zamanını tutan değişken
// 'int Priority' önerilerini tutan değişken
// 'int burstTime' patlama zamanını tutan değişken
// 'int startupBurstTime' başlangıçtaki patlama süresini tutan değişken

    public Process(int arrivalTime, int priority, int burstTime) {
        this.arrivalTime = arrivalTime;
        this.priority = priority;
        this.burstTime = burstTime;
        startingBurstTime=burstTime;
        id=Dispatcher.idCounter;
        Dispatcher.idCounter++;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getPriority() {
        return priority;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }
}
