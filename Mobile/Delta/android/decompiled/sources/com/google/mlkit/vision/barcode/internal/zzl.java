package com.google.mlkit.vision.barcode.internal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzft;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwe;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.BitmapInStreamingChecker;
import com.google.mlkit.vision.common.internal.ImageUtils;
import java.util.Iterator;
import java.util.List;
import n9.m;

/* JADX INFO: loaded from: classes2.dex */
public final class zzl extends MLTask {
    private final BarcodeScannerOptions zzc;
    private final zzm zzd;
    private final zzwp zze;
    private final zzwr zzf;
    private final BitmapInStreamingChecker zzg = new BitmapInStreamingChecker();
    private boolean zzh;
    private static final ImageUtils zzb = ImageUtils.getInstance();
    static boolean zza = true;

    public zzl(MlKitContext mlKitContext, BarcodeScannerOptions barcodeScannerOptions, zzm zzmVar, zzwp zzwpVar) {
        m.m(mlKitContext, "MlKitContext can not be null");
        m.m(barcodeScannerOptions, "BarcodeScannerOptions can not be null");
        this.zzc = barcodeScannerOptions;
        this.zzd = zzmVar;
        this.zze = zzwpVar;
        this.zzf = zzwr.zza(mlKitContext.getApplicationContext());
    }

    private final void zzf(final zzrb zzrbVar, long j10, @NonNull final InputImage inputImage, List list) {
        final zzcp zzcpVar = new zzcp();
        final zzcp zzcpVar2 = new zzcp();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Barcode barcode = (Barcode) it.next();
                zzcpVar.zzd(zzb.zza(barcode.getFormat()));
                zzcpVar2.zzd(zzb.zzb(barcode.getValueType()));
            }
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.zze.zzf(new zzwo() { // from class: com.google.mlkit.vision.barcode.internal.zzj
            @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwo
            public final zzwe zza() {
                return this.zza.zzc(jElapsedRealtime, zzrbVar, zzcpVar, zzcpVar2, inputImage);
            }
        }, zzrc.ON_DEVICE_BARCODE_DETECT);
        zzfr zzfrVar = new zzfr();
        zzfrVar.zze(zzrbVar);
        zzfrVar.zzf(Boolean.valueOf(zza));
        zzfrVar.zzg(zzb.zzc(this.zzc));
        zzfrVar.zzc(zzcpVar.zzf());
        zzfrVar.zzd(zzcpVar2.zzf());
        final zzft zzftVarZzh = zzfrVar.zzh();
        final zzk zzkVar = new zzk(this);
        final zzwp zzwpVar = this.zze;
        final zzrc zzrcVar = zzrc.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwn
            @Override // java.lang.Runnable
            public final void run() {
                zzwpVar.zzh(zzrcVar, zzftVarZzh, jElapsedRealtime, zzkVar);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.zzf.zzc(true != this.zzh ? 24301 : 24302, zzrbVar.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final synchronized void load() {
        this.zzh = this.zzd.zzc();
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final synchronized void release() {
        try {
            this.zzd.zzb();
            zza = true;
            zzrd zzrdVar = new zzrd();
            zzra zzraVar = this.zzh ? zzra.TYPE_THICK : zzra.TYPE_THIN;
            zzwp zzwpVar = this.zze;
            zzrdVar.zze(zzraVar);
            zzrp zzrpVar = new zzrp();
            zzrpVar.zzi(zzb.zzc(this.zzc));
            zzrdVar.zzg(zzrpVar.zzj());
            zzwpVar.zzd(zzws.zzf(zzrdVar), zzrc.ON_DEVICE_BARCODE_CLOSE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final /* synthetic */ zzwe zzc(long j10, zzrb zzrbVar, zzcp zzcpVar, zzcp zzcpVar2, InputImage inputImage) {
        zzqi zzqiVar;
        zzrp zzrpVar = new zzrp();
        zzqo zzqoVar = new zzqo();
        zzqoVar.zzc(Long.valueOf(j10));
        zzqoVar.zzd(zzrbVar);
        zzqoVar.zze(Boolean.valueOf(zza));
        Boolean bool = Boolean.TRUE;
        zzqoVar.zza(bool);
        zzqoVar.zzb(bool);
        zzrpVar.zzh(zzqoVar.zzf());
        zzrpVar.zzi(zzb.zzc(this.zzc));
        zzrpVar.zze(zzcpVar.zzf());
        zzrpVar.zzf(zzcpVar2.zzf());
        int format = inputImage.getFormat();
        int mobileVisionImageSize = zzb.getMobileVisionImageSize(inputImage);
        zzqh zzqhVar = new zzqh();
        if (format == -1) {
            zzqiVar = zzqi.BITMAP;
        } else if (format == 35) {
            zzqiVar = zzqi.YUV_420_888;
        } else if (format == 842094169) {
            zzqiVar = zzqi.YV12;
        } else if (format != 16) {
            zzqiVar = format != 17 ? zzqi.UNKNOWN_FORMAT : zzqi.NV21;
        } else {
            zzqiVar = zzqi.NV16;
        }
        zzqhVar.zza(zzqiVar);
        zzqhVar.zzb(Integer.valueOf(mobileVisionImageSize));
        zzrpVar.zzg(zzqhVar.zzd());
        zzrd zzrdVar = new zzrd();
        zzrdVar.zze(this.zzh ? zzra.TYPE_THICK : zzra.TYPE_THIN);
        zzrdVar.zzg(zzrpVar.zzj());
        return zzws.zzf(zzrdVar);
    }

    public final /* synthetic */ zzwe zzd(zzft zzftVar, int i10, zzqd zzqdVar) {
        zzrd zzrdVar = new zzrd();
        zzrdVar.zze(this.zzh ? zzra.TYPE_THICK : zzra.TYPE_THIN);
        zzfq zzfqVar = new zzfq();
        zzfqVar.zza(Integer.valueOf(i10));
        zzfqVar.zzc(zzftVar);
        zzfqVar.zzb(zzqdVar);
        zzrdVar.zzd(zzfqVar.zze());
        return zzws.zzf(zzrdVar);
    }

    @Override // com.google.mlkit.common.sdkinternal.MLTask
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final synchronized List run(@NonNull InputImage inputImage) throws Throwable {
        zzl zzlVar;
        InputImage inputImage2;
        try {
            try {
                BitmapInStreamingChecker bitmapInStreamingChecker = this.zzg;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                bitmapInStreamingChecker.check(inputImage);
                try {
                    List listZza = this.zzd.zza(inputImage);
                    zzlVar = this;
                    inputImage2 = inputImage;
                    try {
                        zzlVar.zzf(zzrb.NO_ERROR, jElapsedRealtime, inputImage2, listZza);
                        zza = false;
                        return listZza;
                    } catch (MlKitException e10) {
                        e = e10;
                        MlKitException mlKitException = e;
                        zzlVar.zzf(mlKitException.getErrorCode() == 14 ? zzrb.MODEL_NOT_DOWNLOADED : zzrb.UNKNOWN_ERROR, jElapsedRealtime, inputImage2, null);
                        throw mlKitException;
                    }
                } catch (MlKitException e11) {
                    e = e11;
                    zzlVar = this;
                    inputImage2 = inputImage;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
