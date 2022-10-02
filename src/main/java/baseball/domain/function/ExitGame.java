package baseball.domain.function;

import baseball.game.Context;

public class ExitGame implements Functions {
    @Override
    public Functions command(Context context) {
        return new ExitGame();
    }

    @Override
    public boolean isPlay() {
        return false;
    }
}
