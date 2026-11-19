package uj;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: uj.c0, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001d¨\u0006&"}, d2 = {"Luj/c0;", "Luj/j0;", BuildConfig.FLAVOR, "notificationId", BuildConfig.FLAVOR, "time", "authorUserName", "authorUserId", "bodyPreview", "messageId", "<init>", "(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;J)V", "Luj/f0;", "metadata", "(Luj/f0;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "()J", "c", "n", "d", "m", "e", "getBodyPreview", "f", "o", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PrivateMessageNotification implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String notificationId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long time;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String authorUserName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final long authorUserId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String bodyPreview;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final long messageId;

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
    public static final String h() {
        return "PrivateMessageNotification authorUserName is null or empty";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i() {
        return "PrivateMessageNotification authorUserId <= 0";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j() {
        return "PrivateMessageNotification date is null or empty";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k() {
        return "PrivateMessageNotification bodyPreview is null or empty";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l() {
        return "PrivateMessageNotification messageId <= 0";
    }

    @Override // uj.j0
    /* JADX INFO: renamed from: a, reason: from getter */
    public long getTime() {
        return this.time;
    }

    @Override // uj.j0
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
        return Intrinsics.c(this.notificationId, privateMessageNotification.notificationId) && this.time == privateMessageNotification.time && Intrinsics.c(this.authorUserName, privateMessageNotification.authorUserName) && this.authorUserId == privateMessageNotification.authorUserId && Intrinsics.c(this.bodyPreview, privateMessageNotification.bodyPreview) && this.messageId == privateMessageNotification.messageId;
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
    public PrivateMessageNotification(@NotNull PushNotificationMetadata metadata) throws rj.h {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        String notificationId = metadata.getNotificationId();
        String strA = w.a(metadata.getDetail(), "AuthorUserName");
        long jOptLong = metadata.getDetail().optLong("AuthorUserId");
        String strA2 = w.a(metadata.getDetail(), "BodyPreview");
        long jOptLong2 = metadata.getDetail().optLong("MessageId");
        String strA3 = w.a(metadata.getDetail(), "EventDate");
        this(notificationId, strA3 != null ? ok.g.a(strA3) : -1L, strA, jOptLong, strA2, jOptLong2);
        String str = this.authorUserName;
        w.b(!(str == null || str.length() == 0), new Function0() { // from class: uj.x
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PrivateMessageNotification.h();
            }
        });
        w.b(this.authorUserId > 0, new Function0() { // from class: uj.y
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PrivateMessageNotification.i();
            }
        });
        w.b(getTime() > 0, new Function0() { // from class: uj.z
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PrivateMessageNotification.j();
            }
        });
        String str2 = this.bodyPreview;
        w.b(!(str2 == null || str2.length() == 0), new Function0() { // from class: uj.a0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PrivateMessageNotification.k();
            }
        });
        w.b(this.messageId > 0, new Function0() { // from class: uj.b0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PrivateMessageNotification.l();
            }
        });
    }
}
