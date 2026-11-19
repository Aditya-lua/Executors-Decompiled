package com.google.mlkit.vision.face;

import androidx.annotation.NonNull;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.face.internal.zzc;
import o9.s;

/* JADX INFO: loaded from: classes2.dex */
public class FaceDetection {
    private FaceDetection() {
    }

    @NonNull
    public static FaceDetector getClient() {
        return ((zzc) MlKitContext.getInstance().get(zzc.class)).zza();
    }

    @NonNull
    public static FaceDetector getClient(@NonNull FaceDetectorOptions faceDetectorOptions) {
        s.m(faceDetectorOptions, "You must provide a valid FaceDetectorOptions.");
        return ((zzc) MlKitContext.getInstance().get(zzc.class)).zzb(faceDetectorOptions);
    }
}
