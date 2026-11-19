package com.withpersona.sdk2.inquiry.tracking;

import hn.h;
import java.util.Set;
import wt.d;

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
        return (Set) wt.h.e(trackingEventsModule.provideMoshiJsonAdapterFactory());
    }

    @Override // yt.a
    public Set<h.e> get() {
        return provideMoshiJsonAdapterFactory(this.module);
    }
}
