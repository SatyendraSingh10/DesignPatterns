package in.ss.design.patterns.behavioral.observer;

interface Subject {
    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObserver();
}
