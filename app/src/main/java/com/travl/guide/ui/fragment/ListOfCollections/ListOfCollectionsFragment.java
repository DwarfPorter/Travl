package com.travl.guide.ui.fragment.ListOfCollections;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatFragment;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.travl.guide.R;
import com.travl.guide.mvp.presenter.MainPresenter;
import com.travl.guide.mvp.view.ListOfCollectionsView;

import io.reactivex.android.schedulers.AndroidSchedulers;

//Created by Pereved on 21.02.2019.
public class ListOfCollectionsFragment extends MvpAppCompatFragment implements ListOfCollectionsView {

    @InjectPresenter
    MainPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_of_collections_fragment, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @ProvidePresenter
    public MainPresenter providePresenter() {
        return new MainPresenter(AndroidSchedulers.mainThread());
    }
}