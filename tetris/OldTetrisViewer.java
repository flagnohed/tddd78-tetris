package se.liu.ida.fella149.tddd78.tetris;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class OldTetrisViewer
{

    private JFrame frame;
    private Board board;
    public OldTetrisViewer(final Board board) {

	this.board = board;

    }

    // private JTextArea text;
    private int rows;
    private int columns;

    public void show() {
	JTextArea textArea = new JTextArea(board.getHeight(), board.getWidth());
	//Board board = new Board(rows, columns);
	final Action doOneStep = new AbstractAction() {
	    public void actionPerformed(ActionEvent e) {
	        board.replaceSquares();
		String boardText = BoardToTextConverter.convertToText(board);
		textArea.setText(boardText);
	    }
	};
	final Timer clockTimer = new Timer(1000, doOneStep);
	clockTimer.setCoalesce(true);
	clockTimer.start();

	JFrame frame = new JFrame();
	frame.setLayout(new BorderLayout());
	frame.add(textArea, BorderLayout.CENTER);
	textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));

	frame.pack();
	frame.setVisible(true);
    }

}
