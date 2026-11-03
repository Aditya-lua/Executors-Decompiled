package com.withpersona.sdk2.inquiry.network.core;

import dt.h;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkCoreModule_UseServerStylesFactory implements dt.d<String> {
    private final NetworkCoreModule module;

    private NetworkCoreModule_UseServerStylesFactory(NetworkCoreModule networkCoreModule) {
        this.module = networkCoreModule;
    }

    public static NetworkCoreModule_UseServerStylesFactory create(NetworkCoreModule networkCoreModule) {
        return new NetworkCoreModule_UseServerStylesFactory(networkCoreModule);
    }

    public static String useServerStyles(NetworkCoreModule networkCoreModule) {
        return (String) h.e(networkCoreModule.useServerStyles());
    }

    @Override // ft.a
    public String get() {
        return useServerStyles(this.module);
    }
}
