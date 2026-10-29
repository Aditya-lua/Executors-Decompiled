package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyu;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.common.internal.ImageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n9.m;
import y9.a;
import y9.b;

/* JADX INFO: loaded from: classes2.dex */
final class zzo implements zzm {
    private static final zzcs zza = zzcs.zzh(OptionalModuleUtils.BARCODE_MODULE_ID, OptionalModuleUtils.TFLITE_DYNAMITE_MODULE_ID);
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private final Context zze;
    private final BarcodeScannerOptions zzf;
    private final zzwp zzg;
    private zzyl zzh;

    public zzo(Context context, BarcodeScannerOptions barcodeScannerOptions, zzwp zzwpVar) {
        this.zze = context;
        this.zzf = barcodeScannerOptions;
        this.zzg = zzwpVar;
    }

    public static boolean zzd(Context context) {
        return DynamiteModule.a(context, "com.google.mlkit.dynamite.barcode") > 0;
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final List zza(InputImage inputImage) throws MlKitException {
        if (this.zzh == null) {
            zzc();
        }
        zzyl zzylVar = (zzyl) m.l(this.zzh);
        if (!this.zzb) {
            try {
                zzylVar.zze();
                this.zzb = true;
            } catch (RemoteException e10) {
                throw new MlKitException("Failed to init barcode scanner.", 13, e10);
            }
        }
        int width = inputImage.getWidth();
        if (inputImage.getFormat() == 35) {
            width = ((Image.Plane[]) m.l(inputImage.getPlanes()))[0].getRowStride();
        }
        try {
            List listZzd = zzylVar.zzd(ImageUtils.getInstance().getImageDataWrapper(inputImage), new zzyu(inputImage.getFormat(), width, inputImage.getHeight(), CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = listZzd.iterator();
            while (it.hasNext()) {
                arrayList.add(new Barcode(new zzn((zzyb) it.next()), inputImage.getCoordinatesMatrix()));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new MlKitException("Failed to run barcode scanner.", 13, e11);
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final void zzb() {
        zzyl zzylVar = this.zzh;
        if (zzylVar != null) {
            try {
                zzylVar.zzf();
            } catch (RemoteException e10) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e10);
            }
            this.zzh = null;
            this.zzb = false;
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final boolean zzc() throws MlKitException {
        if (this.zzh != null) {
            return this.zzc;
        }
        if (zzd(this.zze)) {
            this.zzc = true;
            try {
                this.zzh = zze(DynamiteModule.f5863c, "com.google.mlkit.dynamite.barcode", "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e10) {
                throw new MlKitException("Failed to create thick barcode scanner.", 13, e10);
            } catch (DynamiteModule.a e11) {
                throw new MlKitException("Failed to load the bundled barcode module.", 13, e11);
            }
        } else {
            this.zzc = false;
            if (!OptionalModuleUtils.areAllRequiredModulesAvailable(this.zze, zza)) {
                if (!this.zzd) {
                    OptionalModuleUtils.requestDownload(this.zze, zzcs.zzh(OptionalModuleUtils.BARCODE, OptionalModuleUtils.TFLITE_DYNAMITE));
                    this.zzd = true;
                }
                zzb.zze(this.zzg, zzrb.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.zzh = zze(DynamiteModule.b, OptionalModuleUtils.BARCODE_MODULE_ID, "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.a e12) {
                zzb.zze(this.zzg, zzrb.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException("Failed to create thin barcode scanner.", 13, e12);
            }
        }
        zzb.zze(this.zzg, zzrb.NO_ERROR);
        return this.zzc;
    }

    public final zzyl zze(DynamiteModule.b bVar, String str, String str2) {
        zzyo zzyoVarZza = zzyn.zza(DynamiteModule.e(this.zze, bVar, str).d(str2));
        BarcodeScannerOptions barcodeScannerOptions = this.zzf;
        a aVarU2 = b.u2(this.zze);
        int iZza = barcodeScannerOptions.zza();
        boolean z10 = true;
        if (!barcodeScannerOptions.zzd() && this.zzf.zzb() == null) {
            z10 = false;
        }
        return zzyoVarZza.zzd(aVarU2, new zzyd(iZza, z10));
    }
}
