package baseball.domain.computer;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class Computer {

    public static List<Integer> RANDOM_NUMBER;

    public Computer(){
        RANDOM_NUMBER = Randoms.pickUniqueNumbersInRange(100, 999, 1);
    }



}
