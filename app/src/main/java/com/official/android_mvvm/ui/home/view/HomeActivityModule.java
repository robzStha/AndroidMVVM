/*
 *  Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://mindorks.com/license/apache-v2
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 */

package com.official.android_mvvm.ui.home.view;
import com.official.android_mvvm.ui.home.repository.HomeRepositoryImpl;
import com.official.android_mvvm.data.ApiServices;

import dagger.Module;
import dagger.Provides;


@Module
public class HomeActivityModule {

    @Provides
    HomeRepositoryImpl provideHomeRepositoryImpl(ApiServices apiServices) {
        return new HomeRepositoryImpl(apiServices);
    }

}
