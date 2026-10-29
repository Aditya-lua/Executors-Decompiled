package com.google.mlkit.vision.face.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zzlj;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzof;
import com.google.android.gms.internal.mlkit_vision_face.zzon;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import java.util.List;
import java.util.concurrent.Executor;
import p328od.C9724a;

/* JADX INFO: loaded from: classes2.dex */
public class FaceDetectorImpl extends MobileVisionBase<List<Face>> implements FaceDetector {
    static final FaceDetectorOptions zzb = new FaceDetectorOptions.Builder().build();
    private final boolean zzc;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FaceDetectorImpl(zzh zzhVar, ExecutorSelector executorSelector, FaceDetectorOptions faceDetectorOptions, zzd zzdVar) {
        Executor executorToUse = executorSelector.getExecutorToUse(faceDetectorOptions.zzf());
        zzoc zzocVarZzb = zzon.zzb(zzj.zzb());
        super(zzhVar, executorToUse);
        boolean zZzd = zzj.zzd();
        this.zzc = zZzd;
        zzku zzkuVar = new zzku();
        zzkuVar.zze(zZzd ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
        zzlj zzljVar = new zzlj();
        zzljVar.zze(zzj.zza(faceDetectorOptions));
        zzkuVar.zzg(zzljVar.zzi());
        zzocVarZzb.zzd(zzof.zzg(zzkuVar, 1), zzkt.ON_DEVICE_FACE_CREATE);
    }

    @Override // com.google.mlkit.vision.interfaces.Detector
    public final int getDetectorType() {
        return 2;
    }

    @Override // com.google.mlkit.vision.face.FaceDetector, p242k9.InterfaceC7498h
    @NonNull
    public final Feature[] getOptionalFeatures() {
        return this.zzc ? OptionalModuleUtils.EMPTY_FEATURES : new Feature[]{OptionalModuleUtils.FEATURE_FACE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.mlkit.vision.face.FaceDetector
    @NonNull
    public final Task<List<Face>> process(@NonNull C9724a c9724a) {
        return super.processBase(c9724a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.google.mlkit.vision.face.FaceDetector
    @NonNull
    public final Task<List<Face>> process(@NonNull InputImage inputImage) {
        return super.processBase(inputImage);
    }
}
