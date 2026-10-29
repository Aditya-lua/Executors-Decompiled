package com.google.mlkit.vision.barcode;

import androidx.annotation.NonNull;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.barcode.internal.zzg;
import p305n9.C8953m;

/* JADX INFO: loaded from: classes2.dex */
public class BarcodeScanning {
    private BarcodeScanning() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @NonNull
    public static BarcodeScanner getClient() {
        return ((zzg) MlKitContext.getInstance().get(zzg.class)).zza();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @NonNull
    public static BarcodeScanner getClient(@NonNull BarcodeScannerOptions barcodeScannerOptions) {
        C8953m.m36048m(barcodeScannerOptions, "You must provide a valid BarcodeScannerOptions.");
        return ((zzg) MlKitContext.getInstance().get(zzg.class)).zzb(barcodeScannerOptions);
    }
}
