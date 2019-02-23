package com.travl.guide.mvp.presenter.list;

import com.travl.guide.mvp.view.list.CollectionItemView;

import io.reactivex.subjects.PublishSubject;

//Created by Pereved on 23.02.2019.
public interface CollectionListPresenter {
    PublishSubject<CollectionItemView> getClickSubject();
    void bindView(CollectionItemView itemView);
    int getListCount();
}