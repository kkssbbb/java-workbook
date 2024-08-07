package org.workbook.answer.Chapter08.P176_CommandPattern.src.modern.challenge;

public class CopyCommand implements Command {

    private final IODevice action;
  
    public CopyCommand(IODevice action) {
        this.action = action;    
    }

    @Override
    public void execute() {
        action.copy();
    }

}
