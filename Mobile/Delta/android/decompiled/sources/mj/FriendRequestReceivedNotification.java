package mj;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mj.u, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u0017\u0010\u001e¨\u0006 "}, d2 = {"Lmj/u;", "Lmj/j0;", "", "notificationId", "username", "", "userId", "time", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJ)V", "Lmj/f0;", "metadata", "(Lmj/f0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "j", "c", "J", "i", "()J", "d", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FriendRequestReceivedNotification implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String notificationId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String username;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long userId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final long time;

    public FriendRequestReceivedNotification(@NotNull String notificationId, @Nullable String str, long j10, long j11) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        this.notificationId = notificationId;
        this.username = str;
        this.userId = j10;
        this.time = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f() {
        return "FriendRequestReceivedNotification username is null or empty";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g() {
        return "FriendRequestReceivedNotification date is null or empty";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h() {
        return "FriendRequestReceivedNotification userId <= 0";
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

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FriendRequestReceivedNotification)) {
            return false;
        }
        FriendRequestReceivedNotification friendRequestReceivedNotification = (FriendRequestReceivedNotification) other;
        return Intrinsics.c(this.notificationId, friendRequestReceivedNotification.notificationId) && Intrinsics.c(this.username, friendRequestReceivedNotification.username) && this.userId == friendRequestReceivedNotification.userId && this.time == friendRequestReceivedNotification.time;
    }

    public int hashCode() {
        int iHashCode = this.notificationId.hashCode() * 31;
        String str = this.username;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.userId)) * 31) + Long.hashCode(this.time);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    @NotNull
    public String toString() {
        return "FriendRequestReceivedNotification(notificationId=" + this.notificationId + ", username=" + this.username + ", userId=" + this.userId + ", time=" + this.time + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FriendRequestReceivedNotification(@NotNull PushNotificationMetadata metadata) throws jj.h {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        String notificationId = metadata.getNotificationId();
        String strA = w.a(metadata.getDetail(), "SenderUserName");
        long jOptLong = metadata.getDetail().optLong("SenderUserId");
        String strA2 = w.a(metadata.getDetail(), "EventDate");
        this(notificationId, strA, jOptLong, strA2 != null ? gk.g.a(strA2) : -1L);
        String str = this.username;
        w.b(!(str == null || str.length() == 0), new Function0() { // from class: mj.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FriendRequestReceivedNotification.f();
            }
        });
        w.b(getTime() > 0, new Function0() { // from class: mj.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FriendRequestReceivedNotification.g();
            }
        });
        w.b(this.userId > 0, new Function0() { // from class: mj.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FriendRequestReceivedNotification.h();
            }
        });
    }
}
