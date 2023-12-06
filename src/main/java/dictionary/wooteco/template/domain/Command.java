package dictionary.wooteco.template.domain;

import java.util.Arrays;

public enum Command {

    ORDER(1, "주문"),
    EXIT(2, "종료");

    private final int code;
    private final String text;

    Command(int code, String text) {
        this.code = code;
        this.text = text;
    }

    public static Command from(int code) {
        return Arrays.stream(Command.values())
                .filter(command -> command.code == code)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("유효하지 않은 기능입니다.")); // TODO 내용에 맞게 에러 메시지 수정
    }

    @Override
    public String toString() {
        // TODO 형식에 맞게 수정
        return String.format("%d - %s", code, text);
    }
}
