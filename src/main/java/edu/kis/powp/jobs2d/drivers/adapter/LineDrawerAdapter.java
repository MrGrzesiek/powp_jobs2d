package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineDrawerAdapter implements Job2dDriver {
    private int startX = 0, startY = 0;

    private final DrawPanelController drawPanelController;
    private ILine line;
    public LineDrawerAdapter(DrawPanelController drawPanelController) {
        this.drawPanelController = drawPanelController;
        this.line = LineFactory.getSpecialLine();
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        this.line.setStartCoordinates(this.startX, this.startY);
        this.line.setEndCoordinates(x, y);
        this.drawPanelController.drawLine(line);
        setPosition(x, y);
    }

    public void setLine(ILine line){
        this.line = line;
    }
    @Override
    public String toString() {
        return "Special Line";
    }
}
