package in.ss.design.patterns.command;

import lombok.Setter;

/**
 * @author Satyendra Singh
 * @project DesignPatterns
 * @package in.ss.design.patterns.command
 * @date 11-12-2018
 * @time 22:06
 */
public class SimpleRemote {
    @Setter
    Command command;

    public void buttonPressed() {
        this.command.execute();
    }
}
