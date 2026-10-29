package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.m;
import x9.b;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class DriveId extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<DriveId> CREATOR = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f5859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f5860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile String f5862j = null;

    public DriveId(String str, long j10, long j11, int i10) {
        this.f5858f = str;
        boolean z10 = true;
        m.a(!"".equals(str));
        if (str == null && j10 == -1) {
            z10 = false;
            j10 = -1;
        }
        m.a(z10);
        this.f5859g = j10;
        this.f5860h = j11;
        this.f5861i = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj != null && obj.getClass() == DriveId.class) {
            DriveId driveId = (DriveId) obj;
            if (driveId.f5860h != this.f5860h) {
                return false;
            }
            long j10 = driveId.f5859g;
            if (j10 == -1) {
                if (this.f5859g == -1) {
                    return ((String) m.l(driveId.f5858f)).equals(this.f5858f);
                }
                j10 = -1;
            }
            String str2 = this.f5858f;
            if (str2 != null && (str = driveId.f5858f) != null) {
                return j10 == this.f5859g && str.equals(str2);
            }
            if (j10 == this.f5859g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f5859g;
        if (j10 == -1) {
            String str = this.f5858f;
            m.l(str);
            return str.hashCode();
        }
        long j11 = this.f5860h;
        String strValueOf = String.valueOf(j10);
        StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + String.valueOf(strValueOf).length());
        sb2.append(j11);
        sb2.append(strValueOf);
        return sb2.toString().hashCode();
    }

    @NonNull
    public final String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.f5858f;
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 2, str, false);
        o9.b.r(parcel, 3, this.f5859g);
        o9.b.r(parcel, 4, this.f5860h);
        o9.b.n(parcel, 5, this.f5861i);
        o9.b.b(parcel, iA);
    }
}
