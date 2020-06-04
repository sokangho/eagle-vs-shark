package model.interfaces;

import javafx.scene.image.Image;
import model.Board;
import model.Enums.PieceType;
import model.Enums.StatusType;
import model.Status;
import model.Tile;

import java.util.Set;

public interface Piece {

    Set<Tile> getValidMoves(Tile currentCoord, int movement, Board board);

    Set<Tile> getValidAttacks(Tile currentCoord, Board board);

    Set<Tile> getValidSpecials(Tile currentCoord, Board board);

    // Remove piece from current tile and set piece to a new tile.
    void move(Board board, Tile tile);

    void attack(Piece piece);

    boolean hasSpecial();

    void special();

    void takeDamage();

    void die();

    void setStatus(StatusType type, int duration);

    Status getStatus(StatusType type);

    PieceType getPieceType();

    Image getSprite();

    Tile getTile();

    int getHealth();

    void setTile(Tile tile);

    void setSprite(Image sprite);

    int getBaseMovement();

    void setBaseMovement(int baseMovement);

    void setHealth(int health);
}