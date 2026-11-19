package com.google.mlkit.vision.face;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FaceContour {
    public static final int FACE = 1;
    public static final int LEFT_CHEEK = 14;
    public static final int LEFT_EYE = 6;
    public static final int LEFT_EYEBROW_BOTTOM = 3;
    public static final int LEFT_EYEBROW_TOP = 2;
    public static final int LOWER_LIP_BOTTOM = 11;
    public static final int LOWER_LIP_TOP = 10;
    public static final int NOSE_BOTTOM = 13;
    public static final int NOSE_BRIDGE = 12;
    public static final int RIGHT_CHEEK = 15;
    public static final int RIGHT_EYE = 7;
    public static final int RIGHT_EYEBROW_BOTTOM = 5;
    public static final int RIGHT_EYEBROW_TOP = 4;
    public static final int UPPER_LIP_BOTTOM = 9;
    public static final int UPPER_LIP_TOP = 8;
    private final int zza;
    private final List zzb;

    @Retention(RetentionPolicy.CLASS)
    public @interface ContourType {
    }

    public FaceContour(@ContourType int i10, @NonNull List list) {
        this.zza = i10;
        this.zzb = list;
    }

    @ContourType
    public int getFaceContourType() {
        return this.zza;
    }

    @NonNull
    public List<PointF> getPoints() {
        return this.zzb;
    }

    @NonNull
    public String toString() {
        zzv zzvVarZza = zzw.zza("FaceContour");
        zzvVarZza.zzb(Payload.TYPE, this.zza);
        zzvVarZza.zzc("points", this.zzb.toArray());
        return zzvVarZza.toString();
    }
}
