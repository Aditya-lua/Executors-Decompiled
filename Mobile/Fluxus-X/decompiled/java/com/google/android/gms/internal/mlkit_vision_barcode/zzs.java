package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzs extends p9.a {
    public static final Parcelable.Creator<zzs> CREATOR = new zzaf();
    public String zza;
    public String zzb;

    public zzs() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.v(parcel, 2, this.zza, false);
        c.v(parcel, 3, this.zzb, false);
        c.b(parcel, iA);
    }

    public zzs(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }
}
