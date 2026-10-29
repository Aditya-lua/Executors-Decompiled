package com.withpersona.sdk2.inquiry.network.core;

import okhttp3.Interceptor;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkCoreModule_ResponseInterceptorFactory implements InterfaceC5830d<Interceptor> {
    private final NetworkCoreModule module;
    private final InterfaceC5835i<NetworkStateManager> networkStateManagerProvider;

    private NetworkCoreModule_ResponseInterceptorFactory(NetworkCoreModule networkCoreModule, InterfaceC5835i<NetworkStateManager> interfaceC5835i) {
        this.module = networkCoreModule;
        this.networkStateManagerProvider = interfaceC5835i;
    }

    public static NetworkCoreModule_ResponseInterceptorFactory create(NetworkCoreModule networkCoreModule, InterfaceC5835i<NetworkStateManager> interfaceC5835i) {
        return new NetworkCoreModule_ResponseInterceptorFactory(networkCoreModule, interfaceC5835i);
    }

    public static Interceptor responseInterceptor(NetworkCoreModule networkCoreModule, NetworkStateManager networkStateManager) {
        return (Interceptor) C5834h.m26194e(networkCoreModule.responseInterceptor(networkStateManager));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    public Interceptor get() {
        return responseInterceptor(this.module, this.networkStateManagerProvider.get());
    }
}
