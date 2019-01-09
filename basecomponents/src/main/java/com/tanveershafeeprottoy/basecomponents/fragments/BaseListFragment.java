package com.tanveershafeeprottoy.basecomponents.fragments;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public abstract class BaseListFragment extends Fragment {
    public RecyclerView recyclerView;

    public abstract void getAll();
}
