package com.withpersona.sdk2.inquiry.network.core;

import ft.h;
import ft.i;
import okhttp3.Interceptor;
import um.w;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkCoreModule_InterceptorFactory implements ft.d<Interceptor> {
    private final NetworkCoreModule module;
    private final i<w> moshiProvider;

    private NetworkCoreModule_InterceptorFactory(NetworkCoreModule networkCoreModule, i<w> iVar) {
        this.module = networkCoreModule;
        this.moshiProvider = iVar;
    }

    public static NetworkCoreModule_InterceptorFactory create(NetworkCoreModule networkCoreModule, i<w> iVar) {
        return new NetworkCoreModule_InterceptorFactory(networkCoreModule, iVar);
    }

    public static Interceptor interceptor(NetworkCoreModule networkCoreModule, w wVar) {
        return (Interceptor) h.e(networkCoreModule.interceptor(wVar));
    }

    @Override // ht.a
    public Interceptor get() {
        return interceptor(this.module, this.moshiProvider.get());
    }
}
