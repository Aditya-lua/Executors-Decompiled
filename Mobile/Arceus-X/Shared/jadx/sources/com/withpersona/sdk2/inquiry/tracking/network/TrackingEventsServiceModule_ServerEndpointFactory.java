package com.withpersona.sdk2.inquiry.tracking.network;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackingEventsServiceModule_ServerEndpointFactory implements InterfaceC5830d<String> {
    private final TrackingEventsServiceModule module;

    private TrackingEventsServiceModule_ServerEndpointFactory(TrackingEventsServiceModule trackingEventsServiceModule) {
        this.module = trackingEventsServiceModule;
    }

    public static TrackingEventsServiceModule_ServerEndpointFactory create(TrackingEventsServiceModule trackingEventsServiceModule) {
        return new TrackingEventsServiceModule_ServerEndpointFactory(trackingEventsServiceModule);
    }

    public static String serverEndpoint(TrackingEventsServiceModule trackingEventsServiceModule) {
        return (String) C5834h.m26194e(trackingEventsServiceModule.getTrackingEventsServiceServerEndpoint());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    public String get() {
        return serverEndpoint(this.module);
    }
}
