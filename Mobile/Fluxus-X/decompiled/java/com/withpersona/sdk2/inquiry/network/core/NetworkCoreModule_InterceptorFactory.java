package com.withpersona.sdk2.inquiry.network.core;

import hn.w;
import mv.a0;
import wt.h;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkCoreModule_InterceptorFactory implements wt.d<a0> {
    private final NetworkCoreModule module;
    private final i<w> moshiProvider;

    private NetworkCoreModule_InterceptorFactory(NetworkCoreModule networkCoreModule, i<w> iVar) {
        this.module = networkCoreModule;
        this.moshiProvider = iVar;
    }

    public static NetworkCoreModule_InterceptorFactory create(NetworkCoreModule networkCoreModule, i<w> iVar) {
        return new NetworkCoreModule_InterceptorFactory(networkCoreModule, iVar);
    }

    public static a0 interceptor(NetworkCoreModule networkCoreModule, w wVar) {
        return (a0) h.e(networkCoreModule.interceptor(wVar));
    }

    @Override // yt.a
    public a0 get() {
        return interceptor(this.module, this.moshiProvider.get());
    }
}
