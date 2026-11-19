package com.withpersona.sdk2.inquiry.network.dto;

import hn.h;
import java.util.Set;
import wt.d;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory implements d<Set<h.e>> {

    public static final class InstanceHolder {
        static final NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory INSTANCE = new NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory();

        private InstanceHolder() {
        }
    }

    public static NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<h.e> provideMoshiJsonAdapterFactory() {
        return (Set) wt.h.e(NetworkInquiryModule.provideMoshiJsonAdapterFactory());
    }

    @Override // yt.a
    public Set<h.e> get() {
        return provideMoshiJsonAdapterFactory();
    }
}
