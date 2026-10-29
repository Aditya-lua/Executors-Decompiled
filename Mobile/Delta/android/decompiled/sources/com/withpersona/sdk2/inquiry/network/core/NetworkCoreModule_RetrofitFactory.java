package com.withpersona.sdk2.inquiry.network.core;

import ft.h;
import ft.i;
import jv.y;
import okhttp3.OkHttpClient;
import um.w;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkCoreModule_RetrofitFactory implements ft.d<y> {
    private final NetworkCoreModule module;
    private final i<w> moshiProvider;
    private final i<OkHttpClient> okHttpClientProvider;
    private final i<String> serverEndpointProvider;

    private NetworkCoreModule_RetrofitFactory(NetworkCoreModule networkCoreModule, i<String> iVar, i<OkHttpClient> iVar2, i<w> iVar3) {
        this.module = networkCoreModule;
        this.serverEndpointProvider = iVar;
        this.okHttpClientProvider = iVar2;
        this.moshiProvider = iVar3;
    }

    public static NetworkCoreModule_RetrofitFactory create(NetworkCoreModule networkCoreModule, i<String> iVar, i<OkHttpClient> iVar2, i<w> iVar3) {
        return new NetworkCoreModule_RetrofitFactory(networkCoreModule, iVar, iVar2, iVar3);
    }

    public static y retrofit(NetworkCoreModule networkCoreModule, String str, OkHttpClient okHttpClient, w wVar) {
        return (y) h.e(networkCoreModule.retrofit(str, okHttpClient, wVar));
    }

    @Override // ht.a
    public y get() {
        return retrofit(this.module, this.serverEndpointProvider.get(), this.okHttpClientProvider.get(), this.moshiProvider.get());
    }
}
