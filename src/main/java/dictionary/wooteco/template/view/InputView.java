package dictionary.wooteco.template.view;

import camp.nextstep.edu.missionutils.Console;
import dictionary.wooteco.template.domain.Command;

public class InputView {

    private InputView() {
    }

    public static Command readCommand() {
        System.out.println(); // TODO 출력문 구현

        return Command.from(readInt());
    }

    private static int readInt() {
        try {
            return Integer.parseInt(readLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(""); // TODO 내용에 맞게 에러 메시지 수정
        }
    }

    private static String readLine() {
        String input = Console.readLine().strip();
        validateBlank(input);
        return input;
    }

    private static void validateBlank(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException(""); // TODO 내용에 맞게 에러 메시지 수정
        }
    }
}
