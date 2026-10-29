package com.withpersona.sdk2.inquiry.network.core;

import ft.h;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkCoreModule_KeyInflectionFactory implements ft.d<String> {
    private final NetworkCoreModule module;

    private NetworkCoreModule_KeyInflectionFactory(NetworkCoreModule networkCoreModule) {
        this.module = networkCoreModule;
    }

    public static NetworkCoreModule_KeyInflectionFactory create(NetworkCoreModule networkCoreModule) {
        return new NetworkCoreModule_KeyInflectionFactory(networkCoreModule);
    }

    public static String keyInflection(NetworkCoreModule networkCoreModule) {
        return (String) h.e(networkCoreModule.keyInflection());
    }

    @Override // ht.a
    public String get() {
        return keyInflection(this.module);
    }
}
