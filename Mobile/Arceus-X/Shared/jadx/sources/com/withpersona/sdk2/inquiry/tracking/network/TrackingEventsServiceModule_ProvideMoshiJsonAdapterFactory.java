package com.withpersona.sdk2.inquiry.tracking.network;

import java.util.Set;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackingEventsServiceModule_ProvideMoshiJsonAdapterFactory implements InterfaceC5830d<Set<Object>> {

    public static final class InstanceHolder {
        static final TrackingEventsServiceModule_ProvideMoshiJsonAdapterFactory INSTANCE = new TrackingEventsServiceModule_ProvideMoshiJsonAdapterFactory();

        private InstanceHolder() {
        }
    }

    public static TrackingEventsServiceModule_ProvideMoshiJsonAdapterFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<Object> provideMoshiJsonAdapter() {
        return (Set) C5834h.m26194e(TrackingEventsServiceModule.provideMoshiJsonAdapter());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    public Set<Object> get() {
        return provideMoshiJsonAdapter();
    }
}
