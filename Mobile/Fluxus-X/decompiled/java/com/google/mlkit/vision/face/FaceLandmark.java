package com.google.mlkit.vision.face;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public class FaceLandmark {
    public static final int LEFT_CHEEK = 1;
    public static final int LEFT_EAR = 3;
    public static final int LEFT_EYE = 4;
    public static final int MOUTH_BOTTOM = 0;
    public static final int MOUTH_LEFT = 5;
    public static final int MOUTH_RIGHT = 11;
    public static final int NOSE_BASE = 6;
    public static final int RIGHT_CHEEK = 7;
    public static final int RIGHT_EAR = 9;
    public static final int RIGHT_EYE = 10;
    private final int zza;
    private final PointF zzb;

    @Retention(RetentionPolicy.CLASS)
    public @interface LandmarkType {
    }

    public FaceLandmark(@LandmarkType int i10, @NonNull PointF pointF) {
        this.zza = i10;
        this.zzb = pointF;
    }

    @LandmarkType
    public int getLandmarkType() {
        return this.zza;
    }

    @NonNull
    public PointF getPosition() {
        return this.zzb;
    }

    @NonNull
    public String toString() {
        zzv zzvVarZza = zzw.zza("FaceLandmark");
        zzvVarZza.zzb(Payload.TYPE, this.zza);
        zzvVarZza.zzc("position", this.zzb);
        return zzvVarZza.toString();
    }
}
