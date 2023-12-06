package dictionary.wooteco.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileReader {

    private FileReader() {
    }

    public static List<String> read(String filePath) {
        try(var lines = Files.lines(Paths.get(filePath))) {
            return lines.collect(Collectors.toList());

        } catch (IOException e) {
            throw new IllegalArgumentException("파일 입출력 관련 오류입니다."); // TODO 요구사항에 맞게 에러 메시지 수정
        }
    }
}
