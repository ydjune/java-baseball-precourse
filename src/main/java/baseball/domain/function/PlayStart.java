package baseball.domain.function;

import baseball.game.Context;

public class PlayStart implements Functions {

    @Override
    public Functions command(Context context) {

        if(context.compare() == true){
            return new FinishGame();
        }

        return new WaitUserInput();
    }

    @Override
    public boolean isPlay() {
        return false;
    }
}
