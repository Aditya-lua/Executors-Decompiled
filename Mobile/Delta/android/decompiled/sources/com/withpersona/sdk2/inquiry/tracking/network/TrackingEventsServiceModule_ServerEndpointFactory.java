package com.withpersona.sdk2.inquiry.tracking.network;

import ft.d;
import ft.h;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackingEventsServiceModule_ServerEndpointFactory implements d<String> {
    private final TrackingEventsServiceModule module;

    private TrackingEventsServiceModule_ServerEndpointFactory(TrackingEventsServiceModule trackingEventsServiceModule) {
        this.module = trackingEventsServiceModule;
    }

    public static TrackingEventsServiceModule_ServerEndpointFactory create(TrackingEventsServiceModule trackingEventsServiceModule) {
        return new TrackingEventsServiceModule_ServerEndpointFactory(trackingEventsServiceModule);
    }

    public static String serverEndpoint(TrackingEventsServiceModule trackingEventsServiceModule) {
        return (String) h.e(trackingEventsServiceModule.getTrackingEventsServiceServerEndpoint());
    }

    @Override // ht.a
    public String get() {
        return serverEndpoint(this.module);
    }
}
