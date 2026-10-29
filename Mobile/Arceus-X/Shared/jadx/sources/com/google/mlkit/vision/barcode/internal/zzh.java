package com.google.mlkit.vision.barcode.internal;

import android.graphics.Point;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_barcode.zzeu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxn;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.ZoomSuggestionOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p328od.C9724a;
import sb.C11268m;
import sb.InterfaceC11262j;

/* JADX INFO: loaded from: classes2.dex */
public final class zzh extends MobileVisionBase implements BarcodeScanner {
    public static final /* synthetic */ int zzc = 0;
    private static final BarcodeScannerOptions zzd = new BarcodeScannerOptions.Builder().build();
    final zzxk zzb;
    private final boolean zze;
    private final BarcodeScannerOptions zzf;
    private int zzg;
    private boolean zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(@NonNull BarcodeScannerOptions barcodeScannerOptions, @NonNull zzl zzlVar, @NonNull Executor executor, @NonNull zzwp zzwpVar, @NonNull MlKitContext mlKitContext) {
        zzxk zzxkVarZzd;
        super(zzlVar, executor);
        ZoomSuggestionOptions zoomSuggestionOptionsZzb = barcodeScannerOptions.zzb();
        if (zoomSuggestionOptionsZzb == null) {
            zzxkVarZzd = null;
        } else {
            zzxkVarZzd = zzxk.zzd(mlKitContext.getApplicationContext(), mlKitContext.getApplicationContext().getPackageName());
            zzxkVarZzd.zzo(new zze(zoomSuggestionOptionsZzb), zzeu.zza());
            if (zoomSuggestionOptionsZzb.zza() >= 1.0f) {
                zzxkVarZzd.zzk(zoomSuggestionOptionsZzb.zza());
            }
            zzxkVarZzd.zzm();
        }
        this.zzf = barcodeScannerOptions;
        boolean zZzf = zzb.zzf();
        this.zze = zZzf;
        zzrp zzrpVar = new zzrp();
        zzrpVar.zzi(zzb.zzc(barcodeScannerOptions));
        zzrr zzrrVarZzj = zzrpVar.zzj();
        zzrd zzrdVar = new zzrd();
        zzrdVar.zze(zZzf ? zzra.TYPE_THICK : zzra.TYPE_THIN);
        zzrdVar.zzg(zzrrVarZzj);
        zzwpVar.zzd(zzws.zzg(zzrdVar, 1), zzrc.ON_DEVICE_BARCODE_CREATE);
        this.zzb = zzxkVarZzd;
    }

    private final Task zzf(@NonNull Task task, final int i10, final int i11) {
        return task.mo11901o(new InterfaceC11262j() { // from class: com.google.mlkit.vision.barcode.internal.zzf
            @Override // sb.InterfaceC11262j
            public final Task then(Object obj) {
                return this.zza.zzd(i10, i11, (List) obj);
            }
        });
    }

    @Override // com.google.mlkit.vision.common.internal.MobileVisionBase, java.io.Closeable, java.lang.AutoCloseable, com.google.mlkit.vision.barcode.BarcodeScanner
    public final synchronized void close() {
        try {
            zzxk zzxkVar = this.zzb;
            if (zzxkVar != null) {
                zzxkVar.zzn(this.zzh);
                this.zzb.zzj();
            }
            super.close();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.mlkit.vision.interfaces.Detector
    public final int getDetectorType() {
        return 1;
    }

    @Override // com.google.mlkit.vision.barcode.BarcodeScanner, p242k9.InterfaceC7498h
    public final Feature[] getOptionalFeatures() {
        return this.zze ? OptionalModuleUtils.EMPTY_FEATURES : new Feature[]{OptionalModuleUtils.FEATURE_BARCODE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.mlkit.vision.barcode.BarcodeScanner
    @NonNull
    public final Task<List<Barcode>> process(@NonNull C9724a c9724a) {
        super.processBase(c9724a);
        throw null;
    }

    public final /* synthetic */ Task zzd(int i10, int i11, List list) {
        if (this.zzb == null) {
            return C11268m.m42336f(list);
        }
        this.zzg++;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Barcode barcode = (Barcode) it.next();
            if (barcode.getFormat() == -1) {
                arrayList2.add(barcode);
            } else {
                arrayList.add(barcode);
            }
        }
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                Point[] cornerPoints = ((Barcode) arrayList2.get(i12)).getCornerPoints();
                if (cornerPoints != null) {
                    this.zzb.zzi(this.zzg, zzxn.zzg(Arrays.asList(cornerPoints), i10, i11, 0.0f));
                }
            }
        } else {
            this.zzh = true;
        }
        if (true != this.zzf.zzd()) {
            list = arrayList;
        }
        return C11268m.m42336f(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.google.mlkit.vision.barcode.BarcodeScanner
    @NonNull
    public final Task<List<Barcode>> process(@NonNull InputImage inputImage) {
        return zzf(super.processBase(inputImage), inputImage.getWidth(), inputImage.getHeight());
    }
}
