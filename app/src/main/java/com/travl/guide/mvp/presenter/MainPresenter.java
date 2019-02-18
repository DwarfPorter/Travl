package com.travl.guide.mvp.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.travl.guide.mvp.model.MainModel;
import com.travl.guide.mvp.view.MainView;

//Created by Pereved on 18.02.2019.
@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    private MainModel model;

    public MainPresenter() {
        if(model == null) {
            this.model = new MainModel();
        }
    }
}