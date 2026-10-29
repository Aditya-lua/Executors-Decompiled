package com.withpersona.sdk2.inquiry.tracking.network;

import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackingEventsService_Factory implements InterfaceC5830d<TrackingEventsService> {
    private final InterfaceC5835i<TrackingEventsServiceApi> trackingEventsServiceApiProvider;

    private TrackingEventsService_Factory(InterfaceC5835i<TrackingEventsServiceApi> interfaceC5835i) {
        this.trackingEventsServiceApiProvider = interfaceC5835i;
    }

    public static TrackingEventsService_Factory create(InterfaceC5835i<TrackingEventsServiceApi> interfaceC5835i) {
        return new TrackingEventsService_Factory(interfaceC5835i);
    }

    public static TrackingEventsService newInstance(TrackingEventsServiceApi trackingEventsServiceApi) {
        return new TrackingEventsService(trackingEventsServiceApi);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    public TrackingEventsService get() {
        return newInstance(this.trackingEventsServiceApiProvider.get());
    }
}
