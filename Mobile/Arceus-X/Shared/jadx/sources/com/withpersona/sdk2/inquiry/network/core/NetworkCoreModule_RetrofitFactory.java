package com.withpersona.sdk2.inquiry.network.core;

import okhttp3.OkHttpClient;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p231jv.C7397y;
import p471um.C11888w;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkCoreModule_RetrofitFactory implements InterfaceC5830d<C7397y> {
    private final NetworkCoreModule module;
    private final InterfaceC5835i<C11888w> moshiProvider;
    private final InterfaceC5835i<OkHttpClient> okHttpClientProvider;
    private final InterfaceC5835i<String> serverEndpointProvider;

    private NetworkCoreModule_RetrofitFactory(NetworkCoreModule networkCoreModule, InterfaceC5835i<String> interfaceC5835i, InterfaceC5835i<OkHttpClient> interfaceC5835i2, InterfaceC5835i<C11888w> interfaceC5835i3) {
        this.module = networkCoreModule;
        this.serverEndpointProvider = interfaceC5835i;
        this.okHttpClientProvider = interfaceC5835i2;
        this.moshiProvider = interfaceC5835i3;
    }

    public static NetworkCoreModule_RetrofitFactory create(NetworkCoreModule networkCoreModule, InterfaceC5835i<String> interfaceC5835i, InterfaceC5835i<OkHttpClient> interfaceC5835i2, InterfaceC5835i<C11888w> interfaceC5835i3) {
        return new NetworkCoreModule_RetrofitFactory(networkCoreModule, interfaceC5835i, interfaceC5835i2, interfaceC5835i3);
    }

    public static C7397y retrofit(NetworkCoreModule networkCoreModule, String str, OkHttpClient okHttpClient, C11888w c11888w) {
        return (C7397y) C5834h.m26194e(networkCoreModule.retrofit(str, okHttpClient, c11888w));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    public C7397y get() {
        return retrofit(this.module, this.serverEndpointProvider.get(), this.okHttpClientProvider.get(), this.moshiProvider.get());
    }
}
