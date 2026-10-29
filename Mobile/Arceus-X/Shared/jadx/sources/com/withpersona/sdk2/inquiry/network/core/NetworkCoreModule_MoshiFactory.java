package com.withpersona.sdk2.inquiry.network.core;

import java.util.Set;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p471um.AbstractC11873h;
import p471um.C11888w;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkCoreModule_MoshiFactory implements InterfaceC5830d<C11888w> {
    private final InterfaceC5835i<Set<JsonAdapterBinding<?>>> jsonAdapterBindingsProvider;
    private final InterfaceC5835i<Set<AbstractC11873h.e>> jsonAdapterFactoryProvider;
    private final InterfaceC5835i<Set<Object>> jsonAdaptersProvider;
    private final NetworkCoreModule module;

    private NetworkCoreModule_MoshiFactory(NetworkCoreModule networkCoreModule, InterfaceC5835i<Set<Object>> interfaceC5835i, InterfaceC5835i<Set<JsonAdapterBinding<?>>> interfaceC5835i2, InterfaceC5835i<Set<AbstractC11873h.e>> interfaceC5835i3) {
        this.module = networkCoreModule;
        this.jsonAdaptersProvider = interfaceC5835i;
        this.jsonAdapterBindingsProvider = interfaceC5835i2;
        this.jsonAdapterFactoryProvider = interfaceC5835i3;
    }

    public static NetworkCoreModule_MoshiFactory create(NetworkCoreModule networkCoreModule, InterfaceC5835i<Set<Object>> interfaceC5835i, InterfaceC5835i<Set<JsonAdapterBinding<?>>> interfaceC5835i2, InterfaceC5835i<Set<AbstractC11873h.e>> interfaceC5835i3) {
        return new NetworkCoreModule_MoshiFactory(networkCoreModule, interfaceC5835i, interfaceC5835i2, interfaceC5835i3);
    }

    public static C11888w moshi(NetworkCoreModule networkCoreModule, Set<Object> set, Set<JsonAdapterBinding<?>> set2, Set<AbstractC11873h.e> set3) {
        return (C11888w) C5834h.m26194e(networkCoreModule.moshi(set, set2, set3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    public C11888w get() {
        return moshi(this.module, this.jsonAdaptersProvider.get(), this.jsonAdapterBindingsProvider.get(), this.jsonAdapterFactoryProvider.get());
    }
}
