class Desplay {
    private int value = 0;
    private int limit;

    public Desplay(int limit){
        this.limit = limit;
    }

    public void increase(){
        ++value;
        if (value == this.limit){
            value = 0;
        }
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (value>=0 && value < this.limit){
            this.value = value;
        } else {
            throw new IllegalArgumentException("值超出范围");
        }
    }
    
    @Override
    public String toString(){
        return String.format("%02d", value);
    }
}

