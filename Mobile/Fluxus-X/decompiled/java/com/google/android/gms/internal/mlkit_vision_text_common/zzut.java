package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzut extends zzb implements zzuu {
    public static zzuu zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator");
        return iInterfaceQueryLocalInterface instanceof zzuu ? (zzuu) iInterfaceQueryLocalInterface : new zzus(iBinder);
    }
}
