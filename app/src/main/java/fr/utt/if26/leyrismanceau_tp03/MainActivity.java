package fr.utt.if26.leyrismanceau_tp03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Méthode onCreate
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tx = (TextView) findViewById(R.id.textview);
        String message = getResources().getString(R.string.message);
        //tx.setText("Message modifié dans le code java");
        tx.setText(message);

        Button bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tx = (TextView) findViewById(R.id.textview);
                tx.setBackgroundColor(Color.RED);
            }
        });
    }
}
