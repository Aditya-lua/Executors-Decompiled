package com.withpersona.sdk2.inquiry.tracking.network;

import com.withpersona.sdk2.inquiry.network.core.JsonAdapterBinding;
import java.util.Set;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterBindingFactory */
/* JADX INFO: loaded from: classes3.dex */
public final class C4113x4e74085a implements InterfaceC5830d<Set<JsonAdapterBinding<?>>> {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterBindingFactory$InstanceHolder */
    public static final class InstanceHolder {
        static final C4113x4e74085a INSTANCE = new C4113x4e74085a();

        private InstanceHolder() {
        }
    }

    public static C4113x4e74085a create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<JsonAdapterBinding<?>> provideMoshiJsonAdapterBinding() {
        return (Set) C5834h.m26194e(TrackingEventsServiceModule.INSTANCE.provideMoshiJsonAdapterBinding());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    public Set<JsonAdapterBinding<?>> get() {
        return provideMoshiJsonAdapterBinding();
    }
}
