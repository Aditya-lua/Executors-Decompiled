package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p571y9.InterfaceC13133a;

/* JADX INFO: loaded from: classes.dex */
public final class zzuv extends zza implements IInterface {
    public zzuv(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizer");
    }

    public final zzvf zzd(InterfaceC13133a interfaceC13133a, zzuq zzuqVar) {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, interfaceC13133a);
        zzc.zza(parcelZza, zzuqVar);
        Parcel parcelZzb = zzb(3, parcelZza);
        zzvf zzvfVarCreateFromParcel = parcelZzb.readInt() == 0 ? null : zzvf.CREATOR.createFromParcel(parcelZzb);
        parcelZzb.recycle();
        return zzvfVarCreateFromParcel;
    }

    public final void zze() {
        zzc(1, zza());
    }

    public final void zzf() {
        zzc(2, zza());
    }
}
