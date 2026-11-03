package com.withpersona.sdk2.inquiry.tracking;

import dt.d;
import dt.h;
import dt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackingEventsModule_TrackingEventsLoggerFactory implements d<TrackingEventsLogger> {
    private final i<RealTrackingEventsLogger.Factory> factoryProvider;
    private final TrackingEventsModule module;

    private TrackingEventsModule_TrackingEventsLoggerFactory(TrackingEventsModule trackingEventsModule, i<RealTrackingEventsLogger.Factory> iVar) {
        this.module = trackingEventsModule;
        this.factoryProvider = iVar;
    }

    public static TrackingEventsModule_TrackingEventsLoggerFactory create(TrackingEventsModule trackingEventsModule, i<RealTrackingEventsLogger.Factory> iVar) {
        return new TrackingEventsModule_TrackingEventsLoggerFactory(trackingEventsModule, iVar);
    }

    public static TrackingEventsLogger trackingEventsLogger(TrackingEventsModule trackingEventsModule, RealTrackingEventsLogger.Factory factory) {
        return (TrackingEventsLogger) h.e(trackingEventsModule.trackingEventsLogger(factory));
    }

    @Override // ft.a
    public TrackingEventsLogger get() {
        return trackingEventsLogger(this.module, this.factoryProvider.get());
    }
}
