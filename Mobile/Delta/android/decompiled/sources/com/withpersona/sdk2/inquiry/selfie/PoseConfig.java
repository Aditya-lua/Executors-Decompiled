package com.withpersona.sdk2.inquiry.selfie;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001\u001bB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001e¨\u0006("}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "Landroid/os/Parcelable;", "", "allowReview", "manualCaptureEnabled", "", "manualCaptureDelayMs", "autoCaptureEnabled", "<init>", "(ZZJZ)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "f", "()Z", "b", "j", "c", "J", "i", "()J", "d", "g", "e", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PoseConfig implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean allowReview;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean manualCaptureEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long manualCaptureDelayMs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean autoCaptureEnabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<PoseConfig> CREATOR = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final PoseConfig f12402f = new PoseConfig(false, false, 0, false, 15, null);

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.PoseConfig$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "Default", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "a", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PoseConfig a() {
            return PoseConfig.f12402f;
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PoseConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PoseConfig createFromParcel(Parcel parcel) {
            long j10;
            boolean z10;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z11 = false;
            boolean z12 = true;
            if (parcel.readInt() != 0) {
                z11 = true;
            }
            if (parcel.readInt() == 0) {
                z12 = z11;
            }
            long j11 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z10 = true;
                j10 = j11;
            } else {
                j10 = j11;
                z10 = false;
            }
            return new PoseConfig(z11, z12, j10, z10);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PoseConfig[] newArray(int i10) {
            return new PoseConfig[i10];
        }
    }

    public PoseConfig() {
        this(false, false, 0L, false, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PoseConfig)) {
            return false;
        }
        PoseConfig poseConfig = (PoseConfig) other;
        return this.allowReview == poseConfig.allowReview && this.manualCaptureEnabled == poseConfig.manualCaptureEnabled && this.manualCaptureDelayMs == poseConfig.manualCaptureDelayMs && this.autoCaptureEnabled == poseConfig.autoCaptureEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getAllowReview() {
        return this.allowReview;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getAutoCaptureEnabled() {
        return this.autoCaptureEnabled;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.allowReview) * 31) + Boolean.hashCode(this.manualCaptureEnabled)) * 31) + Long.hashCode(this.manualCaptureDelayMs)) * 31) + Boolean.hashCode(this.autoCaptureEnabled);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getManualCaptureDelayMs() {
        return this.manualCaptureDelayMs;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getManualCaptureEnabled() {
        return this.manualCaptureEnabled;
    }

    @NotNull
    public String toString() {
        return "PoseConfig(allowReview=" + this.allowReview + ", manualCaptureEnabled=" + this.manualCaptureEnabled + ", manualCaptureDelayMs=" + this.manualCaptureDelayMs + ", autoCaptureEnabled=" + this.autoCaptureEnabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.allowReview ? 1 : 0);
        dest.writeInt(this.manualCaptureEnabled ? 1 : 0);
        dest.writeLong(this.manualCaptureDelayMs);
        dest.writeInt(this.autoCaptureEnabled ? 1 : 0);
    }

    public PoseConfig(boolean z10, boolean z11, long j10, boolean z12) {
        this.allowReview = z10;
        this.manualCaptureEnabled = z11;
        this.manualCaptureDelayMs = j10;
        this.autoCaptureEnabled = z12;
    }

    public /* synthetic */ PoseConfig(boolean z10, boolean z11, long j10, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? 8000L : j10, (i10 & 8) != 0 ? true : z12);
    }
}
