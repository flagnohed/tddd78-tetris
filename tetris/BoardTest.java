package se.liu.ida.fella149.tddd78.tetris;

public class BoardTest
{

    public static void main(String[] args) {
	Board testBoard = new Board(10, 5);
	Poly p = TetrominoMaker.getPoly(2);
	testBoard.setFalling(p);

	String carlxii = BoardToTextConverter.convertToText(testBoard);
	System.out.println(carlxii);




    }
}
