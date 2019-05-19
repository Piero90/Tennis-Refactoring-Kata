
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

    public String getScore() {
        String score = "";
        int tempScore;
        if (scorePlayer1 == scorePlayer2)
        {
            return getTieScore(scorePlayer1);
        }
        else if (scorePlayer1 >=4 || scorePlayer2 >=4)
        {
            int minusResult = scorePlayer1 - scorePlayer2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = scorePlayer1;
                else { score+="-"; tempScore = scorePlayer2;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}
