package com.maixuanviet.bootique.module;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.maixuanviet.bootique.service.HelloService;
import com.maixuanviet.bootique.service.impl.HelloServiceImpl;

public class ModuleBinder implements Module {

    @Override
    public void configure(Binder binder) {
        binder.bind(HelloService.class).to(HelloServiceImpl.class);
    }

}
