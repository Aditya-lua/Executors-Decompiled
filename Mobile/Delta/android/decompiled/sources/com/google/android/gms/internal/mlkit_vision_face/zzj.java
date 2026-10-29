package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import y9.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzj extends zza implements IInterface {
    public zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    public final void zzd() {
        zzc(3, zza());
    }

    public final zzf[] zze(a aVar, zzp zzpVar) {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, aVar);
        zzc.zza(parcelZza, zzpVar);
        Parcel parcelZzb = zzb(1, parcelZza);
        zzf[] zzfVarArr = (zzf[]) parcelZzb.createTypedArray(zzf.CREATOR);
        parcelZzb.recycle();
        return zzfVarArr;
    }

    public final zzf[] zzf(a aVar, a aVar2, a aVar3, int i10, int i11, int i12, int i13, int i14, int i15, zzp zzpVar) {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, aVar);
        zzc.zzb(parcelZza, aVar2);
        zzc.zzb(parcelZza, aVar3);
        parcelZza.writeInt(i10);
        parcelZza.writeInt(i11);
        parcelZza.writeInt(i12);
        parcelZza.writeInt(i13);
        parcelZza.writeInt(i14);
        parcelZza.writeInt(i15);
        zzc.zza(parcelZza, zzpVar);
        Parcel parcelZzb = zzb(4, parcelZza);
        zzf[] zzfVarArr = (zzf[]) parcelZzb.createTypedArray(zzf.CREATOR);
        parcelZzb.recycle();
        return zzfVarArr;
    }
}
