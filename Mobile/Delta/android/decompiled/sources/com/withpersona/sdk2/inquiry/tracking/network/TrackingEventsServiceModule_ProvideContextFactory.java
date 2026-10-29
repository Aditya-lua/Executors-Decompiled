package com.withpersona.sdk2.inquiry.tracking.network;

import android.content.Context;
import ft.d;
import ft.h;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackingEventsServiceModule_ProvideContextFactory implements d<Context> {
    private final TrackingEventsServiceModule module;

    private TrackingEventsServiceModule_ProvideContextFactory(TrackingEventsServiceModule trackingEventsServiceModule) {
        this.module = trackingEventsServiceModule;
    }

    public static TrackingEventsServiceModule_ProvideContextFactory create(TrackingEventsServiceModule trackingEventsServiceModule) {
        return new TrackingEventsServiceModule_ProvideContextFactory(trackingEventsServiceModule);
    }

    public static Context provideContext(TrackingEventsServiceModule trackingEventsServiceModule) {
        return (Context) h.e(trackingEventsServiceModule.getContext());
    }

    @Override // ht.a
    public Context get() {
        return provideContext(this.module);
    }
}
