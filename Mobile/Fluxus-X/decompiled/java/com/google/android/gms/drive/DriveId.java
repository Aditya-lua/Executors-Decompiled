package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import o9.s;
import p9.a;
import y9.c;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class DriveId extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<DriveId> CREATOR = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f6157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6158h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6159i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile String f6160j = null;

    public DriveId(String str, long j10, long j11, int i10) {
        this.f6156f = str;
        boolean z10 = true;
        s.a(!BuildConfig.FLAVOR.equals(str));
        if (str == null && j10 == -1) {
            z10 = false;
            j10 = -1;
        }
        s.a(z10);
        this.f6157g = j10;
        this.f6158h = j11;
        this.f6159i = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj != null && obj.getClass() == DriveId.class) {
            DriveId driveId = (DriveId) obj;
            if (driveId.f6158h != this.f6158h) {
                return false;
            }
            long j10 = driveId.f6157g;
            if (j10 == -1) {
                if (this.f6157g == -1) {
                    return ((String) s.l(driveId.f6156f)).equals(this.f6156f);
                }
                j10 = -1;
            }
            String str2 = this.f6156f;
            if (str2 != null && (str = driveId.f6156f) != null) {
                return j10 == this.f6157g && str.equals(str2);
            }
            if (j10 == this.f6157g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f6157g;
        if (j10 == -1) {
            String str = this.f6156f;
            s.l(str);
            return str.hashCode();
        }
        long j11 = this.f6158h;
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
        String str = this.f6156f;
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 2, str, false);
        p9.c.r(parcel, 3, this.f6157g);
        p9.c.r(parcel, 4, this.f6158h);
        p9.c.n(parcel, 5, this.f6159i);
        p9.c.b(parcel, iA);
    }
}
