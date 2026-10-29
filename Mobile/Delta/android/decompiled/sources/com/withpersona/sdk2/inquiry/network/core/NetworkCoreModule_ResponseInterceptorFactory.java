package com.withpersona.sdk2.inquiry.network.core;

import ft.h;
import ft.i;
import okhttp3.Interceptor;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkCoreModule_ResponseInterceptorFactory implements ft.d<Interceptor> {
    private final NetworkCoreModule module;
    private final i<NetworkStateManager> networkStateManagerProvider;

    private NetworkCoreModule_ResponseInterceptorFactory(NetworkCoreModule networkCoreModule, i<NetworkStateManager> iVar) {
        this.module = networkCoreModule;
        this.networkStateManagerProvider = iVar;
    }

    public static NetworkCoreModule_ResponseInterceptorFactory create(NetworkCoreModule networkCoreModule, i<NetworkStateManager> iVar) {
        return new NetworkCoreModule_ResponseInterceptorFactory(networkCoreModule, iVar);
    }

    public static Interceptor responseInterceptor(NetworkCoreModule networkCoreModule, NetworkStateManager networkStateManager) {
        return (Interceptor) h.e(networkCoreModule.responseInterceptor(networkStateManager));
    }

    @Override // ht.a
    public Interceptor get() {
        return responseInterceptor(this.module, this.networkStateManagerProvider.get());
    }
}
