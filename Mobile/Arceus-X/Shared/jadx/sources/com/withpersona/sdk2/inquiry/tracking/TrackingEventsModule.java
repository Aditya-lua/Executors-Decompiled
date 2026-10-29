package com.withpersona.sdk2.inquiry.tracking;

import com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7700p0;
import org.jetbrains.annotations.NotNull;
import p471um.AbstractC11873h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r0\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;", "", "", "trackingEventServerEndpoint", "<init>", "(Ljava/lang/String;)V", "Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Factory;", "factory", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "(Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Factory;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "", "Lum/h$e;", "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;", "provideMoshiJsonAdapterFactory", "()Ljava/util/Set;", "Ljava/lang/String;", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class TrackingEventsModule {

    @NotNull
    private final String trackingEventServerEndpoint;

    public TrackingEventsModule(@NotNull String str) {
        str.getClass();
        this.trackingEventServerEndpoint = str;
    }

    @NotNull
    public final Set<AbstractC11873h.e> provideMoshiJsonAdapterFactory() {
        return C7700p0.m31904c(TrackingEvent.INSTANCE.createAdapter());
    }

    @NotNull
    public final TrackingEventsLogger trackingEventsLogger(@NotNull RealTrackingEventsLogger.Factory factory) {
        factory.getClass();
        return factory.create(this.trackingEventServerEndpoint);
    }
}
