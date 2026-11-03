package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lb.y;
import n9.k;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzbo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbo> CREATOR = new y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f7467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f7468i;

    public zzbo(int i10, int i11, long j10, long j11) {
        this.f7465f = i10;
        this.f7466g = i11;
        this.f7467h = j10;
        this.f7468i = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbo) {
            zzbo zzboVar = (zzbo) obj;
            if (this.f7465f == zzboVar.f7465f && this.f7466g == zzboVar.f7466g && this.f7467h == zzboVar.f7467h && this.f7468i == zzboVar.f7468i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return k.c(Integer.valueOf(this.f7466g), Integer.valueOf(this.f7465f), Long.valueOf(this.f7468i), Long.valueOf(this.f7467h));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f7465f + " Cell status: " + this.f7466g + " elapsed time NS: " + this.f7468i + " system time ms: " + this.f7467h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.n(parcel, 1, this.f7465f);
        b.n(parcel, 2, this.f7466g);
        b.r(parcel, 3, this.f7467h);
        b.r(parcel, 4, this.f7468i);
        b.b(parcel, iA);
    }
}
