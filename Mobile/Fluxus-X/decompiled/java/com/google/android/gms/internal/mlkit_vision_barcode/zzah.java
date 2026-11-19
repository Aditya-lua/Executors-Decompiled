package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import o9.q;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzah extends p9.a {
    public static final Parcelable.Creator<zzah> CREATOR = new zzai();
    public int zza;
    public boolean zzb;

    public zzah() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzah)) {
            return false;
        }
        zzah zzahVar = (zzah) obj;
        return this.zza == zzahVar.zza && q.b(Boolean.valueOf(this.zzb), Boolean.valueOf(zzahVar.zzb));
    }

    public final int hashCode() {
        return q.c(Integer.valueOf(this.zza), Boolean.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 2, this.zza);
        c.c(parcel, 3, this.zzb);
        c.b(parcel, iA);
    }

    public zzah(int i10, boolean z10) {
        this.zza = i10;
        this.zzb = z10;
    }
}
