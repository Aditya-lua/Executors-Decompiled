package p294mj;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6114g;
import p222jj.C7183h;

/* JADX INFO: renamed from: mj.q, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001b¨\u0006 "}, m31665d2 = {"Lmj/q;", "Lmj/j0;", "", "notificationId", "", "time", "username", "userId", "<init>", "(Ljava/lang/String;JLjava/lang/String;J)V", "Lmj/f0;", "metadata", "(Lmj/f0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "()J", "c", "j", "d", "i", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class FriendRequestAcceptedNotification implements InterfaceC8549j0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String notificationId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long time;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final String username;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final long userId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FriendRequestAcceptedNotification(@NotNull String notificationId, long j10, @Nullable String str, long j11) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        this.notificationId = notificationId;
        this.time = j10;
        this.username = str;
        this.userId = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final String m34478f() {
        return "FriendRequestAcceptedNotification username is null or empty";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final String m34479g() {
        return "FriendRequestAcceptedNotification userId <= 0";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final String m34480h() {
        return "FriendRequestAcceptedNotification date is null or empty";
    }

    @Override // p294mj.InterfaceC8549j0
    /* JADX INFO: renamed from: a, reason: from getter */
    public long getTime() {
        return this.time;
    }

    @Override // p294mj.InterfaceC8549j0
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public String getNotificationId() {
        return this.notificationId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FriendRequestAcceptedNotification)) {
            return false;
        }
        FriendRequestAcceptedNotification friendRequestAcceptedNotification = (FriendRequestAcceptedNotification) other;
        return Intrinsics.m31980c(this.notificationId, friendRequestAcceptedNotification.notificationId) && this.time == friendRequestAcceptedNotification.time && Intrinsics.m31980c(this.username, friendRequestAcceptedNotification.username) && this.userId == friendRequestAcceptedNotification.userId;
    }

    public int hashCode() {
        int iHashCode = ((this.notificationId.hashCode() * 31) + Long.hashCode(this.time)) * 31;
        String str = this.username;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.userId);
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
        return "FriendRequestAcceptedNotification(notificationId=" + this.notificationId + ", time=" + this.time + ", username=" + this.username + ", userId=" + this.userId + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FriendRequestAcceptedNotification(@NotNull PushNotificationMetadata metadata) throws C7183h {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        String notificationId = metadata.getNotificationId();
        String strM34500a = C8563w.m34500a(metadata.getDetail(), "EventDate");
        this(notificationId, strM34500a != null ? C6114g.m27033a(strM34500a) : -1L, C8563w.m34500a(metadata.getDetail(), "AccepterUserName"), metadata.getDetail().optLong("AccepterUserId"));
        String str = this.username;
        C8563w.m34501b(!(str == null || str.length() == 0), new Function0() { // from class: mj.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FriendRequestAcceptedNotification.m34478f();
            }
        });
        C8563w.m34501b(this.userId > 0, new Function0() { // from class: mj.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FriendRequestAcceptedNotification.m34479g();
            }
        });
        C8563w.m34501b(getTime() > 0, new Function0() { // from class: mj.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FriendRequestAcceptedNotification.m34480h();
            }
        });
    }
}
