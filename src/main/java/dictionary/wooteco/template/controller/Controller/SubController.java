package dictionary.wooteco.template.controller.Controller;

import dictionary.wooteco.template.controller.Controller.sub.SubControllerImpl;
import dictionary.wooteco.template.domain.Command;
import dictionary.wooteco.template.service.ServiceConfig;
import java.util.Arrays;

public enum SubController {

    ORDER(
            Command.ORDER,
            new SubControllerImpl(ServiceConfig.singletonService())
    );

    private final Command command;
    private final Controller controllerImpl;

    SubController(Command command, Controller controllerImpl) {
        this.command = command;
        this.controllerImpl = controllerImpl;
    }

    public static void run(Command command) {
        Arrays.stream(SubController.values())
                .filter(subController -> subController.command == command)
                .findAny()
                .ifPresentOrElse(
                        subController -> subController.controllerImpl.run(),
                        () -> {
                            throw new IllegalArgumentException("매칭되는 컨트롤러가 없습니다."); // TODO 요구사항에 맞게 에러 메시지 수정
                        }
                );
    }
}
