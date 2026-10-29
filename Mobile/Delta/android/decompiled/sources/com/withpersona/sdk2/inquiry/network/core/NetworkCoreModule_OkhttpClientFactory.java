package com.withpersona.sdk2.inquiry.network.core;

import android.content.Context;
import ft.h;
import ft.i;
import java.util.Map;
import java.util.Set;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import yn.k;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkCoreModule_OkhttpClientFactory implements ft.d<OkHttpClient> {
    private final i<Context> contextProvider;
    private final i<yn.b> deviceInfoProvider;
    private final i<k> deviceVendorIDProvider;
    private final i<Map<String, String>> headersProvider;
    private final i<Set<Interceptor>> interceptorsProvider;
    private final i<np.e.a> loggerFactoryProvider;
    private final NetworkCoreModule module;
    private final i<NetworkStateManager> networkStateManagerProvider;

    private NetworkCoreModule_OkhttpClientFactory(NetworkCoreModule networkCoreModule, i<Set<Interceptor>> iVar, i<Map<String, String>> iVar2, i<Context> iVar3, i<k> iVar4, i<yn.b> iVar5, i<np.e.a> iVar6, i<NetworkStateManager> iVar7) {
        this.module = networkCoreModule;
        this.interceptorsProvider = iVar;
        this.headersProvider = iVar2;
        this.contextProvider = iVar3;
        this.deviceVendorIDProvider = iVar4;
        this.deviceInfoProvider = iVar5;
        this.loggerFactoryProvider = iVar6;
        this.networkStateManagerProvider = iVar7;
    }

    public static NetworkCoreModule_OkhttpClientFactory create(NetworkCoreModule networkCoreModule, i<Set<Interceptor>> iVar, i<Map<String, String>> iVar2, i<Context> iVar3, i<k> iVar4, i<yn.b> iVar5, i<np.e.a> iVar6, i<NetworkStateManager> iVar7) {
        return new NetworkCoreModule_OkhttpClientFactory(networkCoreModule, iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7);
    }

    public static OkHttpClient okhttpClient(NetworkCoreModule networkCoreModule, Set<Interceptor> set, Map<String, String> map, Context context, k kVar, yn.b bVar, np.e.a aVar, NetworkStateManager networkStateManager) {
        return (OkHttpClient) h.e(networkCoreModule.okhttpClient(set, map, context, kVar, bVar, aVar, networkStateManager));
    }

    @Override // ht.a
    public OkHttpClient get() {
        return okhttpClient(this.module, this.interceptorsProvider.get(), this.headersProvider.get(), this.contextProvider.get(), this.deviceVendorIDProvider.get(), this.deviceInfoProvider.get(), this.loggerFactoryProvider.get(), this.networkStateManagerProvider.get());
    }
}
