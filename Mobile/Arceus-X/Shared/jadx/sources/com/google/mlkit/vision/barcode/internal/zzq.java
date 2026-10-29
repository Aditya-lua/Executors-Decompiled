package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzal;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.common.internal.ImageConvertUtils;
import java.util.ArrayList;
import java.util.List;
import p305n9.C8953m;
import p571y9.BinderC13134b;

/* JADX INFO: loaded from: classes2.dex */
final class zzq implements zzm {
    private boolean zza;
    private final Context zzb;
    private final zzah zzc;
    private final zzwp zzd;
    private zzaj zze;

    public zzq(Context context, BarcodeScannerOptions barcodeScannerOptions, zzwp zzwpVar) {
        zzah zzahVar = new zzah();
        this.zzc = zzahVar;
        this.zzb = context;
        zzahVar.zza = barcodeScannerOptions.zza();
        this.zzd = zzwpVar;
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final List zza(InputImage inputImage) throws MlKitException {
        zzu[] zzuVarArrZzf;
        if (this.zze == null) {
            zzc();
        }
        zzaj zzajVar = this.zze;
        if (zzajVar == null) {
            throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
        }
        zzaj zzajVar2 = (zzaj) C8953m.m36047l(zzajVar);
        zzan zzanVar = new zzan(inputImage.getWidth(), inputImage.getHeight(), 0, 0L, CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees()));
        try {
            int format = inputImage.getFormat();
            if (format == -1) {
                zzuVarArrZzf = zzajVar2.zzf(BinderC13134b.m48743u2(inputImage.getBitmapInternal()), zzanVar);
            } else if (format == 17) {
                zzuVarArrZzf = zzajVar2.zze(BinderC13134b.m48743u2(inputImage.getByteBuffer()), zzanVar);
            } else if (format == 35) {
                Image.Plane[] planeArr = (Image.Plane[]) C8953m.m36047l(inputImage.getPlanes());
                zzanVar.zza = planeArr[0].getRowStride();
                zzuVarArrZzf = zzajVar2.zze(BinderC13134b.m48743u2(planeArr[0].getBuffer()), zzanVar);
            } else {
                if (format != 842094169) {
                    throw new MlKitException("Unsupported image format: " + inputImage.getFormat(), 3);
                }
                zzuVarArrZzf = zzajVar2.zze(BinderC13134b.m48743u2(ImageConvertUtils.getInstance().convertToNv21Buffer(inputImage, false)), zzanVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzu zzuVar : zzuVarArrZzf) {
                arrayList.add(new Barcode(new zzp(zzuVar), inputImage.getCoordinatesMatrix()));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new MlKitException("Failed to detect with legacy barcode detector", 13, e10);
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final void zzb() {
        zzaj zzajVar = this.zze;
        if (zzajVar != null) {
            try {
                zzajVar.zzd();
            } catch (RemoteException e10) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e10);
            }
            this.zze = null;
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final boolean zzc() throws MlKitException {
        if (this.zze != null) {
            return false;
        }
        try {
            zzaj zzajVarZzd = zzal.zza(DynamiteModule.m9235e(this.zzb, DynamiteModule.f7553b, OptionalModuleUtils.DEPRECATED_DYNAMITE_MODULE_ID).m9244d("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).zzd(BinderC13134b.m48743u2(this.zzb), this.zzc);
            this.zze = zzajVarZzd;
            if (zzajVarZzd == null && !this.zza) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                OptionalModuleUtils.requestDownload(this.zzb, OptionalModuleUtils.BARCODE);
                this.zza = true;
                zzb.zze(this.zzd, zzrb.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            zzb.zze(this.zzd, zzrb.NO_ERROR);
            return false;
        } catch (RemoteException e10) {
            throw new MlKitException("Failed to create legacy barcode detector.", 13, e10);
        } catch (DynamiteModule.C1906a e11) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e11);
        }
    }
}
