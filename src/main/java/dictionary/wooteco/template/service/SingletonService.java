package dictionary.wooteco.template.service;

public class SingletonService {

    private static final SingletonService SINGLETON_SERVICE = new SingletonService();

    private SingletonService() {
    }

    public static SingletonService getInstance() {
        return SINGLETON_SERVICE;
    }
}
