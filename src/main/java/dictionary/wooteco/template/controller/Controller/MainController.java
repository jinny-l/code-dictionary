package dictionary.wooteco.template.controller.Controller;

import dictionary.wooteco.template.domain.Command;
import dictionary.wooteco.template.view.InputView;
import dictionary.wooteco.template.view.OutputView;

public class MainController implements Controller {

    @Override
    public void run() {
        Command command;

        do {
            command = readCommand();
            SubController.run(command);

        } while (command != Command.EXIT);
    }

    private Command readCommand() {
        try {
            return InputView.readCommand();

        } catch (IllegalArgumentException e) {
            OutputView.printError(e);
            return readCommand();
        }
    }
}
