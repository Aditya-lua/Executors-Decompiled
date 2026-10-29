package com.google.mlkit.vision.text.internal;

import android.content.Context;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzun;
import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;
import p213j9.C7091d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzp extends LazyInstanceMap {
    private final MlKitContext zza;

    public zzp(MlKitContext mlKitContext) {
        this.zza = mlKitContext;
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        TextRecognizerOptionsInterface textRecognizerOptionsInterface = (TextRecognizerOptionsInterface) obj;
        zzuc zzucVarZzb = zzun.zzb(textRecognizerOptionsInterface.getLoggingLibraryName());
        Context applicationContext = this.zza.getApplicationContext();
        return new TextRecognizerTaskWithResource(zzucVarZzb, (C7091d.m29876f().m29877a(applicationContext) >= 204700000 || textRecognizerOptionsInterface.getIsThickClient()) ? new zzd(applicationContext, textRecognizerOptionsInterface, zzucVarZzb) : new zze(applicationContext), textRecognizerOptionsInterface);
    }
}
