package mj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mj.e0, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\u001d\u001a\u00020\u001a8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001e"}, d2 = {"Lmj/e0;", "Lmj/j0;", "", "notificationId", "revokedNotificationType", "revokedNotificationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lmj/f0;", "metadata", "(Lmj/f0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "", "J", "()J", "time", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PushExpiryMessageNotification implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String notificationId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String revokedNotificationType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String revokedNotificationId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long time;

    public PushExpiryMessageNotification(@NotNull String notificationId, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        this.notificationId = notificationId;
        this.revokedNotificationType = str;
        this.revokedNotificationId = str2;
        this.time = -1L;
    }

    @Override // mj.j0
    /* JADX INFO: renamed from: a, reason: from getter */
    public long getTime() {
        return this.time;
    }

    @Override // mj.j0
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public String getNotificationId() {
        return this.notificationId;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRevokedNotificationId() {
        return this.revokedNotificationId;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRevokedNotificationType() {
        return this.revokedNotificationType;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushExpiryMessageNotification)) {
            return false;
        }
        PushExpiryMessageNotification pushExpiryMessageNotification = (PushExpiryMessageNotification) other;
        return Intrinsics.c(this.notificationId, pushExpiryMessageNotification.notificationId) && Intrinsics.c(this.revokedNotificationType, pushExpiryMessageNotification.revokedNotificationType) && Intrinsics.c(this.revokedNotificationId, pushExpiryMessageNotification.revokedNotificationId);
    }

    public int hashCode() {
        int iHashCode = this.notificationId.hashCode() * 31;
        String str = this.revokedNotificationType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.revokedNotificationId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PushExpiryMessageNotification(notificationId=" + this.notificationId + ", revokedNotificationType=" + this.revokedNotificationType + ", revokedNotificationId=" + this.revokedNotificationId + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PushExpiryMessageNotification(@NotNull PushNotificationMetadata metadata) {
        this(metadata.getNotificationId(), metadata.getDetail().getString("revokedNotificationType"), metadata.getDetail().getString("revokedNotificationId"));
        Intrinsics.checkNotNullParameter(metadata, "metadata");
    }
}
