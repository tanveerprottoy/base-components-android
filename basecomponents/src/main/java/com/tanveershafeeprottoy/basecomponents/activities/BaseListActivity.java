package com.tanveershafeeprottoy.basecomponents.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public abstract class BaseListActivity extends AppCompatActivity {
    public RecyclerView recyclerView;

    public abstract void getAll();
}
