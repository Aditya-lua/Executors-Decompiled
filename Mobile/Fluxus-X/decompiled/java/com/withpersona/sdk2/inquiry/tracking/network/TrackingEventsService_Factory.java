package com.withpersona.sdk2.inquiry.tracking.network;

import wt.d;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackingEventsService_Factory implements d<TrackingEventsService> {
    private final i<TrackingEventsServiceApi> trackingEventsServiceApiProvider;

    private TrackingEventsService_Factory(i<TrackingEventsServiceApi> iVar) {
        this.trackingEventsServiceApiProvider = iVar;
    }

    public static TrackingEventsService_Factory create(i<TrackingEventsServiceApi> iVar) {
        return new TrackingEventsService_Factory(iVar);
    }

    public static TrackingEventsService newInstance(TrackingEventsServiceApi trackingEventsServiceApi) {
        return new TrackingEventsService(trackingEventsServiceApi);
    }

    @Override // yt.a
    public TrackingEventsService get() {
        return newInstance(this.trackingEventsServiceApiProvider.get());
    }
}
