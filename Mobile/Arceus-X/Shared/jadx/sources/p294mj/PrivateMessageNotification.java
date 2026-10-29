package p294mj;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6114g;
import p222jj.C7183h;

/* JADX INFO: renamed from: mj.c0, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001d¨\u0006&"}, m31665d2 = {"Lmj/c0;", "Lmj/j0;", "", "notificationId", "", "time", "authorUserName", "authorUserId", "bodyPreview", "messageId", "<init>", "(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;J)V", "Lmj/f0;", "metadata", "(Lmj/f0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "()J", "c", "n", "d", "m", "e", "getBodyPreview", "f", "o", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class PrivateMessageNotification implements InterfaceC8549j0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String notificationId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long time;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final String authorUserName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final long authorUserId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final String bodyPreview;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final long messageId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PrivateMessageNotification(@NotNull String notificationId, long j10, @Nullable String str, long j11, @Nullable String str2, long j12) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        this.notificationId = notificationId;
        this.time = j10;
        this.authorUserName = str;
        this.authorUserId = j11;
        this.bodyPreview = str2;
        this.messageId = j12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final String m34416h() {
        return "PrivateMessageNotification authorUserName is null or empty";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final String m34417i() {
        return "PrivateMessageNotification authorUserId <= 0";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final String m34418j() {
        return "PrivateMessageNotification date is null or empty";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final String m34419k() {
        return "PrivateMessageNotification bodyPreview is null or empty";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final String m34420l() {
        return "PrivateMessageNotification messageId <= 0";
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
        if (!(other instanceof PrivateMessageNotification)) {
            return false;
        }
        PrivateMessageNotification privateMessageNotification = (PrivateMessageNotification) other;
        return Intrinsics.m31980c(this.notificationId, privateMessageNotification.notificationId) && this.time == privateMessageNotification.time && Intrinsics.m31980c(this.authorUserName, privateMessageNotification.authorUserName) && this.authorUserId == privateMessageNotification.authorUserId && Intrinsics.m31980c(this.bodyPreview, privateMessageNotification.bodyPreview) && this.messageId == privateMessageNotification.messageId;
    }

    public int hashCode() {
        int iHashCode = ((this.notificationId.hashCode() * 31) + Long.hashCode(this.time)) * 31;
        String str = this.authorUserName;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.authorUserId)) * 31;
        String str2 = this.bodyPreview;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.messageId);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getAuthorUserId() {
        return this.authorUserId;
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getAuthorUserName() {
        return this.authorUserName;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getMessageId() {
        return this.messageId;
    }

    @NotNull
    public String toString() {
        return "PrivateMessageNotification(notificationId=" + this.notificationId + ", time=" + this.time + ", authorUserName=" + this.authorUserName + ", authorUserId=" + this.authorUserId + ", bodyPreview=" + this.bodyPreview + ", messageId=" + this.messageId + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PrivateMessageNotification(@NotNull PushNotificationMetadata metadata) throws C7183h {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        String notificationId = metadata.getNotificationId();
        String strM34500a = C8563w.m34500a(metadata.getDetail(), "AuthorUserName");
        long jOptLong = metadata.getDetail().optLong("AuthorUserId");
        String strM34500a2 = C8563w.m34500a(metadata.getDetail(), "BodyPreview");
        long jOptLong2 = metadata.getDetail().optLong("MessageId");
        String strM34500a3 = C8563w.m34500a(metadata.getDetail(), "EventDate");
        this(notificationId, strM34500a3 != null ? C6114g.m27033a(strM34500a3) : -1L, strM34500a, jOptLong, strM34500a2, jOptLong2);
        String str = this.authorUserName;
        C8563w.m34501b(!(str == null || str.length() == 0), new Function0() { // from class: mj.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PrivateMessageNotification.m34416h();
            }
        });
        C8563w.m34501b(this.authorUserId > 0, new Function0() { // from class: mj.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PrivateMessageNotification.m34417i();
            }
        });
        C8563w.m34501b(getTime() > 0, new Function0() { // from class: mj.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PrivateMessageNotification.m34418j();
            }
        });
        String str2 = this.bodyPreview;
        C8563w.m34501b(!(str2 == null || str2.length() == 0), new Function0() { // from class: mj.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PrivateMessageNotification.m34419k();
            }
        });
        C8563w.m34501b(this.messageId > 0, new Function0() { // from class: mj.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PrivateMessageNotification.m34420l();
            }
        });
    }
}
