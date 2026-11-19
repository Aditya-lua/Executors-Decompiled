package com.google.mlkit.vision.barcode;

import androidx.annotation.NonNull;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.barcode.internal.zzg;
import o9.s;

/* JADX INFO: loaded from: classes2.dex */
public class BarcodeScanning {
    private BarcodeScanning() {
    }

    @NonNull
    public static BarcodeScanner getClient() {
        return ((zzg) MlKitContext.getInstance().get(zzg.class)).zza();
    }

    @NonNull
    public static BarcodeScanner getClient(@NonNull BarcodeScannerOptions barcodeScannerOptions) {
        s.m(barcodeScannerOptions, "You must provide a valid BarcodeScannerOptions.");
        return ((zzg) MlKitContext.getInstance().get(zzg.class)).zzb(barcodeScannerOptions);
    }
}
