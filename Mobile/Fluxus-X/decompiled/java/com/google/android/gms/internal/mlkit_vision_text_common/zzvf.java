package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p9.a;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzvf extends a {
    public static final Parcelable.Creator<zzvf> CREATOR = new zzvg();
    private final String zza;
    private final List zzb;

    public zzvf(String str, List list) {
        this.zza = str;
        this.zzb = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iA = c.a(parcel);
        c.v(parcel, 1, str, false);
        c.z(parcel, 2, this.zzb, false);
        c.b(parcel, iA);
    }

    public final String zza() {
        return this.zza;
    }

    public final List zzb() {
        return this.zzb;
    }
}
