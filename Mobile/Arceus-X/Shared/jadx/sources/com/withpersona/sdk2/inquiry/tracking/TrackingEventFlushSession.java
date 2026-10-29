package com.withpersona.sdk2.inquiry.tracking;

import com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventFlushSession;", "", "trackingEvents", "", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "token", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getTrackingEvents", "()Ljava/util/List;", "getToken", "()Ljava/lang/String;", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class TrackingEventFlushSession {

    @NotNull
    private final String token;

    @NotNull
    private final List<TrackingEvent> trackingEvents;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent> */
    /* JADX WARN: Multi-variable type inference failed */
    public TrackingEventFlushSession(@NotNull List<? extends TrackingEvent> list, @NotNull String str) {
        list.getClass();
        str.getClass();
        this.trackingEvents = list;
        this.token = str;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final List<TrackingEvent> getTrackingEvents() {
        return this.trackingEvents;
    }
}
