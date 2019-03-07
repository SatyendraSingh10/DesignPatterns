package in.ss.design.patterns.behavioral.command;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @author Satyendra Singh
 * @project DesignPatterns
 * @package in.ss.design.patterns.command
 * @date 11-12-2018
 * @time 22:05
 */
@RequiredArgsConstructor
public class HomeTheaterEjectDiskCommand implements Command {
    @NonNull
    private HomeTheater homeTheater;

    @Override
    public void execute() {
        homeTheater.ejectDisk();
    }
}
