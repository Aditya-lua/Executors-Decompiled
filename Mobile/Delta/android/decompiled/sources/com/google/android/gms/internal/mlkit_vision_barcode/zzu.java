package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();
    public int zza;
    public String zzb;
    public String zzc;
    public int zzd;
    public Point[] zze;
    public zzn zzf;
    public zzq zzg;
    public zzr zzh;
    public zzt zzi;
    public zzs zzj;
    public zzo zzk;
    public zzk zzl;
    public zzl zzm;
    public zzm zzn;
    public byte[] zzo;
    public boolean zzp;
    public double zzq;

    public zzu() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.n(parcel, 2, this.zza);
        b.v(parcel, 3, this.zzb, false);
        b.v(parcel, 4, this.zzc, false);
        b.n(parcel, 5, this.zzd);
        b.y(parcel, 6, this.zze, i10, false);
        b.t(parcel, 7, this.zzf, i10, false);
        b.t(parcel, 8, this.zzg, i10, false);
        b.t(parcel, 9, this.zzh, i10, false);
        b.t(parcel, 10, this.zzi, i10, false);
        b.t(parcel, 11, this.zzj, i10, false);
        b.t(parcel, 12, this.zzk, i10, false);
        b.t(parcel, 13, this.zzl, i10, false);
        b.t(parcel, 14, this.zzm, i10, false);
        b.t(parcel, 15, this.zzn, i10, false);
        b.g(parcel, 16, this.zzo, false);
        b.c(parcel, 17, this.zzp);
        b.i(parcel, 18, this.zzq);
        b.b(parcel, iA);
    }

    public zzu(int i10, String str, String str2, int i11, Point[] pointArr, zzn zznVar, zzq zzqVar, zzr zzrVar, zzt zztVar, zzs zzsVar, zzo zzoVar, zzk zzkVar, zzl zzlVar, zzm zzmVar, byte[] bArr, boolean z10, double d10) {
        this.zza = i10;
        this.zzb = str;
        this.zzo = bArr;
        this.zzc = str2;
        this.zzd = i11;
        this.zze = pointArr;
        this.zzp = z10;
        this.zzq = d10;
        this.zzf = zznVar;
        this.zzg = zzqVar;
        this.zzh = zzrVar;
        this.zzi = zztVar;
        this.zzj = zzsVar;
        this.zzk = zzoVar;
        this.zzl = zzkVar;
        this.zzm = zzlVar;
        this.zzn = zzmVar;
    }
}
