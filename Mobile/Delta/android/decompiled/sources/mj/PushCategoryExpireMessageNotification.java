package mj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mj.d0, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\rR\u0014\u0010\u001e\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001d¨\u0006\u001f"}, d2 = {"Lmj/d0;", "Lmj/j0;", "", "notificationId", "revokedNotificationType", "revokedUpToDate", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lmj/f0;", "metadata", "(Lmj/f0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "e", "", "()J", "time", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PushCategoryExpireMessageNotification implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String notificationId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String revokedNotificationType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String revokedUpToDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String category;

    public PushCategoryExpireMessageNotification(@NotNull String notificationId, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        this.notificationId = notificationId;
        this.revokedNotificationType = str;
        this.revokedUpToDate = str2;
        this.category = str3;
    }

    @Override // mj.j0
    /* JADX INFO: renamed from: a */
    public long getTime() {
        return gk.g.a(this.revokedUpToDate);
    }

    @Override // mj.j0
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public String getNotificationId() {
        return this.notificationId;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRevokedNotificationType() {
        return this.revokedNotificationType;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRevokedUpToDate() {
        return this.revokedUpToDate;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushCategoryExpireMessageNotification)) {
            return false;
        }
        PushCategoryExpireMessageNotification pushCategoryExpireMessageNotification = (PushCategoryExpireMessageNotification) other;
        return Intrinsics.c(this.notificationId, pushCategoryExpireMessageNotification.notificationId) && Intrinsics.c(this.revokedNotificationType, pushCategoryExpireMessageNotification.revokedNotificationType) && Intrinsics.c(this.revokedUpToDate, pushCategoryExpireMessageNotification.revokedUpToDate) && Intrinsics.c(this.category, pushCategoryExpireMessageNotification.category);
    }

    public int hashCode() {
        int iHashCode = this.notificationId.hashCode() * 31;
        String str = this.revokedNotificationType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.revokedUpToDate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.category;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PushCategoryExpireMessageNotification(notificationId=" + this.notificationId + ", revokedNotificationType=" + this.revokedNotificationType + ", revokedUpToDate=" + this.revokedUpToDate + ", category=" + this.category + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PushCategoryExpireMessageNotification(@NotNull PushNotificationMetadata metadata) {
        this(metadata.getNotificationId(), metadata.getDetail().getString("revokedNotificationType"), metadata.getDetail().getString("revokeUpToDate"), metadata.getDetail().getString("category"));
        Intrinsics.checkNotNullParameter(metadata, "metadata");
    }
}
