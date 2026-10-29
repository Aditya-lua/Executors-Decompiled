package com.withpersona.sdk2.inquiry.tracking.network;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p231jv.C7397y;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory */
/* JADX INFO: loaded from: classes3.dex */
public final class C4116xcdd31602 implements InterfaceC5830d<TrackingEventsServiceApi> {
    private final TrackingEventsServiceModule module;
    private final InterfaceC5835i<C7397y> retrofitProvider;

    private C4116xcdd31602(TrackingEventsServiceModule trackingEventsServiceModule, InterfaceC5835i<C7397y> interfaceC5835i) {
        this.module = trackingEventsServiceModule;
        this.retrofitProvider = interfaceC5835i;
    }

    public static C4116xcdd31602 create(TrackingEventsServiceModule trackingEventsServiceModule, InterfaceC5835i<C7397y> interfaceC5835i) {
        return new C4116xcdd31602(trackingEventsServiceModule, interfaceC5835i);
    }

    public static TrackingEventsServiceApi provideTrackingEventsServiceApi(TrackingEventsServiceModule trackingEventsServiceModule, C7397y c7397y) {
        return (TrackingEventsServiceApi) C5834h.m26194e(trackingEventsServiceModule.provideTrackingEventsServiceApi(c7397y));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    public TrackingEventsServiceApi get() {
        return provideTrackingEventsServiceApi(this.module, this.retrofitProvider.get());
    }
}
