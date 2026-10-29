package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzp extends AbstractSafeParcelable {
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
        int iA = b.a(parcel);
        b.n(parcel, 2, this.zza);
        b.n(parcel, 3, this.zzb);
        b.n(parcel, 4, this.zzc);
        b.r(parcel, 5, this.zzd);
        b.n(parcel, 6, this.zze);
        b.b(parcel, iA);
    }

    public zzp(int i10, int i11, int i12, long j10, int i13) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = j10;
        this.zze = i13;
    }
}
