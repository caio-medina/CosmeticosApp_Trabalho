package a2017_1.pooa.iff.br.cosmeticosapp_trabalho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = (ImageView) findViewById(R.id.img_cosmeticos);
        logo.setImageResource(R.drawable.img_cosmeticos);
    }
}
