package com.example.android.myquizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    // Question 1 Views
    EditText questionAnswer1;

    // Question 2 Views
     CheckBox question2CheckBox1;
     CheckBox question2CheckBox2;
     CheckBox question2CheckBox3;
     CheckBox question2CheckBox4;

     // Question 3 Views
     RadioGroup question3RadioGroup;
     RadioButton question3RadioButton1;
     RadioButton question3RadioButton2;
     RadioButton question3RadioButton3;
     RadioButton question3RadioButton4;

     // Question 4 Views
     RadioGroup question4RadioGroup;
     RadioButton question4RadioButton1;
     RadioButton question4RadioButton2;
     RadioButton question4RadioButton3;
     RadioButton question4RadioButton4;

     // Question 5 Views
     RadioGroup question5RadioGroup;
     RadioButton question5RadioButton1;
     RadioButton question5RadioButton2;
     RadioButton question5RadioButton3;
     RadioButton question5RadioButton4;

     // Question 6 Views
     RadioGroup question6RadioGroup;
     RadioButton question6RadioButton1;
     RadioButton question6RadioButton2;
     RadioButton question6RadioButton3;
     RadioButton question6RadioButton4;

     // Question 7 Views
     RadioGroup question7RadioGroup;
     RadioButton question7RadioButton1;
     RadioButton question7RadioButton2;

     // Question 8 Views
     CheckBox question8CheckBox1;
     CheckBox question8CheckBox2;
     CheckBox question8CheckBox3;
     CheckBox question8CheckBox4;


     // Question 9 Views
     CheckBox question9CheckBox1;
     CheckBox question9CheckBox2;
     CheckBox question9CheckBox3;
     CheckBox question9CheckBox4 ;


     // Question 10 Views
     EditText questionAnswer10;


     // Global variables
     int correctAnswers = 0;


     String answerQuestion1;


     boolean question2CheckBox1Checked;
     boolean question2CheckBox2Checked;
     boolean question2CheckBox3Checked;
     boolean question2CheckBox4Checked;


     int question3RadioButtonSelectedId;

     int question4RadioButtonSelectedId;
     int question5RadioButtonSelectedId;
     int question6RadioButtonSelectedId;
     int question7RadioButtonSelectedId;

     boolean question8CheckBox1Checked;
     boolean question8CheckBox2Checked;
     boolean question8CheckBox3Checked;
     boolean question8CheckBox4Checked;

     boolean question9CheckBox1Checked;
     boolean question9CheckBox2Checked;
     boolean question9CheckBox3Checked;
     boolean question9CheckBox4Checked;


     String answerQuestion10;



     /**
     * Initialize Toast Message.
     */
    Toast finalResultMessage;


    /**
     * When i rotate the device to landscape, the Activity is recreated again.
     * So by default the app doesn't remember the values of the variables I am using.
     * I must implement onSaveInstanceState() and add key-value pairs to the Bundle object.
     * @param savedInstanceState: Save additional state information for my activity.
     */
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        // Save custom values into the bundle.


        savedInstanceState.putString("answerQuestion1", answerQuestion1);

        savedInstanceState.putBoolean("isQuestion2CheckBox1Checked", question2CheckBox1Checked);
        savedInstanceState.putBoolean("isQuestion2CheckBox2Checked", question2CheckBox2Checked);
        savedInstanceState.putBoolean("isQuestion2CheckBox3Checked", question2CheckBox3Checked);
        savedInstanceState.putBoolean("isQuestion2CheckBox4Checked", question2CheckBox4Checked);

        savedInstanceState.putInt("question3RadioButtonSelectedId", question3RadioButtonSelectedId);

        savedInstanceState.putInt("question4RadioButtonSelectedId", question4RadioButtonSelectedId);

        savedInstanceState.putInt("question5RadioButtonSelectedId", question5RadioButtonSelectedId);

        savedInstanceState.putInt("question6RadioButtonSelectedId", question6RadioButtonSelectedId);

        savedInstanceState.putInt("question7RadioButtonSelectedId", question7RadioButtonSelectedId);

        savedInstanceState.putBoolean("isQuestion8CheckBox1Checked", question8CheckBox1Checked);
        savedInstanceState.putBoolean("isQuestion8CheckBox2Checked", question8CheckBox2Checked);
        savedInstanceState.putBoolean("isQuestion8CheckBox3Checked", question8CheckBox3Checked);
        savedInstanceState.putBoolean("isQuestion8CheckBox4Checked", question8CheckBox4Checked);

        savedInstanceState.putBoolean("isQuestion9CheckBox1Checked", question9CheckBox1Checked);
        savedInstanceState.putBoolean("isQuestion9CheckBox2Checked", question9CheckBox2Checked);
        savedInstanceState.putBoolean("isQuestion9CheckBox3Checked", question9CheckBox3Checked);
        savedInstanceState.putBoolean("isQuestion9CheckBox4Checked", question9CheckBox4Checked);

        savedInstanceState.putString("answerQuestion10", answerQuestion10);

        savedInstanceState.putInt("correctAnswers", correctAnswers);



// Always call the superclass so it can save the view hierarchy state.
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


/**
 * Initialize the views.
 */

        questionAnswer1 = (EditText) findViewById(R.id.museum);

        question2CheckBox1 = (CheckBox) findViewById(R.id.brasov);
        question2CheckBox2 = (CheckBox) findViewById(R.id.timisoara);
        question2CheckBox3 = (CheckBox) findViewById(R.id.constanta);
        question2CheckBox4 = (CheckBox) findViewById(R.id.chisinau);

        question3RadioGroup = (RadioGroup) findViewById(R.id.space);
        question3RadioButton1 = (RadioButton) findViewById(R.id.china);
        question3RadioButton2 = (RadioButton) findViewById(R.id.france);
        question3RadioButton3 = (RadioButton) findViewById(R.id.russia);
        question3RadioButton4 = (RadioButton) findViewById(R.id.usa);

        question4RadioGroup = (RadioGroup) findViewById(R.id.petesampras);
        question4RadioButton1 = (RadioButton) findViewById(R.id.football);
        question4RadioButton2 = (RadioButton) findViewById(R.id.tennis);
        question4RadioButton3 = (RadioButton) findViewById(R.id.darts);
        question4RadioButton4 = (RadioButton) findViewById(R.id.polo);


        question5RadioGroup = (RadioGroup) findViewById(R.id.dynamite);
        question5RadioButton1 = (RadioButton) findViewById(R.id.tonyaward);
        question5RadioButton2 = (RadioButton) findViewById(R.id.pulitzer);
        question5RadioButton3 = (RadioButton) findViewById(R.id.newbery);
        question5RadioButton4 = (RadioButton) findViewById(R.id.nobel);


        question6RadioGroup = (RadioGroup) findViewById(R.id.belgrade);
        question6RadioButton1 = (RadioButton) findViewById(R.id.matthias);
        question6RadioButton2 = (RadioButton) findViewById(R.id.john);
        question6RadioButton3 = (RadioButton) findViewById(R.id.napoleon);
        question6RadioButton4 = (RadioButton) findViewById(R.id.richard);

        question7RadioGroup = (RadioGroup) findViewById(R.id.greekgods);
        question7RadioButton1 = (RadioButton) findViewById(R.id.true1);
        question7RadioButton2 = (RadioButton) findViewById(R.id.false1);


        question8CheckBox1 = (CheckBox) findViewById(R.id.lufthansa);
        question8CheckBox2 = (CheckBox) findViewById(R.id.blueair);
        question8CheckBox3 = (CheckBox) findViewById(R.id.fila);
        question8CheckBox4 = (CheckBox) findViewById(R.id.kodak);

        question9CheckBox1 = (CheckBox) findViewById(R.id.guinea);
        question9CheckBox2 = (CheckBox) findViewById(R.id.chipmunk);
        question9CheckBox3 = (CheckBox) findViewById(R.id.rabbit);
        question9CheckBox4 = (CheckBox) findViewById(R.id.squirrel);

        questionAnswer10 = (EditText) findViewById(R.id.graphite);

        if (savedInstanceState != null) {

            answerQuestion1 = savedInstanceState.getString("answerQuestion10");

            question2CheckBox1Checked = savedInstanceState.getBoolean("isQuestion2CheckBox1Checked");
            question2CheckBox2Checked = savedInstanceState.getBoolean("isQuestion2CheckBox2Checked");
            question2CheckBox3Checked = savedInstanceState.getBoolean("isQuestion2CheckBox3Checked");
            question2CheckBox4Checked = savedInstanceState.getBoolean("isQuestion2CheckBox4Checked");

            question3RadioButtonSelectedId = savedInstanceState.getInt("question3RadioButtonSelectedId");

            question4RadioButtonSelectedId = savedInstanceState.getInt("question4RadioButtonSelectedId");

            question5RadioButtonSelectedId = savedInstanceState.getInt("question5RadioButtonSelectedId");

            question6RadioButtonSelectedId = savedInstanceState.getInt("question6RadioButtonSelectedId");

            question7RadioButtonSelectedId = savedInstanceState.getInt("question7RadioButtonSelectedId");

            question8CheckBox1Checked = savedInstanceState.getBoolean("isQuestion8CheckBox1Checked");
            question8CheckBox2Checked = savedInstanceState.getBoolean("isQuestion8CheckBox2Checked");
            question8CheckBox3Checked = savedInstanceState.getBoolean("isQuestion8CheckBox3Checked");
            question8CheckBox4Checked = savedInstanceState.getBoolean("isQuestion8CheckBox4Checked");

            question9CheckBox1Checked = savedInstanceState.getBoolean("isQuestion9CheckBox1Checked");
            question9CheckBox2Checked = savedInstanceState.getBoolean("isQuestion9CheckBox2Checked");
            question9CheckBox3Checked = savedInstanceState.getBoolean("isQuestion9CheckBox3Checked");
            question9CheckBox4Checked = savedInstanceState.getBoolean("isQuestion9CheckBox4Checked");

            answerQuestion10 = savedInstanceState.getString("answerQuestion10");

            correctAnswers = savedInstanceState.getInt("correctAnswers");
        }
    }

    /**
     * This method is called when the submit button is clicked.
     * @correctAnswers: global variable
     */
    public void submitQuiz(View view) {
        String finalResults = calculateQuizResult();

// Create toast message to display.
        if (correctAnswers >= 9) {
            Toast.makeText(this, "You din great! Awesome job!", Toast.LENGTH_SHORT).show();
        }else if (correctAnswers >= 6) {
            Toast.makeText(this, "You did ok, keep learning!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "This is not your best day.", Toast.LENGTH_SHORT).show();
                }
            }


    /**
     * This method finds the correct answer and returns the final quiz results.
     * @correctAnswers: global variable
     */
    public String calculateQuizResult (){
        // Take the answer of question 2. Check if any check box is checked.
        question2CheckBox1Checked = question2CheckBox1.isChecked();
        question2CheckBox2Checked = question2CheckBox2.isChecked();
        question2CheckBox3Checked = question2CheckBox3.isChecked();
        question2CheckBox4Checked = question2CheckBox4.isChecked();

// Take the answer of question 8. Check if any check box is checked.
        question8CheckBox1Checked = question8CheckBox1.isChecked();
        question8CheckBox2Checked = question8CheckBox2.isChecked();
        question8CheckBox3Checked = question8CheckBox3.isChecked();
        question8CheckBox4Checked = question8CheckBox4.isChecked();

// Take the answer of question 9. Check if any check box is checked.
        question9CheckBox1Checked = question9CheckBox1.isChecked();
        question9CheckBox2Checked = question9CheckBox2.isChecked();
        question9CheckBox3Checked = question9CheckBox3.isChecked();
        question9CheckBox4Checked = question9CheckBox4.isChecked();

        answerQuestion1 = questionAnswer1.getText().toString();
        answerQuestion10 = questionAnswer10.getText().toString();

// Check Question 1 if it's correct.
        if (answerQuestion1.equals("museum") || answerQuestion1.equals("MUSEUM") || answerQuestion1.equals("museum")){
            correctAnswers += 1;        }

        // Check Question 2 if it's correct.
        if (question2CheckBox1Checked == true && question2CheckBox2Checked == true
                && question2CheckBox3Checked == true && question2CheckBox4Checked == false){
            correctAnswers += 1;
        }

        question4RadioButtonSelectedId = question4RadioGroup.getCheckedRadioButtonId();
        if (question4RadioGroup.findViewById(question4RadioButtonSelectedId) == question4RadioButton3) {
            correctAnswers += 1;
        }
        question5RadioButtonSelectedId = question5RadioGroup.getCheckedRadioButtonId();
        if (question5RadioGroup.findViewById(question5RadioButtonSelectedId) == question4RadioButton4) {
            correctAnswers += 1;
        }

// Check Question 6 if it's correct.
        question6RadioButtonSelectedId = question6RadioGroup.getCheckedRadioButtonId();
        if (question6RadioGroup.findViewById(question6RadioButtonSelectedId) == question6RadioButton2) {
            correctAnswers += 1;
        }

        // Check Question 7 if it's correct.
        question7RadioButtonSelectedId = question7RadioGroup.getCheckedRadioButtonId();
        if (question7RadioGroup.findViewById(question7RadioButtonSelectedId) == question7RadioButton2) {
            correctAnswers += 1;
        }

        // Check Question 8 if it's correct.
        if (question8CheckBox1Checked == true && question8CheckBox2Checked == true
                && question8CheckBox3Checked == false && question8CheckBox4Checked == false){
            correctAnswers += 1;
        }

        // Check Question 9 if it's correct.
        if (question9CheckBox1Checked == true && question9CheckBox2Checked == true
                && question9CheckBox3Checked == false && question9CheckBox4Checked == true){
            correctAnswers += 1;
        }

        // Check Question 10 if it's correct.
        if (answerQuestion10.equals("carbon") || answerQuestion10.equals("CARBON") || answerQuestion10.equals("carbon")){
            correctAnswers += 1;
        }

        return(correctAnswers + "/10");
    }
}
