package com.withpersona.sdk2.inquiry.network.core;

import ft.i;
import java.util.Set;
import um.h;
import um.w;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkCoreModule_MoshiFactory implements ft.d<w> {
    private final i<Set<JsonAdapterBinding<?>>> jsonAdapterBindingsProvider;
    private final i<Set<h.e>> jsonAdapterFactoryProvider;
    private final i<Set<Object>> jsonAdaptersProvider;
    private final NetworkCoreModule module;

    private NetworkCoreModule_MoshiFactory(NetworkCoreModule networkCoreModule, i<Set<Object>> iVar, i<Set<JsonAdapterBinding<?>>> iVar2, i<Set<h.e>> iVar3) {
        this.module = networkCoreModule;
        this.jsonAdaptersProvider = iVar;
        this.jsonAdapterBindingsProvider = iVar2;
        this.jsonAdapterFactoryProvider = iVar3;
    }

    public static NetworkCoreModule_MoshiFactory create(NetworkCoreModule networkCoreModule, i<Set<Object>> iVar, i<Set<JsonAdapterBinding<?>>> iVar2, i<Set<h.e>> iVar3) {
        return new NetworkCoreModule_MoshiFactory(networkCoreModule, iVar, iVar2, iVar3);
    }

    public static w moshi(NetworkCoreModule networkCoreModule, Set<Object> set, Set<JsonAdapterBinding<?>> set2, Set<h.e> set3) {
        return (w) ft.h.e(networkCoreModule.moshi(set, set2, set3));
    }

    @Override // ht.a
    public w get() {
        return moshi(this.module, this.jsonAdaptersProvider.get(), this.jsonAdapterBindingsProvider.get(), this.jsonAdapterFactoryProvider.get());
    }
}
