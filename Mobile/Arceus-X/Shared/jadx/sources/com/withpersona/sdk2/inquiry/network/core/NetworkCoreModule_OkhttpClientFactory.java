package com.withpersona.sdk2.inquiry.network.core;

import android.content.Context;
import java.util.Map;
import java.util.Set;
import np.C9542e;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p582yn.InterfaceC13236b;
import p582yn.InterfaceC13248k;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkCoreModule_OkhttpClientFactory implements InterfaceC5830d<OkHttpClient> {
    private final InterfaceC5835i<Context> contextProvider;
    private final InterfaceC5835i<InterfaceC13236b> deviceInfoProvider;
    private final InterfaceC5835i<InterfaceC13248k> deviceVendorIDProvider;
    private final InterfaceC5835i<Map<String, String>> headersProvider;
    private final InterfaceC5835i<Set<Interceptor>> interceptorsProvider;
    private final InterfaceC5835i<C9542e.a> loggerFactoryProvider;
    private final NetworkCoreModule module;
    private final InterfaceC5835i<NetworkStateManager> networkStateManagerProvider;

    private NetworkCoreModule_OkhttpClientFactory(NetworkCoreModule networkCoreModule, InterfaceC5835i<Set<Interceptor>> interfaceC5835i, InterfaceC5835i<Map<String, String>> interfaceC5835i2, InterfaceC5835i<Context> interfaceC5835i3, InterfaceC5835i<InterfaceC13248k> interfaceC5835i4, InterfaceC5835i<InterfaceC13236b> interfaceC5835i5, InterfaceC5835i<C9542e.a> interfaceC5835i6, InterfaceC5835i<NetworkStateManager> interfaceC5835i7) {
        this.module = networkCoreModule;
        this.interceptorsProvider = interfaceC5835i;
        this.headersProvider = interfaceC5835i2;
        this.contextProvider = interfaceC5835i3;
        this.deviceVendorIDProvider = interfaceC5835i4;
        this.deviceInfoProvider = interfaceC5835i5;
        this.loggerFactoryProvider = interfaceC5835i6;
        this.networkStateManagerProvider = interfaceC5835i7;
    }

    public static NetworkCoreModule_OkhttpClientFactory create(NetworkCoreModule networkCoreModule, InterfaceC5835i<Set<Interceptor>> interfaceC5835i, InterfaceC5835i<Map<String, String>> interfaceC5835i2, InterfaceC5835i<Context> interfaceC5835i3, InterfaceC5835i<InterfaceC13248k> interfaceC5835i4, InterfaceC5835i<InterfaceC13236b> interfaceC5835i5, InterfaceC5835i<C9542e.a> interfaceC5835i6, InterfaceC5835i<NetworkStateManager> interfaceC5835i7) {
        return new NetworkCoreModule_OkhttpClientFactory(networkCoreModule, interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5, interfaceC5835i6, interfaceC5835i7);
    }

    public static OkHttpClient okhttpClient(NetworkCoreModule networkCoreModule, Set<Interceptor> set, Map<String, String> map, Context context, InterfaceC13248k interfaceC13248k, InterfaceC13236b interfaceC13236b, C9542e.a aVar, NetworkStateManager networkStateManager) {
        return (OkHttpClient) C5834h.m26194e(networkCoreModule.okhttpClient(set, map, context, interfaceC13248k, interfaceC13236b, aVar, networkStateManager));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    public OkHttpClient get() {
        return okhttpClient(this.module, this.interceptorsProvider.get(), this.headersProvider.get(), this.contextProvider.get(), this.deviceVendorIDProvider.get(), this.deviceInfoProvider.get(), this.loggerFactoryProvider.get(), this.networkStateManagerProvider.get());
    }
}
