package com.withpersona.sdk2.inquiry.tracking.network;

import android.content.Context;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackingEventsServiceModule_ProvideContextFactory implements InterfaceC5830d<Context> {
    private final TrackingEventsServiceModule module;

    private TrackingEventsServiceModule_ProvideContextFactory(TrackingEventsServiceModule trackingEventsServiceModule) {
        this.module = trackingEventsServiceModule;
    }

    public static TrackingEventsServiceModule_ProvideContextFactory create(TrackingEventsServiceModule trackingEventsServiceModule) {
        return new TrackingEventsServiceModule_ProvideContextFactory(trackingEventsServiceModule);
    }

    public static Context provideContext(TrackingEventsServiceModule trackingEventsServiceModule) {
        return (Context) C5834h.m26194e(trackingEventsServiceModule.getContext());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    public Context get() {
        return provideContext(this.module);
    }
}
