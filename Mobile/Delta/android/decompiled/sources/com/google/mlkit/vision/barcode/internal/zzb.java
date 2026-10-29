package com.google.mlkit.vision.barcode.internal;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzro;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwe;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzb {
    static final AtomicReference zza;
    private static final SparseArray zzb;
    private static final SparseArray zzc;

    @SuppressLint({"UseSparseArrays"})
    private static final Map zzd;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        zzc = sparseArray2;
        zza = new AtomicReference();
        sparseArray.put(-1, zzrn.FORMAT_UNKNOWN);
        sparseArray.put(1, zzrn.FORMAT_CODE_128);
        sparseArray.put(2, zzrn.FORMAT_CODE_39);
        sparseArray.put(4, zzrn.FORMAT_CODE_93);
        sparseArray.put(8, zzrn.FORMAT_CODABAR);
        sparseArray.put(16, zzrn.FORMAT_DATA_MATRIX);
        sparseArray.put(32, zzrn.FORMAT_EAN_13);
        sparseArray.put(64, zzrn.FORMAT_EAN_8);
        sparseArray.put(128, zzrn.FORMAT_ITF);
        sparseArray.put(Barcode.FORMAT_QR_CODE, zzrn.FORMAT_QR_CODE);
        sparseArray.put(Barcode.FORMAT_UPC_A, zzrn.FORMAT_UPC_A);
        sparseArray.put(Barcode.FORMAT_UPC_E, zzrn.FORMAT_UPC_E);
        sparseArray.put(Barcode.FORMAT_PDF417, zzrn.FORMAT_PDF417);
        sparseArray.put(Barcode.FORMAT_AZTEC, zzrn.FORMAT_AZTEC);
        sparseArray2.put(0, zzro.TYPE_UNKNOWN);
        sparseArray2.put(1, zzro.TYPE_CONTACT_INFO);
        sparseArray2.put(2, zzro.TYPE_EMAIL);
        sparseArray2.put(3, zzro.TYPE_ISBN);
        sparseArray2.put(4, zzro.TYPE_PHONE);
        sparseArray2.put(5, zzro.TYPE_PRODUCT);
        sparseArray2.put(6, zzro.TYPE_SMS);
        sparseArray2.put(7, zzro.TYPE_TEXT);
        sparseArray2.put(8, zzro.TYPE_URL);
        sparseArray2.put(9, zzro.TYPE_WIFI);
        sparseArray2.put(10, zzro.TYPE_GEO);
        sparseArray2.put(11, zzro.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, zzro.TYPE_DRIVER_LICENSE);
        HashMap map = new HashMap();
        zzd = map;
        map.put(1, zzvw.CODE_128);
        map.put(2, zzvw.CODE_39);
        map.put(4, zzvw.CODE_93);
        map.put(8, zzvw.CODABAR);
        map.put(16, zzvw.DATA_MATRIX);
        map.put(32, zzvw.EAN_13);
        map.put(64, zzvw.EAN_8);
        map.put(128, zzvw.ITF);
        map.put(Integer.valueOf(Barcode.FORMAT_QR_CODE), zzvw.QR_CODE);
        map.put(Integer.valueOf(Barcode.FORMAT_UPC_A), zzvw.UPC_A);
        map.put(Integer.valueOf(Barcode.FORMAT_UPC_E), zzvw.UPC_E);
        map.put(Integer.valueOf(Barcode.FORMAT_PDF417), zzvw.PDF417);
        map.put(Integer.valueOf(Barcode.FORMAT_AZTEC), zzvw.AZTEC);
    }

    public static zzrn zza(@Barcode.BarcodeFormat int i10) {
        zzrn zzrnVar = (zzrn) zzb.get(i10);
        return zzrnVar == null ? zzrn.FORMAT_UNKNOWN : zzrnVar;
    }

    public static zzro zzb(@Barcode.BarcodeValueType int i10) {
        zzro zzroVar = (zzro) zzc.get(i10);
        return zzroVar == null ? zzro.TYPE_UNKNOWN : zzroVar;
    }

    public static zzvz zzc(BarcodeScannerOptions barcodeScannerOptions) {
        int iZza = barcodeScannerOptions.zza();
        zzcp zzcpVar = new zzcp();
        if (iZza == 0) {
            zzcpVar.zze(zzd.values());
        } else {
            for (Map.Entry entry : zzd.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & iZza) != 0) {
                    zzcpVar.zzd((zzvw) entry.getValue());
                }
            }
        }
        zzvx zzvxVar = new zzvx();
        zzvxVar.zzb(zzcpVar.zzf());
        return zzvxVar.zzc();
    }

    public static String zzd() {
        return true != zzf() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    public static void zze(zzwp zzwpVar, final zzrb zzrbVar) {
        zzwpVar.zzf(new zzwo() { // from class: com.google.mlkit.vision.barcode.internal.zza
            @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwo
            public final zzwe zza() {
                zzrd zzrdVar = new zzrd();
                zzra zzraVar = zzb.zzf() ? zzra.TYPE_THICK : zzra.TYPE_THIN;
                zzrb zzrbVar2 = zzrbVar;
                zzrdVar.zze(zzraVar);
                zzrs zzrsVar = new zzrs();
                zzrsVar.zzb(zzrbVar2);
                zzrdVar.zzh(zzrsVar.zzc());
                return zzws.zzf(zzrdVar);
            }
        }, zzrc.ON_DEVICE_BARCODE_LOAD);
    }

    public static boolean zzf() {
        AtomicReference atomicReference = zza;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean zZzd = zzo.zzd(MlKitContext.getInstance().getApplicationContext());
        atomicReference.set(Boolean.valueOf(zZzd));
        return zZzd;
    }
}
