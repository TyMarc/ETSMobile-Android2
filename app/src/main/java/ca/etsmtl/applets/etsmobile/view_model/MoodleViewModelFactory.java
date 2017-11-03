package ca.etsmtl.applets.etsmobile.view_model;

import android.app.Application;
import android.arch.lifecycle.ViewModelProvider;
import android.util.Log;

import javax.inject.Singleton;

import ca.etsmtl.applets.etsmobile.model.Moodle.MoodleRepository;

/**
 * Created by Sonphil on 07-09-17.
 */
@Singleton
public class MoodleViewModelFactory implements ViewModelProvider.Factory {

    private static final String TAG = "MoodleViewModelFactory";

    private Application application;
    private MoodleRepository repository;

    public MoodleViewModelFactory(Application application, MoodleRepository repository) {
        Log.d(TAG, "New instance of MoodleViewModelFactory");

        this.application = application;
        this.repository = repository;
    }

    @Override
    public MoodleViewModel create(Class modelClass) {
        return new MoodleViewModel(application, repository);
    }
}