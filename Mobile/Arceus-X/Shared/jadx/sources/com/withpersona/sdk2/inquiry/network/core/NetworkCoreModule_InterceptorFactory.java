package com.withpersona.sdk2.inquiry.network.core;

import okhttp3.Interceptor;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p471um.C11888w;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkCoreModule_InterceptorFactory implements InterfaceC5830d<Interceptor> {
    private final NetworkCoreModule module;
    private final InterfaceC5835i<C11888w> moshiProvider;

    private NetworkCoreModule_InterceptorFactory(NetworkCoreModule networkCoreModule, InterfaceC5835i<C11888w> interfaceC5835i) {
        this.module = networkCoreModule;
        this.moshiProvider = interfaceC5835i;
    }

    public static NetworkCoreModule_InterceptorFactory create(NetworkCoreModule networkCoreModule, InterfaceC5835i<C11888w> interfaceC5835i) {
        return new NetworkCoreModule_InterceptorFactory(networkCoreModule, interfaceC5835i);
    }

    public static Interceptor interceptor(NetworkCoreModule networkCoreModule, C11888w c11888w) {
        return (Interceptor) C5834h.m26194e(networkCoreModule.interceptor(c11888w));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    public Interceptor get() {
        return interceptor(this.module, this.moshiProvider.get());
    }
}
