package br.com.taqnia.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    /*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    */
    int scoreA=0;
    int scoreB=0;
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
   //3 Methods for Team A Scores
    public void scoreThree_a(View view){
        scoreA=scoreA+3;
        displayA(scoreA);
    }
    public void scoreTwo_a(View view){
        scoreA=scoreA+2;
        displayA(scoreA);
    }
    public void scoreFreeThrow_a(View view){
        scoreA=scoreA+1;
        displayA(scoreA);
    }

    public void displayA (int number){
        TextView countViewer = (TextView)findViewById(R.id.team_a_score);
        countViewer.setText(""+ number);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    //3 Methods for Team B Scores
    public void scoreThree_b(View view){
        scoreB=scoreB+3;
        displayB(scoreB);
    }
    public void scoreTwo_b(View view){
        scoreB=scoreB+2;
        displayB(scoreB);
    }
    public void scoreFreeThrow_b(View view){
        scoreB=scoreB+1;
        displayB(scoreB);
    }
    public void resetScores(View view){
        scoreA = 0;
        scoreB=0;
        displayA(scoreA);
        displayB(scoreB);
    }

    public void displayB (int number){
        TextView countViewer = (TextView)findViewById(R.id.team_b_score);
        countViewer.setText(""+ number);
    }

}
