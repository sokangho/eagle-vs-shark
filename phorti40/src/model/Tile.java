package model;

import model.interfaces.Piece;
import resources.Constants;
import java.io.Serializable;
import java.util.Objects;

public class Tile implements Serializable {

    private int x, y;
    private Piece piece;
    // Not yet implemented terrian system
    private Terrain terrain;

    // For instantiating empty tiles
    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Tile(Piece piece) {
        this.piece = piece;
    }

    @Override
    public String toString() {
        return "Tile{" +
                "x=" + this.x +
                ", y=" + this.y +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Tile)) return false;

        Tile tile = (Tile) obj;
        return this.x == tile.getX() && this.y == tile.getY();
    }

    public boolean hasTerrain() {
        if (this.terrain != null) {
            return true;
        } else {
            return false;
        }
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
        this.piece.setTile(this);
    }

    public void removePiece() {
        this.piece = null;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public Terrain getTerrain() {
        return this.terrain;
    }

    public void removeTerrain() {
        this.terrain = null;
    }

}
