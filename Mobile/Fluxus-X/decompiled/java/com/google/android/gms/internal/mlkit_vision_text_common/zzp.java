package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import p9.a;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzp extends a {
    public static final Parcelable.Creator<zzp> CREATOR = new zzq();
    private final String zza;

    public zzp() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iA = c.a(parcel);
        c.v(parcel, 2, str, false);
        c.b(parcel, iA);
    }

    public zzp(String str) {
        this.zza = str;
    }
}
