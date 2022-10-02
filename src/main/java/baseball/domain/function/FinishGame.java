package baseball.domain.function;

import baseball.game.Context;
import baseball.io.InputFunction;
import baseball.io.OutputFunction;

public class FinishGame implements Functions {


    @Override
    public Functions command(Context context) {
        //게임 재진행 여부에 따라 종료 또는 재스타트 여부 확인

        OutputFunction.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
        String command = InputFunction.readLine();
        if(command.equals("2")){
            return new ExitGame();
        }

        return new GameStart();
    }


    @Override
    public boolean isPlay() {
        return true;
    }


}
