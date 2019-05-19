
public class TennisGame1 implements TennisGame {
    
    private int scorePlayer1 = 0;
    private int scorePlayer2 = 0;
    private String namePlayer1;
    private String namePlayer2;

    public TennisGame1(String namePlayer1, String namePlayer2) {
        this.namePlayer1 = namePlayer1;
        this.namePlayer2 = namePlayer2;
    }

    public void incrementPlayerScoreByOne(String playerName) {
        if (playerName == this.namePlayer1) scorePlayer1 += 1;
        if (playerName == this.namePlayer2) scorePlayer2 += 1;
    }

    public String getTieScore(int score){
        switch (score) {
            case 0:  return "Love-All";
            case 1:  return "Fifteen-All";
            case 2:  return "Thirty-All";
            default: return "Deuce";
        }
    }

    public String getWinOrAdvantageScore(int minusResult) {
        if (minusResult == 1) return "Advantage player1";
        if (minusResult ==-1) return "Advantage player2";
        if (minusResult >= 2) return "Win for player1";
        else return "Win for player2";
    }

    public String getPlayerScore(int score){
        switch (score) {
            case 0:  return "Love";
            case 1:  return "Fifteen";
            case 2:  return "Thirty";
            default: return "Forty";
        }
    }

    public String getScore() {

        if (scorePlayer1 == scorePlayer2)
            return getTieScore(scorePlayer1);

        if (scorePlayer1 >=4 || scorePlayer2 >=4)
            return getWinOrAdvantageScore(scorePlayer1 - scorePlayer2);

        return getPlayerScore(scorePlayer1) + "-" + getPlayerScore(scorePlayer2);
    }
}
