package dictionary.wooteco.template.domain;

import java.util.List;

public class FileParsingDomain {

    private static final int A_INDEX = 0;
    private static final int B_INDEX = 1;
    private static final int C_INDEX = 2;

    private final String field1;
    private final String field2;
    private final String field3;

    public FileParsingDomain(String field1, String field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public static List<FileParsingDomain> parseFromCsvFile(List<String> lines) {
        return lines.stream()
                .map(FileParsingDomain::parseFileParsingDomain)
                .toList();
    }

    private static FileParsingDomain parseFileParsingDomain(String line) {
        String[] values = line.split(",");

        return new FileParsingDomain(
                values[A_INDEX],
                values[B_INDEX],
                values[C_INDEX]
        );
    }
}
