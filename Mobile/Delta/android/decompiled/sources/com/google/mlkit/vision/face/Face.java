package com.google.mlkit.vision.face;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_face.zzd;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzn;
import com.google.android.gms.internal.mlkit_vision_face.zzos;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzpc;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Face {
    private final Rect zza;
    private int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final float zzf;
    private final float zzg;
    private final float zzh;
    private final SparseArray zzi = new SparseArray();
    private final SparseArray zzj = new SparseArray();

    public Face(@NonNull zzf zzfVar, Matrix matrix) {
        float f10 = zzfVar.zzc;
        float f11 = zzfVar.zze / 2.0f;
        float f12 = zzfVar.zzd;
        float f13 = zzfVar.zzf / 2.0f;
        Rect rect = new Rect((int) (f10 - f11), (int) (f12 - f13), (int) (f10 + f11), (int) (f12 + f13));
        this.zza = rect;
        if (matrix != null) {
            CommonConvertUtils.transformRect(rect, matrix);
        }
        this.zzb = zzfVar.zzb;
        for (zzn zznVar : zzfVar.zzj) {
            if (zze(zznVar.zzd)) {
                PointF pointF = new PointF(zznVar.zzb, zznVar.zzc);
                if (matrix != null) {
                    CommonConvertUtils.transformPointF(pointF, matrix);
                }
                SparseArray sparseArray = this.zzi;
                int i10 = zznVar.zzd;
                sparseArray.put(i10, new FaceLandmark(i10, pointF));
            }
        }
        for (zzd zzdVar : zzfVar.zzn) {
            int i11 = zzdVar.zzb;
            if (zzd(i11)) {
                PointF[] pointFArr = zzdVar.zza;
                pointFArr.getClass();
                int length = pointFArr.length;
                long j10 = ((long) length) + 5 + ((long) (length / 10));
                ArrayList arrayList = new ArrayList(j10 > 2147483647L ? Integer.MAX_VALUE : (int) j10);
                Collections.addAll(arrayList, pointFArr);
                if (matrix != null) {
                    CommonConvertUtils.transformPointList(arrayList, matrix);
                }
                this.zzj.put(i11, new FaceContour(i11, arrayList));
            }
        }
        this.zzf = zzfVar.zzi;
        this.zzg = zzfVar.zzg;
        this.zzh = zzfVar.zzh;
        this.zze = zzfVar.zzm;
        this.zzd = zzfVar.zzk;
        this.zzc = zzfVar.zzl;
    }

    private static boolean zzd(@FaceContour.ContourType int i10) {
        return i10 <= 15 && i10 > 0;
    }

    private static boolean zze(@FaceLandmark.LandmarkType int i10) {
        return i10 == 0 || i10 == 1 || i10 == 7 || i10 == 3 || i10 == 9 || i10 == 4 || i10 == 10 || i10 == 5 || i10 == 11 || i10 == 6;
    }

    @NonNull
    public List<FaceContour> getAllContours() {
        ArrayList arrayList = new ArrayList();
        int size = this.zzj.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add((FaceContour) this.zzj.valueAt(i10));
        }
        return arrayList;
    }

    @NonNull
    public List<FaceLandmark> getAllLandmarks() {
        ArrayList arrayList = new ArrayList();
        int size = this.zzi.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add((FaceLandmark) this.zzi.valueAt(i10));
        }
        return arrayList;
    }

    @NonNull
    public Rect getBoundingBox() {
        return this.zza;
    }

    public FaceContour getContour(@FaceContour.ContourType int i10) {
        return (FaceContour) this.zzj.get(i10);
    }

    public float getHeadEulerAngleX() {
        return this.zzf;
    }

    public float getHeadEulerAngleY() {
        return this.zzg;
    }

    public float getHeadEulerAngleZ() {
        return this.zzh;
    }

    public FaceLandmark getLandmark(@FaceLandmark.LandmarkType int i10) {
        return (FaceLandmark) this.zzi.get(i10);
    }

    public Float getLeftEyeOpenProbability() {
        float f10 = this.zze;
        if (f10 < 0.0f || f10 > 1.0f) {
            return null;
        }
        return Float.valueOf(this.zzd);
    }

    public Float getRightEyeOpenProbability() {
        float f10 = this.zzc;
        if (f10 < 0.0f || f10 > 1.0f) {
            return null;
        }
        return Float.valueOf(f10);
    }

    public Float getSmilingProbability() {
        float f10 = this.zze;
        if (f10 < 0.0f || f10 > 1.0f) {
            return null;
        }
        return Float.valueOf(f10);
    }

    public Integer getTrackingId() {
        int i10 = this.zzb;
        if (i10 == -1) {
            return null;
        }
        return Integer.valueOf(i10);
    }

    @NonNull
    public String toString() {
        zzv zzvVarZza = zzw.zza("Face");
        zzvVarZza.zzc("boundingBox", this.zza);
        zzvVarZza.zzb("trackingId", this.zzb);
        zzvVarZza.zza("rightEyeOpenProbability", this.zzc);
        zzvVarZza.zza("leftEyeOpenProbability", this.zzd);
        zzvVarZza.zza("smileProbability", this.zze);
        zzvVarZza.zza("eulerX", this.zzf);
        zzvVarZza.zza("eulerY", this.zzg);
        zzvVarZza.zza("eulerZ", this.zzh);
        zzv zzvVarZza2 = zzw.zza("Landmarks");
        for (int i10 = 0; i10 <= 11; i10++) {
            if (zze(i10)) {
                zzvVarZza2.zzc("landmark_" + i10, getLandmark(i10));
            }
        }
        zzvVarZza.zzc("landmarks", zzvVarZza2.toString());
        zzv zzvVarZza3 = zzw.zza("Contours");
        for (int i11 = 1; i11 <= 15; i11++) {
            zzvVarZza3.zzc("Contour_" + i11, getContour(i11));
        }
        zzvVarZza.zzc("contours", zzvVarZza3.toString());
        return zzvVarZza.toString();
    }

    @NonNull
    public final SparseArray zza() {
        return this.zzj;
    }

    public final void zzb(@NonNull SparseArray sparseArray) {
        this.zzj.clear();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            this.zzj.put(sparseArray.keyAt(i10), (FaceContour) sparseArray.valueAt(i10));
        }
    }

    public final void zzc(int i10) {
        this.zzb = -1;
    }

    public Face(@NonNull zzow zzowVar, Matrix matrix) {
        Rect rectZzh = zzowVar.zzh();
        this.zza = rectZzh;
        if (matrix != null) {
            CommonConvertUtils.transformRect(rectZzh, matrix);
        }
        this.zzb = zzowVar.zzg();
        for (zzpc zzpcVar : zzowVar.zzj()) {
            if (zze(zzpcVar.zza())) {
                PointF pointFZzb = zzpcVar.zzb();
                if (matrix != null) {
                    CommonConvertUtils.transformPointF(pointFZzb, matrix);
                }
                this.zzi.put(zzpcVar.zza(), new FaceLandmark(zzpcVar.zza(), pointFZzb));
            }
        }
        for (zzos zzosVar : zzowVar.zzi()) {
            int iZza = zzosVar.zza();
            if (zzd(iZza)) {
                List listZzb = zzosVar.zzb();
                listZzb.getClass();
                ArrayList arrayList = new ArrayList(listZzb);
                if (matrix != null) {
                    CommonConvertUtils.transformPointList(arrayList, matrix);
                }
                this.zzj.put(iZza, new FaceContour(iZza, arrayList));
            }
        }
        this.zzf = zzowVar.zzf();
        this.zzg = zzowVar.zzb();
        this.zzh = -zzowVar.zzd();
        this.zze = zzowVar.zze();
        this.zzd = zzowVar.zza();
        this.zzc = zzowVar.zzc();
    }
}
