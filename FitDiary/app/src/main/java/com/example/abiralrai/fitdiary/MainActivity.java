package com.example.abiralrai.fitdiary;

import android.support.v7.app.AppCompatActivity;
<<<<<<< Updated upstream
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

=======
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

//    ListView list;
//    String[] titles;
//    String[] description;
//    int[] imgs = {R.drawable.addicon,R.drawable.addicon,R.drawable.addicon,R.drawable.addicon};
>>>>>>> Stashed changes
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< Updated upstream
    }
}
=======

        Toolbar toolbar = findViewById(R.id.mainToolbar);
        setSupportActionBar(toolbar);

        //================Here for list_row================
//        Resources res = getResources();
//
//        titles = res.getStringArray(R.array.titles);
//        description = res.getStringArray(R.array.description);
//
//        list = (ListView) findViewById(R.id.listViewFoodEntryText1);
//        MyAdapter adapter = new MyAdapter(this, titles,imgs,description);
//        list.setAdapter(adapter);
//      ======================================================
//
//        listViewFoodEntry.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            public static final String TAG = "tag";
//
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Log.i("onItemClick: ", mobileArray.get(i));
//            }
//        });
    }
    // ===============================List_row=========================================
//    class MyAdapter extends  ArrayAdapter<String> {
//
//        Context context;
//        int[] imgs;
//        String myTitles[];
//        String myDescripition[];
//
//        MyAdapter(Context c, String[] titles, int[] imgs, String[] description) {
//            super (c,R.layout.list_row, R.id.list_text1, titles);
//            this.context = c;
//            this.imgs = imgs;
//            this.myDescripition = description;
//            this.myTitles = titles;
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            View list_row = layoutInflater.inflate(R.layout.list_row, parent, false);
//            ImageView images = (ImageView) list_row.findViewById(R.id.icon_plus);
//            TextView myTitle = (TextView) list_row.findViewById(R.id.list_text1);
//            TextView myDescription = (TextView) list_row.findViewById(R.id.list_text2);
//            images.setImageResource(imgs[position]);
//            myTitle.setText(titles[position]);
//            myDescription.setText((description[position]));
//            return list_row;
//        }
//    }
//     ===============================List_row=========================================


    @Override
//     Toolbar codes
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

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

}


>>>>>>> Stashed changes
