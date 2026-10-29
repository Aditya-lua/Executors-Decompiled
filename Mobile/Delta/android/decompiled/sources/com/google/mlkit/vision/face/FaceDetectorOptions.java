package com.google.mlkit.vision.face;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;
import n9.k;

/* JADX INFO: loaded from: classes2.dex */
public class FaceDetectorOptions {
    public static final int CLASSIFICATION_MODE_ALL = 2;
    public static final int CLASSIFICATION_MODE_NONE = 1;
    public static final int CONTOUR_MODE_ALL = 2;
    public static final int CONTOUR_MODE_NONE = 1;
    public static final int LANDMARK_MODE_ALL = 2;
    public static final int LANDMARK_MODE_NONE = 1;
    public static final int PERFORMANCE_MODE_ACCURATE = 2;
    public static final int PERFORMANCE_MODE_FAST = 1;

    @LandmarkMode
    private final int zza;

    @ContourMode
    private final int zzb;

    @ClassificationMode
    private final int zzc;

    @PerformanceMode
    private final int zzd;
    private final boolean zze;
    private final float zzf;
    private final Executor zzg;

    public static class Builder {

        @LandmarkMode
        private int zza = 1;

        @ContourMode
        private int zzb = 1;

        @ClassificationMode
        private int zzc = 1;

        @PerformanceMode
        private int zzd = 1;
        private boolean zze = false;
        private float zzf = 0.1f;
        private Executor zzg;

        @NonNull
        public FaceDetectorOptions build() {
            return new FaceDetectorOptions(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, null);
        }

        @NonNull
        public Builder enableTracking() {
            this.zze = true;
            return this;
        }

        @NonNull
        public Builder setClassificationMode(@ClassificationMode int i10) {
            this.zzc = i10;
            return this;
        }

        @NonNull
        public Builder setContourMode(@ContourMode int i10) {
            this.zzb = i10;
            return this;
        }

        @NonNull
        public Builder setExecutor(@NonNull Executor executor) {
            this.zzg = executor;
            return this;
        }

        @NonNull
        public Builder setLandmarkMode(@LandmarkMode int i10) {
            this.zza = i10;
            return this;
        }

        @NonNull
        public Builder setMinFaceSize(float f10) {
            this.zzf = f10;
            return this;
        }

        @NonNull
        public Builder setPerformanceMode(@PerformanceMode int i10) {
            this.zzd = i10;
            return this;
        }
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface ClassificationMode {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface ContourMode {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface LandmarkMode {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface PerformanceMode {
    }

    public /* synthetic */ FaceDetectorOptions(int i10, int i11, int i12, int i13, boolean z10, float f10, Executor executor, zza zzaVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = z10;
        this.zzf = f10;
        this.zzg = executor;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FaceDetectorOptions)) {
            return false;
        }
        FaceDetectorOptions faceDetectorOptions = (FaceDetectorOptions) obj;
        return Float.floatToIntBits(this.zzf) == Float.floatToIntBits(faceDetectorOptions.zzf) && k.b(Integer.valueOf(this.zza), Integer.valueOf(faceDetectorOptions.zza)) && k.b(Integer.valueOf(this.zzb), Integer.valueOf(faceDetectorOptions.zzb)) && k.b(Integer.valueOf(this.zzd), Integer.valueOf(faceDetectorOptions.zzd)) && k.b(Boolean.valueOf(this.zze), Boolean.valueOf(faceDetectorOptions.zze)) && k.b(Integer.valueOf(this.zzc), Integer.valueOf(faceDetectorOptions.zzc)) && k.b(this.zzg, faceDetectorOptions.zzg);
    }

    public int hashCode() {
        return k.c(Integer.valueOf(Float.floatToIntBits(this.zzf)), Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzd), Boolean.valueOf(this.zze), Integer.valueOf(this.zzc), this.zzg);
    }

    @NonNull
    public String toString() {
        zzv zzvVarZza = zzw.zza("FaceDetectorOptions");
        zzvVarZza.zzb("landmarkMode", this.zza);
        zzvVarZza.zzb("contourMode", this.zzb);
        zzvVarZza.zzb("classificationMode", this.zzc);
        zzvVarZza.zzb("performanceMode", this.zzd);
        zzvVarZza.zzd("trackingEnabled", this.zze);
        zzvVarZza.zza("minFaceSize", this.zzf);
        return zzvVarZza.toString();
    }

    public final float zza() {
        return this.zzf;
    }

    @ClassificationMode
    public final int zzb() {
        return this.zzc;
    }

    @ContourMode
    public final int zzc() {
        return this.zzb;
    }

    @LandmarkMode
    public final int zzd() {
        return this.zza;
    }

    @PerformanceMode
    public final int zze() {
        return this.zzd;
    }

    public final Executor zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return this.zze;
    }
}
