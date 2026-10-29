package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lb.C8122y;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzbo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbo> CREATOR = new C8122y();

    /* JADX INFO: renamed from: f */
    public final int f9469f;

    /* JADX INFO: renamed from: g */
    public final int f9470g;

    /* JADX INFO: renamed from: h */
    public final long f9471h;

    /* JADX INFO: renamed from: i */
    public final long f9472i;

    public zzbo(int i10, int i11, long j10, long j11) {
        this.f9469f = i10;
        this.f9470g = i11;
        this.f9471h = j10;
        this.f9472i = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbo) {
            zzbo zzboVar = (zzbo) obj;
            if (this.f9469f == zzboVar.f9469f && this.f9470g == zzboVar.f9470g && this.f9471h == zzboVar.f9471h && this.f9472i == zzboVar.f9472i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C8947k.m36027c(Integer.valueOf(this.f9470g), Integer.valueOf(this.f9469f), Long.valueOf(this.f9472i), Long.valueOf(this.f9471h));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f9469f + " Cell status: " + this.f9470g + " elapsed time NS: " + this.f9472i + " system time ms: " + this.f9471h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.f9469f);
        C9718b.m38470n(parcel, 2, this.f9470g);
        C9718b.m38474r(parcel, 3, this.f9471h);
        C9718b.m38474r(parcel, 4, this.f9472i);
        C9718b.m38458b(parcel, iM38457a);
    }
}
