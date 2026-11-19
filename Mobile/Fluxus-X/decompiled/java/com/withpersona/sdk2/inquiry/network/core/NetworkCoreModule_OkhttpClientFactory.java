package com.withpersona.sdk2.inquiry.network.core;

import android.content.Context;
import java.util.Map;
import java.util.Set;
import mo.k;
import mv.a0;
import mv.d0;
import wt.h;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkCoreModule_OkhttpClientFactory implements wt.d<d0> {
    private final i<Context> contextProvider;
    private final i<mo.b> deviceInfoProvider;
    private final i<k> deviceVendorIDProvider;
    private final i<Map<String, String>> headersProvider;
    private final i<Set<a0>> interceptorsProvider;
    private final i<bq.e.a> loggerFactoryProvider;
    private final NetworkCoreModule module;
    private final i<NetworkStateManager> networkStateManagerProvider;

    private NetworkCoreModule_OkhttpClientFactory(NetworkCoreModule networkCoreModule, i<Set<a0>> iVar, i<Map<String, String>> iVar2, i<Context> iVar3, i<k> iVar4, i<mo.b> iVar5, i<bq.e.a> iVar6, i<NetworkStateManager> iVar7) {
        this.module = networkCoreModule;
        this.interceptorsProvider = iVar;
        this.headersProvider = iVar2;
        this.contextProvider = iVar3;
        this.deviceVendorIDProvider = iVar4;
        this.deviceInfoProvider = iVar5;
        this.loggerFactoryProvider = iVar6;
        this.networkStateManagerProvider = iVar7;
    }

    public static NetworkCoreModule_OkhttpClientFactory create(NetworkCoreModule networkCoreModule, i<Set<a0>> iVar, i<Map<String, String>> iVar2, i<Context> iVar3, i<k> iVar4, i<mo.b> iVar5, i<bq.e.a> iVar6, i<NetworkStateManager> iVar7) {
        return new NetworkCoreModule_OkhttpClientFactory(networkCoreModule, iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7);
    }

    public static d0 okhttpClient(NetworkCoreModule networkCoreModule, Set<a0> set, Map<String, String> map, Context context, k kVar, mo.b bVar, bq.e.a aVar, NetworkStateManager networkStateManager) {
        return (d0) h.e(networkCoreModule.okhttpClient(set, map, context, kVar, bVar, aVar, networkStateManager));
    }

    @Override // yt.a
    public d0 get() {
        return okhttpClient(this.module, this.interceptorsProvider.get(), this.headersProvider.get(), this.contextProvider.get(), this.deviceVendorIDProvider.get(), this.deviceInfoProvider.get(), this.loggerFactoryProvider.get(), this.networkStateManagerProvider.get());
    }
}
