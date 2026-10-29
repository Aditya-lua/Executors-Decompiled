package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzxp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxp> CREATOR = new zzxo();
    private final int zza;
    private final String[] zzb;

    public zzxp(int i10, String[] strArr) {
        this.zza = i10;
        this.zzb = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.zza);
        C9718b.m38479w(parcel, 2, this.zzb, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    public final int zza() {
        return this.zza;
    }

    public final String[] zzb() {
        return this.zzb;
    }
}
