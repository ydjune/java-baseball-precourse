package baseball;

import baseball.domain.computer.Computer;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ComputerTest {

    @Test
    public void 랜덤수_테스트(){
        Computer computer = new Computer();
        List<Integer> numList = computer.RANDOM_NUMBER;

        for (int a : numList) {
            System.out.println("a: " + a);
        }
    }
}
