package com.example.android.firstaid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitChoose1(View view) {
        String Choose1 = "(C→C→C→A→B→D)";
        String Choose2 = " C : Check Awareness";
        String Choose3 = " C : Call for Help";
        String Choose4 = " C : Compression";
        String Choose5 = " A : Airway";
        String Choose6 = " B : Breathing";
        String Choose7 = " D : Defibrillation";
        String Choose8 = Choose1 + "\n" + Choose2 + "\n" + Choose3 + "\n" + Choose4 + "\n" + Choose5 + "\n" + Choose6 + "\n" + Choose7;
        display("");
        displayfirst(Choose8);
        displayfinal("CPR");
        ImageView test=(ImageView)  findViewById(R.id.heart);
        test.setImageResource(R.drawable.cpr3);

    }

    public void submitChoose2(View view) {
        String Choose1 = " 1.Lean the person forward slightly and " + "\n    stand behind him or her.";
        String Choose2 = " 2.Make a fist with one hand.";
        String Choose3 = " 3.Put your arms around the person and"+"\n    grasp your fist with your other hand"+"\n    near the top of the stomach, just below"+"\n    the center of the rib cage. ";
        String Choose4 = " 4.Make a quick, hard movement, inward"+"\n    and outward.";
        String Choose5 = Choose1 + "\n" + Choose2 + "\n" + Choose3 + "\n" + Choose4;
        display("");
        displayfirst(Choose5);
        displayfinal("Heimlich");
        ImageView test=(ImageView)  findViewById(R.id.heart);
        test.setImageResource(R.drawable.helm1);
    }

    public void submitChoose3(View view) {
        String Choose1 = " (Rinse → Off → Dip → Cover → Send)";
        String Choose2 = " Rinse : Hold the burn areas under cool "+"\n        running water immediately at least "+"\n        20 minutes.";
        String Choose3 = " Off : Cut off the clothes from the burn"+"\n        areas cautiously in cool water.";
        String Choose4 = " Dip : Dip the burn areas in the water about"+"\n        20 mintues. ";
        String Choose5 = " Cover : Cover the burn with a sterile"+"\n        gauze bandage or clean towel loosely.";
        String Choose6 = " Send : Send the sufferers straightway to "+"\n        hospital for further treatment. ";
        String Choose7 =  Choose1 + "\n" + Choose2 + "\n" + Choose3 + "\n" + Choose4 + "\n" + Choose5 + "\n" + Choose6;
        display("");
        displayfirst("");
        displayfinal("Scald Burns");
        ImageView test=(ImageView)  findViewById(R.id.heart);
        test.setImageResource(R.drawable.wash);
    }

    public void submitChoose4(View view) {
        String Choose1 ="  1.Use water to wash the wound.";
        String Choose2 ="  2.Use gauze to press the wound until"+"\n    stopping bleeding.";
        String Choose3 ="  3.Bind up the wound and raise it up.";
        String Choose4 ="  4.Send the sufferers straightway to"+"\n    hospital for further treatment..";
        String Choose5 = Choose1 + "\n" + Choose2 + "\n" + Choose3 + "\n" + Choose4;
        display("");
        displayfirst(Choose5);
        displayfinal("Cuts");
        ImageView test=(ImageView)  findViewById(R.id.heart);
        test.setImageResource(R.drawable.cut3);
    }

    public void submitChoose5(View view) {
        String Choose1 =" 1.Lie flat and elevate the feet.";
        String Choose2 =" 2.Move to a cool place.";
        String Choose3 =" 3.Release the accessories and clothing"+"\n    that are too tight..";
        String Choose4 =" 4.If sufferers don't feel better, send they"+"\n    straight way to hospital.";
        String Choose5 = Choose1 + "\n" + Choose2 + "\n" + Choose3 + "\n" + Choose4;;
        display("");
        displayfirst(Choose5);
        displayfinal("Faint");
        ImageView test=(ImageView)  findViewById(R.id.heart);
        test.setImageResource(R.drawable.faintt2);
    }

    public void submitChoose6(View view) {
        String Choose6 = "";
        display("        Choose one!\nGet more information!");
        displayfirst(Choose6);
        displayfinal("");
        ImageView test=(ImageView)  findViewById(R.id.heart);
        test.setImageResource(R.drawable.heart4);
    }

    public void submitsug(View view) {
        EditText name=(EditText)  findViewById(R.id.nameField);
        String namef = name.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT," Suggestion for First Aid by "+namef);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(String message) {
        TextView chooseTextView = (TextView) findViewById(
                R.id.choose_text_view);
        chooseTextView.setText(message);
    }

    private void displayfinal(String bot) {
        TextView chooseTextView = (TextView) findViewById(
                R.id.inside_text_view);
        chooseTextView.setText(bot);
    }

    private void displayfirst(String first) {
        TextView chooseTextView = (TextView) findViewById(
                R.id.name_text_view);
        chooseTextView.setText(first);

    }

    // private void displayimage(Drawable pic) {
    //     ImageView imageView = (ImageView) findViewById(
    //             R.id.image_view);
    //     imageView.setImageDrawable(pic);
    //  }
}
