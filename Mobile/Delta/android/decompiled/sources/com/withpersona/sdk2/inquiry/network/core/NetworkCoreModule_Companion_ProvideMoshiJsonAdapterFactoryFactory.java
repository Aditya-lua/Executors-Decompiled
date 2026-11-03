package com.withpersona.sdk2.inquiry.network.core;

import java.util.Set;
import sm.h;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkCoreModule_Companion_ProvideMoshiJsonAdapterFactoryFactory implements dt.d<Set<h.e>> {

    public static final class InstanceHolder {
        static final NetworkCoreModule_Companion_ProvideMoshiJsonAdapterFactoryFactory INSTANCE = new NetworkCoreModule_Companion_ProvideMoshiJsonAdapterFactoryFactory();

        private InstanceHolder() {
        }
    }

    public static NetworkCoreModule_Companion_ProvideMoshiJsonAdapterFactoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<h.e> provideMoshiJsonAdapterFactory() {
        return (Set) dt.h.e(NetworkCoreModule.Companion.provideMoshiJsonAdapterFactory());
    }

    @Override // ft.a
    public Set<h.e> get() {
        return provideMoshiJsonAdapterFactory();
    }
}
