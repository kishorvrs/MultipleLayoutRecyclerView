package com.kishor.android.multiplelayoutrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import static com.kishor.android.multiplelayoutrecyclerview.ModelClass.AD_LAYOUT;
import static com.kishor.android.multiplelayoutrecyclerview.ModelClass.IMAGE_LAYOUT;
import static com.kishor.android.multiplelayoutrecyclerview.ModelClass.USER_INFO_LAYOUT;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview=findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerview.setLayoutManager(layoutManager);

        List<ModelClass> modelClassList=new ArrayList<>();
        modelClassList.add(new ModelClass(USER_INFO_LAYOUT,R.drawable.ic_launcher_background,"john doe","qwertyuu"));
        modelClassList.add(new ModelClass(IMAGE_LAYOUT,R.drawable.ic_launcher_background));
        modelClassList.add(new ModelClass(AD_LAYOUT,"Hello"));

        modelClassList.add(new ModelClass(USER_INFO_LAYOUT,R.drawable.ic_launcher_background,"john doe","qwertyuu"));
        modelClassList.add(new ModelClass(IMAGE_LAYOUT,R.drawable.ic_launcher_background));
        modelClassList.add(new ModelClass(AD_LAYOUT,"Hello"));

        modelClassList.add(new ModelClass(USER_INFO_LAYOUT,R.drawable.ic_launcher_background,"john doe","qwertyuu"));
        modelClassList.add(new ModelClass(IMAGE_LAYOUT,R.drawable.ic_launcher_background));
        modelClassList.add(new ModelClass(AD_LAYOUT,"Hello"));

        modelClassList.add(new ModelClass(USER_INFO_LAYOUT,R.drawable.ic_launcher_background,"john doe","qwertyuu"));
        modelClassList.add(new ModelClass(IMAGE_LAYOUT,R.drawable.ic_launcher_background));
        modelClassList.add(new ModelClass(AD_LAYOUT,"Hello"));

        modelClassList.add(new ModelClass(USER_INFO_LAYOUT,R.drawable.ic_launcher_background,"john doe","qwertyuu"));
        modelClassList.add(new ModelClass(IMAGE_LAYOUT,R.drawable.ic_launcher_background));
        modelClassList.add(new ModelClass(AD_LAYOUT,"Hello"));

        modelClassList.add(new ModelClass(USER_INFO_LAYOUT,R.drawable.ic_launcher_background,"john doe","qwertyuu"));
        modelClassList.add(new ModelClass(IMAGE_LAYOUT,R.drawable.ic_launcher_background));
        modelClassList.add(new ModelClass(AD_LAYOUT,"Hello"));

        modelClassList.add(new ModelClass(USER_INFO_LAYOUT,R.drawable.ic_launcher_background,"john doe","qwertyuu"));
        modelClassList.add(new ModelClass(IMAGE_LAYOUT,R.drawable.ic_launcher_background));
        modelClassList.add(new ModelClass(AD_LAYOUT,"Hello"));

        modelClassList.add(new ModelClass(USER_INFO_LAYOUT,R.drawable.ic_launcher_background,"john doe","qwertyuu"));
        modelClassList.add(new ModelClass(IMAGE_LAYOUT,R.drawable.ic_launcher_background));
        modelClassList.add(new ModelClass(AD_LAYOUT,"Hello"));


        Adapter adapter=new Adapter(modelClassList);
        recyclerview.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}