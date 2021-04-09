public class Hand {
  public static final int HANDVALUE_ROCK = 0;
  public static final int HANDVALUE_SCIS = 1;
  public static final int HANDVALUE_PAPE = 2;

  public static final Hand[] hand = {
    new Hand(HANDVALUE_ROCK), new Hand(HANDVALUE_SCIS), new Hand(HANDVALUE_PAPE),
  };
  private static final String[] name = {"Rock", "Scissors", "Paper"};
  private int handvalue;

  private Hand(int handvalue) {
    this.handvalue = handvalue;
  }

  public static Hand getHand(int handvalue) {
    return hand[handvalue];
  }

  public boolean isStrongThan(Hand h) {
    return fight(h) == 1;
  }

  public boolean isWeakerThan(Hand h) {
    return fight(h) == -1;
  }

  private int fight(Hand h) {
    if (this == h) {
      return 0;
    } else if ((this.handvalue + 1) % 3 == h.handvalue) {
      return 1;
    } else {
      return -1;
    }
  }

  public String toString() {
    return name[handvalue];
  }
}
