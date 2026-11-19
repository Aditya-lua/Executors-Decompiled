package com.withpersona.sdk2.inquiry.network.core;

import mv.a0;
import wt.h;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkCoreModule_ResponseInterceptorFactory implements wt.d<a0> {
    private final NetworkCoreModule module;
    private final i<NetworkStateManager> networkStateManagerProvider;

    private NetworkCoreModule_ResponseInterceptorFactory(NetworkCoreModule networkCoreModule, i<NetworkStateManager> iVar) {
        this.module = networkCoreModule;
        this.networkStateManagerProvider = iVar;
    }

    public static NetworkCoreModule_ResponseInterceptorFactory create(NetworkCoreModule networkCoreModule, i<NetworkStateManager> iVar) {
        return new NetworkCoreModule_ResponseInterceptorFactory(networkCoreModule, iVar);
    }

    public static a0 responseInterceptor(NetworkCoreModule networkCoreModule, NetworkStateManager networkStateManager) {
        return (a0) h.e(networkCoreModule.responseInterceptor(networkStateManager));
    }

    @Override // yt.a
    public a0 get() {
        return responseInterceptor(this.module, this.networkStateManagerProvider.get());
    }
}
