package castle;

public class Handler {
    protected Game game; // 引用 Game 对象

    public Handler (Game game){
        this.game = game;
    }
    public void doCmd(String wordString) {
    }
    public boolean isHelp(){
        return false;
    }
    public boolean isBye(){
        return false;
    }
}
