package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public interface DriverCommand {
    default void execute(Job2dDriver driver) {
    }
    void execute();
}
