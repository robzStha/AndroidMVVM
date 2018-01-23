package com.official.android_mvvm.di;

import com.official.android_mvvm.about.view.AboutFragmentProvider;
import com.official.android_mvvm.home.view.HomeActivityModule;
import com.official.android_mvvm.home.view.HomeActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {HomeActivityModule.class, AboutFragmentProvider.class})
    abstract HomeActivity bindHomeActivity();

}