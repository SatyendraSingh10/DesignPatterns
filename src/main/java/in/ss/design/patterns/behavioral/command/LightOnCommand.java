package in.ss.design.patterns.behavioral.command;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @author Satyendra Singh
 * @project DesignPatterns
 * @package in.ss.design.patterns.command
 * @date 11-12-2018
 * @time 21:57
 */
@RequiredArgsConstructor
public class LightOnCommand implements Command {

    @NonNull
    private Light light;

    @Override
    public void execute() {
        light.on();
    }
}
