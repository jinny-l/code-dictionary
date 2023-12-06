package dictionary.wooteco.template.service;

public final class ServiceConfig {

    private ServiceConfig() {
    }

    public static SingletonService singletonService() {
        return SingletonService.getInstance();
    }
}
