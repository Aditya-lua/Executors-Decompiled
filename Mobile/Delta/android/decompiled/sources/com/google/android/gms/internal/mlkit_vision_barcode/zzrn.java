package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.mlkit.vision.barcode.common.Barcode;

/* JADX INFO: loaded from: classes.dex */
public enum zzrn implements zzfc {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(128),
    FORMAT_QR_CODE(Barcode.FORMAT_QR_CODE),
    FORMAT_UPC_A(Barcode.FORMAT_UPC_A),
    FORMAT_UPC_E(Barcode.FORMAT_UPC_E),
    FORMAT_PDF417(Barcode.FORMAT_PDF417),
    FORMAT_AZTEC(Barcode.FORMAT_AZTEC);

    private final int zzp;

    zzrn(int i10) {
        this.zzp = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzfc
    public final int zza() {
        return this.zzp;
    }
}
