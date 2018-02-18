package squareandcube.com.cardviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ItemData> mItemData = new ArrayList<>();

        ItemArrayAdapter itemArrayAdapter = new ItemArrayAdapter(mItemData , R.layout.list);

        mRecyclerView  = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL,true));
        mRecyclerView.setAdapter(itemArrayAdapter);

        for(int i=0; i<=10; i++) {
            mItemData.add(new ItemData("Paul Reed","00155845666","Hi"));
        }

    }
}
