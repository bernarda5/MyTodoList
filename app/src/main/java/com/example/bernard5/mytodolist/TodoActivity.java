package com.example.bernard5.mytodolist;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by bernard5 on 15/01/2018.
 */
public class TodoActivity extends Activity implements
View.OnClickListener {
private Button btnValider ;
        private Editable textes ;
@Override
public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_layout);
        btnValider = (Button) findViewById(R.id.buttonValider);
        btnValider.setOnClickListener(this) ;
        }
@Override
public void onClick(View v) {
       if (v.getId()  == R.id.buttonValider)
       { EditText readtext = (EditText) findViewById(R.id.editText);
        textes = readtext.getText();
        TextView newtext = (TextView) findViewById(R.id.textView);
        newtext.setText(textes);}
        else if (v.getId()  == R.id.buttonVider){


       }
        }
        }