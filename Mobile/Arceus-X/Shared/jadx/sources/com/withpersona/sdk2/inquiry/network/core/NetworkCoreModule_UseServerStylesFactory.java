package com.withpersona.sdk2.inquiry.network.core;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkCoreModule_UseServerStylesFactory implements InterfaceC5830d<String> {
    private final NetworkCoreModule module;

    private NetworkCoreModule_UseServerStylesFactory(NetworkCoreModule networkCoreModule) {
        this.module = networkCoreModule;
    }

    public static NetworkCoreModule_UseServerStylesFactory create(NetworkCoreModule networkCoreModule) {
        return new NetworkCoreModule_UseServerStylesFactory(networkCoreModule);
    }

    public static String useServerStyles(NetworkCoreModule networkCoreModule) {
        return (String) C5834h.m26194e(networkCoreModule.useServerStyles());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    public String get() {
        return useServerStyles(this.module);
    }
}
