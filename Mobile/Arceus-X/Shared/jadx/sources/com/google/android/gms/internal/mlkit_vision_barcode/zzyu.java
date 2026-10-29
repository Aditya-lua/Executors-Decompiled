package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzyu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyu> CREATOR = new zzyv();
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;

    public zzyu(int i10, int i11, int i12, int i13, long j10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, i11);
        C9718b.m38470n(parcel, 2, this.zzb);
        C9718b.m38470n(parcel, 3, this.zzc);
        C9718b.m38470n(parcel, 4, this.zzd);
        C9718b.m38474r(parcel, 5, this.zze);
        C9718b.m38458b(parcel, iM38457a);
    }
}
