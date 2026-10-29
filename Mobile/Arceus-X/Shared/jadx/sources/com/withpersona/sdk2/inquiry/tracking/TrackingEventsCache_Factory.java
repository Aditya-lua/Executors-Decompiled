package com.withpersona.sdk2.inquiry.tracking;

import p136ft.InterfaceC5830d;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackingEventsCache_Factory implements InterfaceC5830d<TrackingEventsCache> {

    public static final class InstanceHolder {
        static final TrackingEventsCache_Factory INSTANCE = new TrackingEventsCache_Factory();

        private InstanceHolder() {
        }
    }

    public static TrackingEventsCache_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TrackingEventsCache newInstance() {
        return new TrackingEventsCache();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    public TrackingEventsCache get() {
        return newInstance();
    }
}
