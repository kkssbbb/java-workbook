package org.workbook.answer.Chapter08.P176_CommandPattern.src.modern.challenge;

public class MoveCommand implements Command {

    private final IODevice action;

    public MoveCommand(IODevice action) {
        this.action = action;
    }

    @Override
    public void execute() {
        action.move();
    }

}
