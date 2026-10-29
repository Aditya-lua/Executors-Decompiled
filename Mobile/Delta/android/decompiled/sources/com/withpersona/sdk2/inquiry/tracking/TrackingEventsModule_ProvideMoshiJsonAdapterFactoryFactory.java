package com.withpersona.sdk2.inquiry.tracking;

import ft.d;
import java.util.Set;
import um.h;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory implements d<Set<h.e>> {
    private final TrackingEventsModule module;

    private TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory(TrackingEventsModule trackingEventsModule) {
        this.module = trackingEventsModule;
    }

    public static TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory create(TrackingEventsModule trackingEventsModule) {
        return new TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory(trackingEventsModule);
    }

    public static Set<h.e> provideMoshiJsonAdapterFactory(TrackingEventsModule trackingEventsModule) {
        return (Set) ft.h.e(trackingEventsModule.provideMoshiJsonAdapterFactory());
    }

    @Override // ht.a
    public Set<h.e> get() {
        return provideMoshiJsonAdapterFactory(this.module);
    }
}
