package in.ss.design.patterns.command;

/**
 * @author Satyendra Singh
 * @project DesignPatterns
 * @package in.ss.design.patterns.command
 * @date 11-12-2018
 * @time 22:00
 */
class HomeTheater {
    public void on() {
        System.out.println("HomeTheater on.");
    }

    public void off() {
        System.out.println("HomeTheater off");
    }

    public void volumeUp() {
        System.out.println("Volume increased.");
    }

    public void volumeDown() {
        System.out.println("Volume decreased.");
    }

    public void ejectDisk() {
        System.out.println("Disk ejected.");
    }
}
