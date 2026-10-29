package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzyb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyb> CREATOR = new zzyc();
    private final int zza;
    private final String zzb;
    private final String zzc;
    private final byte[] zzd;
    private final Point[] zze;
    private final int zzf;
    private final zzxu zzg;
    private final zzxx zzh;
    private final zzxy zzi;
    private final zzya zzj;
    private final zzxz zzk;
    private final zzxv zzl;
    private final zzxr zzm;
    private final zzxs zzn;
    private final zzxt zzo;

    public zzyb(int i10, String str, String str2, byte[] bArr, Point[] pointArr, int i11, zzxu zzxuVar, zzxx zzxxVar, zzxy zzxyVar, zzya zzyaVar, zzxz zzxzVar, zzxv zzxvVar, zzxr zzxrVar, zzxs zzxsVar, zzxt zzxtVar) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bArr;
        this.zze = pointArr;
        this.zzf = i11;
        this.zzg = zzxuVar;
        this.zzh = zzxxVar;
        this.zzi = zzxyVar;
        this.zzj = zzyaVar;
        this.zzk = zzxzVar;
        this.zzl = zzxvVar;
        this.zzm = zzxrVar;
        this.zzn = zzxsVar;
        this.zzo = zzxtVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.zza);
        C9718b.m38478v(parcel, 2, this.zzb, false);
        C9718b.m38478v(parcel, 3, this.zzc, false);
        C9718b.m38463g(parcel, 4, this.zzd, false);
        C9718b.m38481y(parcel, 5, this.zze, i10, false);
        C9718b.m38470n(parcel, 6, this.zzf);
        C9718b.m38476t(parcel, 7, this.zzg, i10, false);
        C9718b.m38476t(parcel, 8, this.zzh, i10, false);
        C9718b.m38476t(parcel, 9, this.zzi, i10, false);
        C9718b.m38476t(parcel, 10, this.zzj, i10, false);
        C9718b.m38476t(parcel, 11, this.zzk, i10, false);
        C9718b.m38476t(parcel, 12, this.zzl, i10, false);
        C9718b.m38476t(parcel, 13, this.zzm, i10, false);
        C9718b.m38476t(parcel, 14, this.zzn, i10, false);
        C9718b.m38476t(parcel, 15, this.zzo, i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzf;
    }

    public final zzxr zzc() {
        return this.zzm;
    }

    public final zzxs zzd() {
        return this.zzn;
    }

    public final zzxt zze() {
        return this.zzo;
    }

    public final zzxu zzf() {
        return this.zzg;
    }

    public final zzxv zzg() {
        return this.zzl;
    }

    public final zzxx zzh() {
        return this.zzh;
    }

    public final zzxy zzi() {
        return this.zzi;
    }

    public final zzxz zzj() {
        return this.zzk;
    }

    public final zzya zzk() {
        return this.zzj;
    }

    public final String zzl() {
        return this.zzb;
    }

    public final String zzm() {
        return this.zzc;
    }

    public final byte[] zzn() {
        return this.zzd;
    }

    public final Point[] zzo() {
        return this.zze;
    }
}
