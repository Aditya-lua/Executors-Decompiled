package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzae();
    public String zza;
    public String zzb;

    public zzr() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.v(parcel, 2, this.zza, false);
        b.v(parcel, 3, this.zzb, false);
        b.b(parcel, iA);
    }

    public zzr(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }
}
