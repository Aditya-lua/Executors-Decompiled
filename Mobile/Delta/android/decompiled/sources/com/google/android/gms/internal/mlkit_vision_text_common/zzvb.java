package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzvb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvb> CREATOR = new zzvc();
    private final String zza;
    private final Rect zzb;
    private final List zzc;
    private final String zzd;
    private final float zze;
    private final float zzf;
    private final List zzg;

    public zzvb(String str, Rect rect, List list, String str2, float f10, float f11, List list2) {
        this.zza = str;
        this.zzb = rect;
        this.zzc = list;
        this.zzd = str2;
        this.zze = f10;
        this.zzf = f11;
        this.zzg = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iA = b.a(parcel);
        b.v(parcel, 1, str, false);
        b.t(parcel, 2, this.zzb, i10, false);
        b.z(parcel, 3, this.zzc, false);
        b.v(parcel, 4, this.zzd, false);
        b.k(parcel, 5, this.zze);
        b.k(parcel, 6, this.zzf);
        b.z(parcel, 7, this.zzg, false);
        b.b(parcel, iA);
    }

    public final float zza() {
        return this.zzf;
    }

    public final float zzb() {
        return this.zze;
    }

    public final Rect zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zza;
    }

    public final List zzf() {
        return this.zzc;
    }

    public final List zzg() {
        return this.zzg;
    }
}
