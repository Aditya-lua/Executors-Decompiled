package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import p9.a;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzp extends a {
    public static final Parcelable.Creator<zzp> CREATOR = new zzq();
    public int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    public int zze;

    public zzp() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 2, this.zza);
        c.n(parcel, 3, this.zzb);
        c.n(parcel, 4, this.zzc);
        c.r(parcel, 5, this.zzd);
        c.n(parcel, 6, this.zze);
        c.b(parcel, iA);
    }

    public zzp(int i10, int i11, int i12, long j10, int i13) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = j10;
        this.zze = i13;
    }
}
