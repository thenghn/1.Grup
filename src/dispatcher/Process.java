package dispatcher;



public class Process {
	int id;
    private int arrivalTime;
    private int priority;
    private int burstTime;
    public int startingBurstTime;

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