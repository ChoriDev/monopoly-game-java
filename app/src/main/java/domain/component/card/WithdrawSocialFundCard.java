package domain.component.card;

import domain.player.Player;

public class WithdrawSocialFundCard extends SocialFundCard{

    private int amount;

    public WithdrawSocialFundCard(int index, String name, int amount) {
        this.index = index;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void takeEffect(Player player) {
        player.reduceCash(amount);
    }
}
