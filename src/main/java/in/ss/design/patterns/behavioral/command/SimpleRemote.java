package in.ss.design.patterns.behavioral.command;

import lombok.Setter;

/**
 * @author Satyendra Singh
 * @project DesignPatterns
 * @package in.ss.design.patterns.command
 * @date 11-12-2018
 * @time 22:06
 */
class SimpleRemote {
    @Setter
    Command command;

    void buttonPressed() {
        this.command.execute();
    }
}
