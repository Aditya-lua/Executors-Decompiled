package com.withpersona.sdk2.inquiry.tracking.network;

import ft.d;
import ft.h;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterFactory implements d<Set<Object>> {

    public static final class InstanceHolder {
        static final TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterFactory INSTANCE = new TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterFactory();

        private InstanceHolder() {
        }
    }

    public static TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<Object> provideMoshiJsonAdapter() {
        return (Set) h.e(TrackingEventsServiceModule.INSTANCE.provideMoshiJsonAdapter());
    }

    @Override // ht.a
    public Set<Object> get() {
        return provideMoshiJsonAdapter();
    }
}
