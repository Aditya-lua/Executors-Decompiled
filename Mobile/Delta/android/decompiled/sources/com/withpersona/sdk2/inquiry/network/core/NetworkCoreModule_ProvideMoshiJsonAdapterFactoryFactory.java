package com.withpersona.sdk2.inquiry.network.core;

import java.util.Set;
import sm.h;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory implements dt.d<Set<h.e>> {

    public static final class InstanceHolder {
        static final NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory INSTANCE = new NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory();

        private InstanceHolder() {
        }
    }

    public static NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<h.e> provideMoshiJsonAdapterFactory() {
        return (Set) dt.h.e(NetworkCoreModule.provideMoshiJsonAdapterFactory());
    }

    @Override // ft.a
    public Set<h.e> get() {
        return provideMoshiJsonAdapterFactory();
    }
}
