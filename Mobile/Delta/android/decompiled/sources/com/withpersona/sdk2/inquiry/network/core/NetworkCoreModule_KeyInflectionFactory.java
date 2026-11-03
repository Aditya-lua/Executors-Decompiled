package com.withpersona.sdk2.inquiry.network.core;

import dt.h;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkCoreModule_KeyInflectionFactory implements dt.d<String> {
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

    @Override // ft.a
    public String get() {
        return keyInflection(this.module);
    }
}
