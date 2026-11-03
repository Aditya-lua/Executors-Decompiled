package com.withpersona.sdk2.inquiry.network.dto;

import dt.d;
import java.util.Set;
import sm.h;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkInquiryModule_Companion_ProvideMoshiJsonAdapterFactoryFactory implements d<Set<h.e>> {

    public static final class InstanceHolder {
        static final NetworkInquiryModule_Companion_ProvideMoshiJsonAdapterFactoryFactory INSTANCE = new NetworkInquiryModule_Companion_ProvideMoshiJsonAdapterFactoryFactory();

        private InstanceHolder() {
        }
    }

    public static NetworkInquiryModule_Companion_ProvideMoshiJsonAdapterFactoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<h.e> provideMoshiJsonAdapterFactory() {
        return (Set) dt.h.e(NetworkInquiryModule.INSTANCE.provideMoshiJsonAdapterFactory());
    }

    @Override // ft.a
    public Set<h.e> get() {
        return provideMoshiJsonAdapterFactory();
    }
}
