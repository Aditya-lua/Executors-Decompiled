package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p571y9.InterfaceC13133a;

/* JADX INFO: loaded from: classes.dex */
public final class zzk extends zza implements zzm {
    public zzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzm
    public final zzj zzd(InterfaceC13133a interfaceC13133a, zzh zzhVar) {
        zzj zzjVar;
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, interfaceC13133a);
        zzc.zza(parcelZza, zzhVar);
        Parcel parcelZzb = zzb(1, parcelZza);
        IBinder strongBinder = parcelZzb.readStrongBinder();
        if (strongBinder == null) {
            zzjVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            zzjVar = iInterfaceQueryLocalInterface instanceof zzj ? (zzj) iInterfaceQueryLocalInterface : new zzj(strongBinder);
        }
        parcelZzb.recycle();
        return zzjVar;
    }
}
