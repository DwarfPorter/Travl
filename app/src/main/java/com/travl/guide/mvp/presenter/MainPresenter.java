package com.travl.guide.mvp.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.travl.guide.mvp.model.MainModel;
import com.travl.guide.mvp.view.ListOfCollectionsView;

import io.reactivex.Scheduler;

//Created by Pereved on 18.02.2019.
@InjectViewState
public class MainPresenter extends MvpPresenter<ListOfCollectionsView> {

    private MainModel model;
    private Scheduler mainThreadScheduler;

    public MainPresenter(Scheduler scheduler) {
        this.mainThreadScheduler = scheduler;
        if(model == null) {
            this.model = new MainModel();
        }
    }
}