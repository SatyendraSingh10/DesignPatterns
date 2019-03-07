package in.ss.design.patterns.behavioral.command;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @author Satyendra Singh
 * @project DesignPatterns
 * @package in.ss.design.patterns.command
 * @date 11-12-2018
 * @time 22:04
 */
@RequiredArgsConstructor
public class HomeTheaterOffCommand implements Command {

    @NonNull
    private HomeTheater homeTheater;

    @Override
    public void execute() {
        homeTheater.off();
    }
}
