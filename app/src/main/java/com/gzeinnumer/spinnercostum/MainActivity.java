package com.gzeinnumer.spinnercostum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //todo 4
    private ArrayList<NameItem> mList;
    private NameAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //todo 5
        initData();
    }

    //todo 6
    private void initData() {
        mList = new ArrayList<>();
        mList.add(new NameItem("M. Fadli", "Zein"));
        mList.add(new NameItem("GZein", "Numer"));
        mList.add(new NameItem("Ririn", "Darmayanti Zein"));
        mList.add(new NameItem("Rendi", "Yulianto Zein"));

        initSpinner();
    }

    private void initSpinner() {
        Spinner spinner = findViewById(R.id.spinner);
        adapter = new NameAdapter(this, mList);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                NameItem currentItem = (NameItem) parent.getItemAtPosition(position);
                String itemSelected = currentItem.getfName();
                Toast.makeText(MainActivity.this, itemSelected, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
