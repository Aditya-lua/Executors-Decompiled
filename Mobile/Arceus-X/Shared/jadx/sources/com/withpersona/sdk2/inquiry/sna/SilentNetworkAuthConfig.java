package com.withpersona.sdk2.inquiry.sna;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/sna/SilentNetworkAuthConfig;", "Landroid/os/Parcelable;", "", "checkUrl", "", "maxRedirects", "", "timeoutMs", "<init>", "(Ljava/lang/String;IJ)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCheckUrl", "b", "I", "getMaxRedirects", "c", "J", "getTimeoutMs", "()J", "sna_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class SilentNetworkAuthConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SilentNetworkAuthConfig> CREATOR = new C4023a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String checkUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int maxRedirects;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public final long timeoutMs;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthConfig$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4023a implements Parcelable.Creator<SilentNetworkAuthConfig> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SilentNetworkAuthConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SilentNetworkAuthConfig(parcel.readString(), parcel.readInt(), parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SilentNetworkAuthConfig[] newArray(int i10) {
            return new SilentNetworkAuthConfig[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SilentNetworkAuthConfig(@NotNull String checkUrl, int i10, long j10) {
        Intrinsics.checkNotNullParameter(checkUrl, "checkUrl");
        this.checkUrl = checkUrl;
        this.maxRedirects = i10;
        this.timeoutMs = j10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SilentNetworkAuthConfig)) {
            return false;
        }
        SilentNetworkAuthConfig silentNetworkAuthConfig = (SilentNetworkAuthConfig) other;
        return Intrinsics.m31980c(this.checkUrl, silentNetworkAuthConfig.checkUrl) && this.maxRedirects == silentNetworkAuthConfig.maxRedirects && this.timeoutMs == silentNetworkAuthConfig.timeoutMs;
    }

    public int hashCode() {
        return (((this.checkUrl.hashCode() * 31) + Integer.hashCode(this.maxRedirects)) * 31) + Long.hashCode(this.timeoutMs);
    }

    @NotNull
    public String toString() {
        return "SilentNetworkAuthConfig(checkUrl=" + this.checkUrl + ", maxRedirects=" + this.maxRedirects + ", timeoutMs=" + this.timeoutMs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.checkUrl);
        dest.writeInt(this.maxRedirects);
        dest.writeLong(this.timeoutMs);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
      (r1v0 java.lang.String)
      (wrap int:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (10 int) : (r2v0 int))
      (wrap long:?: TERNARY null = ((wrap int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (30000 long) : (r3v0 long))
     A[MD:(java.lang.String, int, long):void (m)] (LINE:5) call: com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthConfig.<init>(java.lang.String, int, long):void type: THIS */
    public /* synthetic */ SilentNetworkAuthConfig(String str, int i10, long j10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? 10 : i10, (i11 & 4) != 0 ? 30000L : j10);
    }
}
