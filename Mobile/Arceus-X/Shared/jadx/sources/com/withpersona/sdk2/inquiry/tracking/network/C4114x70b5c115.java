package com.withpersona.sdk2.inquiry.tracking.network;

import java.util.Set;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterFactory */
/* JADX INFO: loaded from: classes3.dex */
public final class C4114x70b5c115 implements InterfaceC5830d<Set<Object>> {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterFactory$InstanceHolder */
    public static final class InstanceHolder {
        static final C4114x70b5c115 INSTANCE = new C4114x70b5c115();

        private InstanceHolder() {
        }
    }

    public static C4114x70b5c115 create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<Object> provideMoshiJsonAdapter() {
        return (Set) C5834h.m26194e(TrackingEventsServiceModule.INSTANCE.provideMoshiJsonAdapter());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    public Set<Object> get() {
        return provideMoshiJsonAdapter();
    }
}
