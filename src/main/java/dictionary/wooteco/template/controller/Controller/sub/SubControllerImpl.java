package dictionary.wooteco.template.controller.Controller.sub;

import dictionary.wooteco.template.controller.Controller.Controller;
import dictionary.wooteco.template.service.SingletonService;

public class SubControllerImpl implements Controller {

    private final SingletonService singletonService;

    public SubControllerImpl(SingletonService singletonService) {
        this.singletonService = singletonService;
    }

    @Override
    public void run() {
        // TODO 요구사항에 맞게 구현
    }
}
