package com.withpersona.sdk2.inquiry.network.core;

import hn.w;
import mv.d0;
import sw.y;
import wt.h;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkCoreModule_RetrofitFactory implements wt.d<y> {
    private final NetworkCoreModule module;
    private final i<w> moshiProvider;
    private final i<d0> okHttpClientProvider;
    private final i<String> serverEndpointProvider;

    private NetworkCoreModule_RetrofitFactory(NetworkCoreModule networkCoreModule, i<String> iVar, i<d0> iVar2, i<w> iVar3) {
        this.module = networkCoreModule;
        this.serverEndpointProvider = iVar;
        this.okHttpClientProvider = iVar2;
        this.moshiProvider = iVar3;
    }

    public static NetworkCoreModule_RetrofitFactory create(NetworkCoreModule networkCoreModule, i<String> iVar, i<d0> iVar2, i<w> iVar3) {
        return new NetworkCoreModule_RetrofitFactory(networkCoreModule, iVar, iVar2, iVar3);
    }

    public static y retrofit(NetworkCoreModule networkCoreModule, String str, d0 d0Var, w wVar) {
        return (y) h.e(networkCoreModule.retrofit(str, d0Var, wVar));
    }

    @Override // yt.a
    public y get() {
        return retrofit(this.module, this.serverEndpointProvider.get(), this.okHttpClientProvider.get(), this.moshiProvider.get());
    }
}
