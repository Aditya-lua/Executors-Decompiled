package com.withpersona.sdk2.inquiry.tracking;

import ft.e;
import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class RealTrackingEventsLogger_Factory_Impl implements RealTrackingEventsLogger.Factory {
    private final C0696RealTrackingEventsLogger_Factory delegateFactory;

    public RealTrackingEventsLogger_Factory_Impl(C0696RealTrackingEventsLogger_Factory c0696RealTrackingEventsLogger_Factory) {
        this.delegateFactory = c0696RealTrackingEventsLogger_Factory;
    }

    public static i<RealTrackingEventsLogger.Factory> createFactoryProvider(C0696RealTrackingEventsLogger_Factory c0696RealTrackingEventsLogger_Factory) {
        return e.a(new RealTrackingEventsLogger_Factory_Impl(c0696RealTrackingEventsLogger_Factory));
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger.Factory
    public RealTrackingEventsLogger create(String str) {
        return this.delegateFactory.get(str);
    }

    public static ht.a<RealTrackingEventsLogger.Factory> create(C0696RealTrackingEventsLogger_Factory c0696RealTrackingEventsLogger_Factory) {
        return e.a(new RealTrackingEventsLogger_Factory_Impl(c0696RealTrackingEventsLogger_Factory));
    }
}
