package mh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mh.b, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"Lmh/b;", "", "", "notificationId", "", "lastReceivedTimestampMs", "<init>", "(Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "()J", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class NotificationId {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String notificationId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long lastReceivedTimestampMs;

    public NotificationId(@NotNull String notificationId, long j10) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        this.notificationId = notificationId;
        this.lastReceivedTimestampMs = j10;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getLastReceivedTimestampMs() {
        return this.lastReceivedTimestampMs;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNotificationId() {
        return this.notificationId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationId)) {
            return false;
        }
        NotificationId notificationId = (NotificationId) other;
        return Intrinsics.m31980c(this.notificationId, notificationId.notificationId) && this.lastReceivedTimestampMs == notificationId.lastReceivedTimestampMs;
    }

    public int hashCode() {
        return (this.notificationId.hashCode() * 31) + Long.hashCode(this.lastReceivedTimestampMs);
    }

    @NotNull
    public String toString() {
        return "NotificationId(notificationId=" + this.notificationId + ", lastReceivedTimestampMs=" + this.lastReceivedTimestampMs + ")";
    }
}
