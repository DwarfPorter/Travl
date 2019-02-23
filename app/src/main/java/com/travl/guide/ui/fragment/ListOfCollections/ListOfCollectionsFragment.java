package com.travl.guide.ui.fragment.ListOfCollections;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arellomobile.mvp.MvpAppCompatFragment;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.travl.guide.R;
import com.travl.guide.mvp.presenter.ListOfCollectionsPresenter;
import com.travl.guide.mvp.view.ListOfCollectionsView;
import com.travl.guide.ui.adapter.ListOfCollectionsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.android.schedulers.AndroidSchedulers;

//Created by Pereved on 21.02.2019.
public class ListOfCollectionsFragment extends MvpAppCompatFragment implements ListOfCollectionsView {

    @InjectPresenter ListOfCollectionsPresenter presenter;
    @BindView(R.id.collection_recycler) RecyclerView recycler;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_of_collections_fragment, container, false);
        ButterKnife.bind(this, view);
        setupRecycler();
        return view;
    }

    private void setupRecycler() {
        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        ListOfCollectionsAdapter adapter = new ListOfCollectionsAdapter(presenter.collectionListPresenter);
        recycler.setAdapter(adapter);
    }

    @ProvidePresenter
    public ListOfCollectionsPresenter providePresenter() {
        return new ListOfCollectionsPresenter(AndroidSchedulers.mainThread());
    }
}