class Clock {
    private Desplay hour;
    private Desplay minute;
    private Desplay second;

    public Clock(int hour, int minute, int second){
        this.hour = new Desplay(24);
        this.minute = new Desplay(60);
        this.second = new Desplay(60);

        this.hour.setValue(hour);
        this.minute.setValue(minute);
        this.second.setValue(second);
    }


    public void tick(){
        second.increase();
        if (second.getValue() == 0){
            minute.increase();
            if (minute.getValue() == 0){
                hour.increase();
            }
        }
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}