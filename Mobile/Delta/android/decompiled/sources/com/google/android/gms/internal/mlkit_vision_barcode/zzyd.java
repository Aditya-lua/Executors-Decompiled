package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzyd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyd> CREATOR = new zzye();
    private final int zza;
    private final boolean zzb;

    public zzyd(int i10, boolean z10) {
        this.zza = i10;
        this.zzb = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iA = b.a(parcel);
        b.n(parcel, 1, i11);
        b.c(parcel, 2, this.zzb);
        b.b(parcel, iA);
    }
}
