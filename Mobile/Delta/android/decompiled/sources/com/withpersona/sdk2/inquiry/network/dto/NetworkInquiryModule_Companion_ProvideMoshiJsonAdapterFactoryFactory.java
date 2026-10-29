package com.withpersona.sdk2.inquiry.network.dto;

import ft.d;
import java.util.Set;
import um.h;

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
        return (Set) ft.h.e(NetworkInquiryModule.INSTANCE.provideMoshiJsonAdapterFactory());
    }

    @Override // ht.a
    public Set<h.e> get() {
        return provideMoshiJsonAdapterFactory();
    }
}
