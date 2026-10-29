package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzow> CREATOR = new zzox();
    private final int zza;
    private final Rect zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final float zzf;
    private final float zzg;
    private final float zzh;
    private final float zzi;
    private final List zzj;
    private final List zzk;

    public zzow(int i10, Rect rect, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2) {
        this.zza = i10;
        this.zzb = rect;
        this.zzc = f10;
        this.zzd = f11;
        this.zze = f12;
        this.zzf = f13;
        this.zzg = f14;
        this.zzh = f15;
        this.zzi = f16;
        this.zzj = list;
        this.zzk = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.zza);
        C9718b.m38476t(parcel, 2, this.zzb, i10, false);
        C9718b.m38467k(parcel, 3, this.zzc);
        C9718b.m38467k(parcel, 4, this.zzd);
        C9718b.m38467k(parcel, 5, this.zze);
        C9718b.m38467k(parcel, 6, this.zzf);
        C9718b.m38467k(parcel, 7, this.zzg);
        C9718b.m38467k(parcel, 8, this.zzh);
        C9718b.m38467k(parcel, 9, this.zzi);
        C9718b.m38482z(parcel, 10, this.zzj, false);
        C9718b.m38482z(parcel, 11, this.zzk, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    public final float zza() {
        return this.zzf;
    }

    public final float zzb() {
        return this.zzd;
    }

    public final float zzc() {
        return this.zzg;
    }

    public final float zzd() {
        return this.zzc;
    }

    public final float zze() {
        return this.zzh;
    }

    public final float zzf() {
        return this.zze;
    }

    public final int zzg() {
        return this.zza;
    }

    public final Rect zzh() {
        return this.zzb;
    }

    public final List zzi() {
        return this.zzk;
    }

    public final List zzj() {
        return this.zzj;
    }
}
