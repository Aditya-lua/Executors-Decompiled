package com.withpersona.sdk2.inquiry.tracking;

import ht.InterfaceC6564a;
import p136ft.C5831e;
import p136ft.InterfaceC5835i;

/* JADX INFO: loaded from: classes3.dex */
public final class RealTrackingEventsLogger_Factory_Impl implements RealTrackingEventsLogger.Factory {
    private final C14303RealTrackingEventsLogger_Factory delegateFactory;

    public RealTrackingEventsLogger_Factory_Impl(C14303RealTrackingEventsLogger_Factory c14303RealTrackingEventsLogger_Factory) {
        this.delegateFactory = c14303RealTrackingEventsLogger_Factory;
    }

    public static InterfaceC5835i<RealTrackingEventsLogger.Factory> createFactoryProvider(C14303RealTrackingEventsLogger_Factory c14303RealTrackingEventsLogger_Factory) {
        return C5831e.m26182a(new RealTrackingEventsLogger_Factory_Impl(c14303RealTrackingEventsLogger_Factory));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger.Factory
    public RealTrackingEventsLogger create(String str) {
        return this.delegateFactory.get(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static InterfaceC6564a<RealTrackingEventsLogger.Factory> create(C14303RealTrackingEventsLogger_Factory c14303RealTrackingEventsLogger_Factory) {
        return C5831e.m26182a(new RealTrackingEventsLogger_Factory_Impl(c14303RealTrackingEventsLogger_Factory));
    }
}
