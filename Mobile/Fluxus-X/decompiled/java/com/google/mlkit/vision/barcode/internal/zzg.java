package com.google.mlkit.vision.barcode.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxa;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;

/* JADX INFO: loaded from: classes2.dex */
public final class zzg {
    private final zzi zza;
    private final ExecutorSelector zzb;
    private final MlKitContext zzc;

    public zzg(zzi zziVar, ExecutorSelector executorSelector, MlKitContext mlKitContext) {
        this.zza = zziVar;
        this.zzb = executorSelector;
        this.zzc = mlKitContext;
    }

    public final zzh zza() {
        return zzb(zzh.zzd);
    }

    public final zzh zzb(@NonNull BarcodeScannerOptions barcodeScannerOptions) {
        return new zzh(barcodeScannerOptions, (zzl) this.zza.get(barcodeScannerOptions), this.zzb.getExecutorToUse(barcodeScannerOptions.zzc()), zzxa.zzb(zzb.zzd()), this.zzc);
    }
}
