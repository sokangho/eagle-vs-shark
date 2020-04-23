package model;

import javafx.scene.image.ImageView;
import resources.Sprites;

import java.util.HashSet;
import java.util.Set;

public class UtilityShark extends Shark {

    private ImageView sprite;

    public UtilityShark(Tile tile) {
        super(tile);
        this.sprite = new ImageView(Sprites.UtilityShark);
    }

    @Override
    public Set<Tile> getValidMoves(Tile currentCoord, int movement, Board board) {
        Set<Tile> validMoves = new HashSet<>();

        for (int i = -2; i <= 2; i++) {
            for (int j = -2; j <= 2; j++) {

                // Don't get diagonal tiles
                if (Math.abs(i) == Math.abs(j))
                    continue;

                int x = currentCoord.getX() + i;
                int y = currentCoord.getY() + j;

                if (Tile.isOutOfBounds(x, y))
                    continue;

                if (board.getTile(x, y).getPiece() == null)
                    validMoves.add(new Tile(x, y));
            }
        }

        return validMoves;
    }
}
