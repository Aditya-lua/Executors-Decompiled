package com.withpersona.sdk2.inquiry.tracking;

import dt.d;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackingEventsCache_Factory implements d<TrackingEventsCache> {

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

    @Override // ft.a
    public TrackingEventsCache get() {
        return newInstance();
    }
}
