package mx.betopartida.miscontactos;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TestViews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_views);

        agregarFAB();
    }

    public void agregarFAB() {
        FloatingActionButton miFAB=(FloatingActionButton) findViewById(R.id.btnFAB);
        miFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Hola! Snackbar",Snackbar.LENGTH_SHORT).show();

            }
        });

    }
}
