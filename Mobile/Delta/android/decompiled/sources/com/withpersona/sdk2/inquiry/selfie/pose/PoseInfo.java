package com.withpersona.sdk2.inquiry.selfie.pose;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0015¨\u0006("}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "Landroid/os/Parcelable;", "", "index", "Lkn/a;", "pose", "", "isLast", "", "token", "<init>", "(ILkn/a;ZLjava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lkn/a;", "f", "()Lkn/a;", "c", "Z", "i", "()Z", "d", "Ljava/lang/String;", "g", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PoseInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PoseInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final kn.a pose;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean isLast;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String token;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PoseInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PoseInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PoseInfo(parcel.readInt(), kn.a.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PoseInfo[] newArray(int i10) {
            return new PoseInfo[i10];
        }
    }

    public PoseInfo(int i10, @NotNull kn.a pose, boolean z10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(pose, "pose");
        this.index = i10;
        this.pose = pose;
        this.isLast = z10;
        this.token = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PoseInfo)) {
            return false;
        }
        PoseInfo poseInfo = (PoseInfo) other;
        return this.index == poseInfo.index && this.pose == poseInfo.pose && this.isLast == poseInfo.isLast && Intrinsics.c(this.token, poseInfo.token);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final kn.a getPose() {
        return this.pose;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.index) * 31) + this.pose.hashCode()) * 31) + Boolean.hashCode(this.isLast)) * 31;
        String str = this.token;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsLast() {
        return this.isLast;
    }

    @NotNull
    public String toString() {
        return "PoseInfo(index=" + this.index + ", pose=" + this.pose + ", isLast=" + this.isLast + ", token=" + this.token + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.index);
        dest.writeString(this.pose.name());
        dest.writeInt(this.isLast ? 1 : 0);
        dest.writeString(this.token);
    }
}
