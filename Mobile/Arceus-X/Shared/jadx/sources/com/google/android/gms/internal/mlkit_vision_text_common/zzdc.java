package com.google.android.gms.internal.mlkit_vision_text_common;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import p410rf.InterfaceC10869e;

/* JADX INFO: loaded from: classes.dex */
public final class zzdc {
    private final Map zza;
    private final Map zzb;
    private final InterfaceC10869e zzc;

    public zzdc(Map map, Map map2, InterfaceC10869e interfaceC10869e) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = interfaceC10869e;
    }

    @NonNull
    public final byte[] zza(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzcz(byteArrayOutputStream, this.zza, this.zzb, this.zzc).zzf(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
