package com.travl.guide.mvp.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.travl.guide.mvp.model.MainModel;
import com.travl.guide.mvp.presenter.list.CollectionListPresenter;
import com.travl.guide.mvp.view.ListOfCollectionsView;
import com.travl.guide.mvp.view.list.CollectionItemView;

import io.reactivex.Scheduler;
import io.reactivex.subjects.PublishSubject;

//Created by Pereved on 18.02.2019.
@InjectViewState
public class ListOfCollectionsPresenter extends MvpPresenter<ListOfCollectionsView> {

    private MainModel model;
    private Scheduler mainThreadScheduler;
    public CollectionListPresenter collectionListPresenter;

    public class ListPresenter implements CollectionListPresenter {

        PublishSubject<CollectionItemView> clickSubject = PublishSubject.create();

        @Override
        public PublishSubject<CollectionItemView> getClickSubject() {
            return clickSubject;
        }

        @Override
        public void bindView(CollectionItemView view) {
            //TODO: запрос строки из БД
//            Repository repository = user.getRepos().get(view.getPos());
//            view.setTitle(repository.getName());
//            view.setImage(repository.getUrl);
        }

        @Override
        public int getListCount() {
            //user == null || user.getDB() == null ? 0 : user.getDB().size();
            return 0;
        }
    }

    public ListOfCollectionsPresenter(Scheduler scheduler) {
        this.mainThreadScheduler = scheduler;
        if(model == null) this.model = new MainModel();
        collectionListPresenter = new ListPresenter();
    }

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
    }
}