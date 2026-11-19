package com.withpersona.sdk2.inquiry.tracking.network;

import sw.y;
import wt.d;
import wt.h;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory implements d<TrackingEventsServiceApi> {
    private final TrackingEventsServiceModule module;
    private final i<y> retrofitProvider;

    private TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory(TrackingEventsServiceModule trackingEventsServiceModule, i<y> iVar) {
        this.module = trackingEventsServiceModule;
        this.retrofitProvider = iVar;
    }

    public static TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory create(TrackingEventsServiceModule trackingEventsServiceModule, i<y> iVar) {
        return new TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory(trackingEventsServiceModule, iVar);
    }

    public static TrackingEventsServiceApi provideTrackingEventsServiceApi(TrackingEventsServiceModule trackingEventsServiceModule, y yVar) {
        return (TrackingEventsServiceApi) h.e(trackingEventsServiceModule.provideTrackingEventsServiceApi(yVar));
    }

    @Override // yt.a
    public TrackingEventsServiceApi get() {
        return provideTrackingEventsServiceApi(this.module, this.retrofitProvider.get());
    }
}
