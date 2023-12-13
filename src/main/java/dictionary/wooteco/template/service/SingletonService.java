package dictionary.wooteco.template.service;

public class SingletonService {

    private static final SingletonService INSTANCE = new SingletonService();

    private SingletonService() {
    }

    public static SingletonService getInstance() {
        return INSTANCE;
    }
}
