package domain.square;

import domain.player.Player;

public class SocialFundSquare extends Square {

    public SocialFundSquare(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    void landedOn(Player player) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'landedOn'");
    }
    
}