package dictionary.wooteco.template.view;

import dictionary.wooteco.template.domain.Command;
import java.util.Arrays;
import java.util.stream.Collectors;

public class OutputView {

    public static final String ERROR_MESSAGE_PREFIX = "[ERROR] ";

    private OutputView() {
    }

    public static void printError(Exception e) {
        System.out.printf("%s%s%n", ERROR_MESSAGE_PREFIX, e.getMessage());
    }

    public static void printCommand(Command[] commands) {
        System.out.println(); // TODO 형식에 맞게 출력문 입력

        String format = "## 메인화면%n%s%n";    // TODO 형식에 맞게 포맷 수정
        String arg = Arrays.stream(commands) // TODO 더 좋은 변수명 있으면 수정
                .map(Command::toString)
                .collect(Collectors.joining(System.lineSeparator()));

        System.out.printf(format, arg);
    }
}
