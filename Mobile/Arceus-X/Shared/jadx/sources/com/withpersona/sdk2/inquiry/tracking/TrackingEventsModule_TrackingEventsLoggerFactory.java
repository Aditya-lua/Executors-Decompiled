package com.withpersona.sdk2.inquiry.tracking;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackingEventsModule_TrackingEventsLoggerFactory implements InterfaceC5830d<TrackingEventsLogger> {
    private final InterfaceC5835i<RealTrackingEventsLogger.Factory> factoryProvider;
    private final TrackingEventsModule module;

    private TrackingEventsModule_TrackingEventsLoggerFactory(TrackingEventsModule trackingEventsModule, InterfaceC5835i<RealTrackingEventsLogger.Factory> interfaceC5835i) {
        this.module = trackingEventsModule;
        this.factoryProvider = interfaceC5835i;
    }

    public static TrackingEventsModule_TrackingEventsLoggerFactory create(TrackingEventsModule trackingEventsModule, InterfaceC5835i<RealTrackingEventsLogger.Factory> interfaceC5835i) {
        return new TrackingEventsModule_TrackingEventsLoggerFactory(trackingEventsModule, interfaceC5835i);
    }

    public static TrackingEventsLogger trackingEventsLogger(TrackingEventsModule trackingEventsModule, RealTrackingEventsLogger.Factory factory) {
        return (TrackingEventsLogger) C5834h.m26194e(trackingEventsModule.trackingEventsLogger(factory));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    public TrackingEventsLogger get() {
        return trackingEventsLogger(this.module, this.factoryProvider.get());
    }
}
