package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzaj extends zza implements IInterface {
    public zzaj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final void zzd() {
        zzc(3, zza());
    }

    public final zzu[] zze(y9.a aVar, zzan zzanVar) {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, aVar);
        zzc.zza(parcelZza, zzanVar);
        Parcel parcelZzb = zzb(1, parcelZza);
        zzu[] zzuVarArr = (zzu[]) parcelZzb.createTypedArray(zzu.CREATOR);
        parcelZzb.recycle();
        return zzuVarArr;
    }

    public final zzu[] zzf(y9.a aVar, zzan zzanVar) {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, aVar);
        zzc.zza(parcelZza, zzanVar);
        Parcel parcelZzb = zzb(2, parcelZza);
        zzu[] zzuVarArr = (zzu[]) parcelZzb.createTypedArray(zzu.CREATOR);
        parcelZzb.recycle();
        return zzuVarArr;
    }
}
