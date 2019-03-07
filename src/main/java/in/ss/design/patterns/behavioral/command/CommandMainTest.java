package in.ss.design.patterns.behavioral.command;

/**
 * @author Satyendra Singh
 * @project DesignPatterns
 * @package in.ss.design.patterns.command
 * @date 11-12-2018
 * @time 22:08
 */
public class CommandMainTest {

    public static void main(String[] args) {
        SimpleRemote simpleRemote = new SimpleRemote();
        HomeTheater homeTheater = new HomeTheater();
        Light light = new Light();

        HomeTheaterOffCommand homeTheaterOffCommand = new HomeTheaterOffCommand(homeTheater);
        HomeTheaterEjectDiskCommand homeTheaterEjectDiskCommand = new HomeTheaterEjectDiskCommand(homeTheater);

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        simpleRemote.setCommand(homeTheaterOffCommand);
        simpleRemote.buttonPressed();

        simpleRemote.setCommand(homeTheaterEjectDiskCommand);
        simpleRemote.buttonPressed();

        simpleRemote.setCommand(lightOffCommand);
        simpleRemote.buttonPressed();

        simpleRemote.setCommand(lightOnCommand);
        simpleRemote.buttonPressed();
    }

}
