package mx.edu.ittepic.multiplicar_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    Button mul;
    SeekBar bar;
    ListView list;
    String tabla [] = new String [10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mul = (Button) findViewById(R.id.button);
        bar = (SeekBar) findViewById(R.id.seekBar);
        list = (ListView) findViewById(R.id.listView);
    }

    public void multiplicar(View view){
        int num = bar.getProgress();
        for(int i = 0; i<10; i++){
            int x = i+1;
            tabla[i] = num + " X " + x + " = " + (num*x) ;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tabla);
        list.setAdapter(adapter);
    }

}
