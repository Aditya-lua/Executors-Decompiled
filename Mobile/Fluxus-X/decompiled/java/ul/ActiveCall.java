package ul;

import android.graphics.Bitmap;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ul.a, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b'\b\u0080\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017Jp\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\"\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b%\u00103\u001a\u0004\b+\u00104R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b.\u00105\u001a\u0004\b&\u00106R\u0011\u00109\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010;\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b:\u00108¨\u0006<"}, d2 = {"Lul/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "callId", BuildConfig.FLAVOR, "notificationId", "record", BuildConfig.FLAVOR, "callerUserId", "callerName", "Lul/j;", "phase", "Lul/h0;", "ringStage", "Landroid/graphics/Bitmap;", "callerAvatar", "Lul/e;", "avatarLoad", "<init>", "(Ljava/lang/String;IILjava/lang/Long;Ljava/lang/String;Lul/j;Lul/h0;Landroid/graphics/Bitmap;Lul/e;)V", "stage", BuildConfig.FLAVOR, "l", "(Lul/h0;)Z", "a", "(Ljava/lang/String;IILjava/lang/Long;Ljava/lang/String;Lul/j;Lul/h0;Landroid/graphics/Bitmap;Lul/e;)Lul/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "I", "h", "c", "j", "Ljava/lang/Long;", "g", "()Ljava/lang/Long;", "e", "f", "Lul/j;", "i", "()Lul/j;", "Lul/h0;", "getRingStage", "()Lul/h0;", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "Lul/e;", "()Lul/e;", "k", "()Z", "isAlerting", "m", "isOver", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActiveCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String callId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int notificationId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int record;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Long callerUserId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String callerName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final j phase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final h0 ringStage;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Bitmap callerAvatar;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final e avatarLoad;

    public ActiveCall(@NotNull String callId, int i10, int i11, @Nullable Long l10, @Nullable String str, @NotNull j phase, @NotNull h0 ringStage, @Nullable Bitmap bitmap, @NotNull e avatarLoad) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(ringStage, "ringStage");
        Intrinsics.checkNotNullParameter(avatarLoad, "avatarLoad");
        this.callId = callId;
        this.notificationId = i10;
        this.record = i11;
        this.callerUserId = l10;
        this.callerName = str;
        this.phase = phase;
        this.ringStage = ringStage;
        this.callerAvatar = bitmap;
        this.avatarLoad = avatarLoad;
    }

    public static /* synthetic */ ActiveCall b(ActiveCall activeCall, String str, int i10, int i11, Long l10, String str2, j jVar, h0 h0Var, Bitmap bitmap, e eVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = activeCall.callId;
        }
        if ((i12 & 2) != 0) {
            i10 = activeCall.notificationId;
        }
        if ((i12 & 4) != 0) {
            i11 = activeCall.record;
        }
        if ((i12 & 8) != 0) {
            l10 = activeCall.callerUserId;
        }
        if ((i12 & 16) != 0) {
            str2 = activeCall.callerName;
        }
        if ((i12 & 32) != 0) {
            jVar = activeCall.phase;
        }
        if ((i12 & 64) != 0) {
            h0Var = activeCall.ringStage;
        }
        if ((i12 & Barcode.FORMAT_ITF) != 0) {
            bitmap = activeCall.callerAvatar;
        }
        if ((i12 & Barcode.FORMAT_QR_CODE) != 0) {
            eVar = activeCall.avatarLoad;
        }
        Bitmap bitmap2 = bitmap;
        e eVar2 = eVar;
        j jVar2 = jVar;
        h0 h0Var2 = h0Var;
        String str3 = str2;
        int i13 = i11;
        return activeCall.a(str, i10, i13, l10, str3, jVar2, h0Var2, bitmap2, eVar2);
    }

    @NotNull
    public final ActiveCall a(@NotNull String callId, int notificationId, int record, @Nullable Long callerUserId, @Nullable String callerName, @NotNull j phase, @NotNull h0 ringStage, @Nullable Bitmap callerAvatar, @NotNull e avatarLoad) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(ringStage, "ringStage");
        Intrinsics.checkNotNullParameter(avatarLoad, "avatarLoad");
        return new ActiveCall(callId, notificationId, record, callerUserId, callerName, phase, ringStage, callerAvatar, avatarLoad);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getAvatarLoad() {
        return this.avatarLoad;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Bitmap getCallerAvatar() {
        return this.callerAvatar;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveCall)) {
            return false;
        }
        ActiveCall activeCall = (ActiveCall) other;
        return Intrinsics.c(this.callId, activeCall.callId) && this.notificationId == activeCall.notificationId && this.record == activeCall.record && Intrinsics.c(this.callerUserId, activeCall.callerUserId) && Intrinsics.c(this.callerName, activeCall.callerName) && this.phase == activeCall.phase && this.ringStage == activeCall.ringStage && Intrinsics.c(this.callerAvatar, activeCall.callerAvatar) && this.avatarLoad == activeCall.avatarLoad;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCallerName() {
        return this.callerName;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getCallerUserId() {
        return this.callerUserId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getNotificationId() {
        return this.notificationId;
    }

    public int hashCode() {
        int iHashCode = ((((this.callId.hashCode() * 31) + Integer.hashCode(this.notificationId)) * 31) + Integer.hashCode(this.record)) * 31;
        Long l10 = this.callerUserId;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.callerName;
        int iHashCode3 = (((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.phase.hashCode()) * 31) + this.ringStage.hashCode()) * 31;
        Bitmap bitmap = this.callerAvatar;
        return ((iHashCode3 + (bitmap != null ? bitmap.hashCode() : 0)) * 31) + this.avatarLoad.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final j getPhase() {
        return this.phase;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getRecord() {
        return this.record;
    }

    public final boolean k() {
        return l(h0.ALERTING);
    }

    public final boolean l(@NotNull h0 stage) {
        Intrinsics.checkNotNullParameter(stage, "stage");
        return this.phase == j.RINGING && this.ringStage == stage;
    }

    public final boolean m() {
        j jVar = this.phase;
        return jVar == j.MISSED || jVar == j.ENDED;
    }

    @NotNull
    public String toString() {
        return "ActiveCall(callId=" + this.callId + ", notificationId=" + this.notificationId + ", record=" + this.record + ", callerUserId=" + this.callerUserId + ", callerName=" + this.callerName + ", phase=" + this.phase + ", ringStage=" + this.ringStage + ", callerAvatar=" + this.callerAvatar + ", avatarLoad=" + this.avatarLoad + ")";
    }

    public /* synthetic */ ActiveCall(String str, int i10, int i11, Long l10, String str2, j jVar, h0 h0Var, Bitmap bitmap, e eVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, i11, (i12 & 8) != 0 ? null : l10, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? j.RINGING : jVar, (i12 & 64) != 0 ? h0.WAITING_FOR_TURN : h0Var, (i12 & Barcode.FORMAT_ITF) != 0 ? null : bitmap, (i12 & Barcode.FORMAT_QR_CODE) != 0 ? e.NOT_STARTED : eVar);
    }
}
