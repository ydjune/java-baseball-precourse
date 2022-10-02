package baseball.domain.function;

import baseball.game.Context;

public class FinishGame implements Functions {


    @Override
    public Functions command(Context context) {
        return null;
    }


    @Override
    public boolean isPlay() {
        return false;
    }


}
