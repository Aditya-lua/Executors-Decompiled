package com.withpersona.sdk2.inquiry.tracking;

import dt.e;
import dt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class RealTrackingEventsLogger_Factory_Impl implements RealTrackingEventsLogger.Factory {
    private final C0701RealTrackingEventsLogger_Factory delegateFactory;

    public RealTrackingEventsLogger_Factory_Impl(C0701RealTrackingEventsLogger_Factory c0701RealTrackingEventsLogger_Factory) {
        this.delegateFactory = c0701RealTrackingEventsLogger_Factory;
    }

    public static i<RealTrackingEventsLogger.Factory> createFactoryProvider(C0701RealTrackingEventsLogger_Factory c0701RealTrackingEventsLogger_Factory) {
        return e.a(new RealTrackingEventsLogger_Factory_Impl(c0701RealTrackingEventsLogger_Factory));
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger.Factory
    public RealTrackingEventsLogger create(String str) {
        return this.delegateFactory.get(str);
    }

    public static ft.a<RealTrackingEventsLogger.Factory> create(C0701RealTrackingEventsLogger_Factory c0701RealTrackingEventsLogger_Factory) {
        return e.a(new RealTrackingEventsLogger_Factory_Impl(c0701RealTrackingEventsLogger_Factory));
    }
}
