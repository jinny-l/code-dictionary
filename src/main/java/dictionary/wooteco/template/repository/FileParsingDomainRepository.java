package dictionary.wooteco.template.repository;

import dictionary.wooteco.template.domain.FileParsingDomain;
import dictionary.wooteco.util.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileParsingDomainRepository {

    private static final List<FileParsingDomain> FILE_PARSING_DOMAINS = new ArrayList<>();

    static {
        List<String> lines = FileReader.read("src/main/resources/.csv"); // TODO 파일 경로에 맞게 수정

        FILE_PARSING_DOMAINS.addAll(
                FileParsingDomain.parseFromCsvFile(lines)
        );
    }

    public static List<FileParsingDomain> findAll() {
        return Collections.unmodifiableList(FILE_PARSING_DOMAINS);
    }
}
