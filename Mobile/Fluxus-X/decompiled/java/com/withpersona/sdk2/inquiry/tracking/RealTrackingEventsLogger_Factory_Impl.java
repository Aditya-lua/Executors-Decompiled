package com.withpersona.sdk2.inquiry.tracking;

import wt.e;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class RealTrackingEventsLogger_Factory_Impl implements RealTrackingEventsLogger.Factory {
    private final C0798RealTrackingEventsLogger_Factory delegateFactory;

    public RealTrackingEventsLogger_Factory_Impl(C0798RealTrackingEventsLogger_Factory c0798RealTrackingEventsLogger_Factory) {
        this.delegateFactory = c0798RealTrackingEventsLogger_Factory;
    }

    public static i<RealTrackingEventsLogger.Factory> createFactoryProvider(C0798RealTrackingEventsLogger_Factory c0798RealTrackingEventsLogger_Factory) {
        return e.a(new RealTrackingEventsLogger_Factory_Impl(c0798RealTrackingEventsLogger_Factory));
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger.Factory
    public RealTrackingEventsLogger create(String str) {
        return this.delegateFactory.get(str);
    }

    public static yt.a<RealTrackingEventsLogger.Factory> create(C0798RealTrackingEventsLogger_Factory c0798RealTrackingEventsLogger_Factory) {
        return e.a(new RealTrackingEventsLogger_Factory_Impl(c0798RealTrackingEventsLogger_Factory));
    }
}
