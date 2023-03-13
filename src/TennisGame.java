public class TennisGame {
    public static String getScore(String playOne_Name, String PlayTwo_Name, int playOne_Score, int playTwo_score) {
        String score = "";
        int tempScore=0;
//        if (playOne_Score==playTwo_score)
//        {
//
//            switch (playOne_Score)
//            {
//                case 0:
//                    score = "Love-All";
//                    break;
//                case 1:
//                    score = "Fifteen-All";
//                    break;
//                case 2:
//                    score = "Thirty-All";
//                    break;
//                case 3:
//                    score = "Forty-All";
//                    break;
//                default:
//                    score = "Deuce";
//                    break;
//            }
//        }
//        else if (playOne_Score>=4 || playTwo_score>=4)
//        {
//            int minusResult = playOne_Score-playTwo_score;
//            if (minusResult==1) score ="Advantage player1";
//            else if (minusResult ==-1) score ="Advantage player2";
//            else if (minusResult>=2) score = "Win for player1";
//            else score ="Win for player2";
//        }
//        else
//        {
//            for (int i=1; i<3; i++)
//            {
//                if (i==1) tempScore = playOne_Score;
//                else { score+="-"; tempScore = playTwo_score;}
//                switch(tempScore)
//                {
//                    case 0:
//                        score+="Love";
//                        break;
//                    case 1:
//                        score+="Fifteen";
//                        break;
//                    case 2:
//                        score+="Thirty";
//                        break;
//                    case 3:
//                        score+="Forty";
//                        break;
//                }
//            }
//        }
//        return score;
        if (playOne_Score==playTwo_score) {
            if(playOne_Score <4){
                score = getScoreString(playOne_Score)+ "_All";
            }else {
                score= "Deuce";
            }
        }else if(playOne_Score>3||playTwo_score>3){
            int minusScore = playOne_Score-playTwo_score;
            if(Math.abs(minusScore)==1){
                score = "Advantage for "+((minusScore>0)?playOne_Name:PlayTwo_Name);
            }else {
                score = ((minusScore>0)?playOne_Name:PlayTwo_Name) + " win";
            }
        }else {
            score = getScoreString(playOne_Score) + " - " + getScoreString(playTwo_score);
        }
        return score;
    }

    public static String getScoreString(int score) {
        String scoreToString = "";
        switch (score) {
            case 0:
                scoreToString = "Love";
                break;
            case 1:
                scoreToString = "Fifteen";
                break;
            case 2:
                scoreToString = "Thirty";
                break;
            case 3:
                scoreToString = "Forty";
                break;
            default:
                break;
        }
        return scoreToString;
    }
}
