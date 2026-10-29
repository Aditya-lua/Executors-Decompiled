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
    public final int f7391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f7393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f7394i;

    public zzbo(int i10, int i11, long j10, long j11) {
        this.f7391f = i10;
        this.f7392g = i11;
        this.f7393h = j10;
        this.f7394i = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbo) {
            zzbo zzboVar = (zzbo) obj;
            if (this.f7391f == zzboVar.f7391f && this.f7392g == zzboVar.f7392g && this.f7393h == zzboVar.f7393h && this.f7394i == zzboVar.f7394i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return k.c(Integer.valueOf(this.f7392g), Integer.valueOf(this.f7391f), Long.valueOf(this.f7394i), Long.valueOf(this.f7393h));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f7391f + " Cell status: " + this.f7392g + " elapsed time NS: " + this.f7394i + " system time ms: " + this.f7393h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.n(parcel, 1, this.f7391f);
        b.n(parcel, 2, this.f7392g);
        b.r(parcel, 3, this.f7393h);
        b.r(parcel, 4, this.f7394i);
        b.b(parcel, iA);
    }
}
