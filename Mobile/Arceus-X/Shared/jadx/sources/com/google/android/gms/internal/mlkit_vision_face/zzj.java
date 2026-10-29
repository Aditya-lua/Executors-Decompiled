package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p571y9.InterfaceC13133a;

/* JADX INFO: loaded from: classes.dex */
public final class zzj extends zza implements IInterface {
    public zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    public final void zzd() {
        zzc(3, zza());
    }

    public final zzf[] zze(InterfaceC13133a interfaceC13133a, zzp zzpVar) {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, interfaceC13133a);
        zzc.zza(parcelZza, zzpVar);
        Parcel parcelZzb = zzb(1, parcelZza);
        zzf[] zzfVarArr = (zzf[]) parcelZzb.createTypedArray(zzf.CREATOR);
        parcelZzb.recycle();
        return zzfVarArr;
    }

    public final zzf[] zzf(InterfaceC13133a interfaceC13133a, InterfaceC13133a interfaceC13133a2, InterfaceC13133a interfaceC13133a3, int i10, int i11, int i12, int i13, int i14, int i15, zzp zzpVar) {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, interfaceC13133a);
        zzc.zzb(parcelZza, interfaceC13133a2);
        zzc.zzb(parcelZza, interfaceC13133a3);
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
