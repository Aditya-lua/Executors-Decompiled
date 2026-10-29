package com.withpersona.sdk2.inquiry.tracking;

import java.util.Set;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p471um.AbstractC11873h;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory implements InterfaceC5830d<Set<AbstractC11873h.e>> {
    private final TrackingEventsModule module;

    private TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory(TrackingEventsModule trackingEventsModule) {
        this.module = trackingEventsModule;
    }

    public static TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory create(TrackingEventsModule trackingEventsModule) {
        return new TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory(trackingEventsModule);
    }

    public static Set<AbstractC11873h.e> provideMoshiJsonAdapterFactory(TrackingEventsModule trackingEventsModule) {
        return (Set) C5834h.m26194e(trackingEventsModule.provideMoshiJsonAdapterFactory());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    public Set<AbstractC11873h.e> get() {
        return provideMoshiJsonAdapterFactory(this.module);
    }
}
