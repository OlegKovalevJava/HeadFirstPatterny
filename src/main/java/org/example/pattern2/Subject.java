package org.example.pattern2;

public interface Subject {
    void registerObserver();

    void removeObserver();

    void notifyObserver();
}
