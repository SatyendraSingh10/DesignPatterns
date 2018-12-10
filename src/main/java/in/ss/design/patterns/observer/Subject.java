package in.ss.design.patterns.observer;

interface Subject {
    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObserver();
}
