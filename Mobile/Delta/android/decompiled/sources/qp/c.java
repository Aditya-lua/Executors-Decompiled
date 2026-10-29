package qp;

import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lqp/c;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "b", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "getTrackingEventsLogger", "()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "a", "(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "trackingEventsLogger", "nfc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f29590a = new c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static TrackingEventsLogger trackingEventsLogger;

    public final void a(@Nullable TrackingEventsLogger trackingEventsLogger2) {
        trackingEventsLogger = trackingEventsLogger2;
    }
}
