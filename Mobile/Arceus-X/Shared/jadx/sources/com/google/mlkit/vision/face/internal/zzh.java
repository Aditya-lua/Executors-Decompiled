package com.google.mlkit.vision.face.internal;

import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_face.zzdk;
import com.google.android.gms.internal.mlkit_vision_face.zzdl;
import com.google.android.gms.internal.mlkit_vision_face.zzdn;
import com.google.android.gms.internal.mlkit_vision_face.zzjv;
import com.google.android.gms.internal.mlkit_vision_face.zzke;
import com.google.android.gms.internal.mlkit_vision_face.zzkf;
import com.google.android.gms.internal.mlkit_vision_face.zzkj;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zzlj;
import com.google.android.gms.internal.mlkit_vision_face.zzll;
import com.google.android.gms.internal.mlkit_vision_face.zznr;
import com.google.android.gms.internal.mlkit_vision_face.zzoa;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzoe;
import com.google.android.gms.internal.mlkit_vision_face.zzof;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.BitmapInStreamingChecker;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p305n9.C8953m;

/* JADX INFO: loaded from: classes2.dex */
public final class zzh extends MLTask {
    static final AtomicBoolean zza = new AtomicBoolean(true);
    private static final ImageUtils zzb = ImageUtils.getInstance();
    private final FaceDetectorOptions zzc;
    private final zzoc zzd;
    private final zzoe zze;
    private final zzb zzf;
    private boolean zzg;
    private final BitmapInStreamingChecker zzh = new BitmapInStreamingChecker();

    public zzh(@NonNull zzoc zzocVar, @NonNull FaceDetectorOptions faceDetectorOptions, @NonNull zzb zzbVar) {
        C8953m.m36048m(faceDetectorOptions, "FaceDetectorOptions can not be null");
        this.zzc = faceDetectorOptions;
        this.zzd = zzocVar;
        this.zzf = zzbVar;
        this.zze = zzoe.zza(MlKitContext.getInstance().getApplicationContext());
    }

    public static void zzf(@NonNull List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Face) it.next()).zzc(-1);
        }
    }

    private final synchronized void zzg(final zzks zzksVar, long j10, final InputImage inputImage, final int i10, final int i11) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.zzd.zzf(new zzoa() { // from class: com.google.mlkit.vision.face.internal.zzf
            @Override // com.google.android.gms.internal.mlkit_vision_face.zzoa
            public final zznr zza() {
                return this.zza.zzc(jElapsedRealtime, zzksVar, i10, i11, inputImage);
            }
        }, zzkt.ON_DEVICE_FACE_DETECT);
        zzdl zzdlVar = new zzdl();
        zzdlVar.zzc(zzksVar);
        zzdlVar.zzd(Boolean.valueOf(zza.get()));
        zzdlVar.zza(Integer.valueOf(i10));
        zzdlVar.zze(Integer.valueOf(i11));
        zzdlVar.zzb(zzj.zza(this.zzc));
        final zzdn zzdnVarZzf = zzdlVar.zzf();
        final zzg zzgVar = new zzg(this);
        final zzoc zzocVar = this.zzd;
        final zzkt zzktVar = zzkt.AGGREGATED_ON_DEVICE_FACE_DETECTION;
        final byte[] bArr = null;
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable(zzktVar, zzdnVarZzf, jElapsedRealtime, zzgVar, bArr) { // from class: com.google.android.gms.internal.mlkit_vision_face.zzny
            public final /* synthetic */ zzkt zzb;
            public final /* synthetic */ Object zzc;
            public final /* synthetic */ long zzd;
            public final /* synthetic */ com.google.mlkit.vision.face.internal.zzg zze;

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(this.zzb, this.zzc, this.zzd, this.zze);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.zze.zzc(true != this.zzg ? 24303 : 24304, zzksVar.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final synchronized void load() {
        this.zzg = this.zzf.zzd();
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final synchronized void release() {
        try {
            this.zzf.zzb();
            zza.set(true);
            zzoc zzocVar = this.zzd;
            zzku zzkuVar = new zzku();
            zzkuVar.zze(this.zzg ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
            zzocVar.zzd(zzof.zzf(zzkuVar), zzkt.ON_DEVICE_FACE_CLOSE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final /* synthetic */ zznr zzc(long j10, zzks zzksVar, int i10, int i11, InputImage inputImage) {
        zzkf zzkfVar;
        zzlj zzljVar = new zzlj();
        zzkj zzkjVar = new zzkj();
        zzkjVar.zzc(Long.valueOf(j10));
        zzkjVar.zzd(zzksVar);
        zzkjVar.zze(Boolean.valueOf(zza.get()));
        Boolean bool = Boolean.TRUE;
        zzkjVar.zza(bool);
        zzkjVar.zzb(bool);
        zzljVar.zzg(zzkjVar.zzf());
        zzljVar.zze(zzj.zza(this.zzc));
        zzljVar.zzd(Integer.valueOf(i10));
        zzljVar.zzh(Integer.valueOf(i11));
        ImageUtils imageUtils = zzb;
        int mobileVisionImageFormat = imageUtils.getMobileVisionImageFormat(inputImage);
        int mobileVisionImageSize = imageUtils.getMobileVisionImageSize(inputImage);
        zzke zzkeVar = new zzke();
        if (mobileVisionImageFormat == -1) {
            zzkfVar = zzkf.BITMAP;
        } else if (mobileVisionImageFormat == 35) {
            zzkfVar = zzkf.YUV_420_888;
        } else if (mobileVisionImageFormat == 842094169) {
            zzkfVar = zzkf.YV12;
        } else if (mobileVisionImageFormat != 16) {
            zzkfVar = mobileVisionImageFormat != 17 ? zzkf.UNKNOWN_FORMAT : zzkf.NV21;
        } else {
            zzkfVar = zzkf.NV16;
        }
        zzkeVar.zza(zzkfVar);
        zzkeVar.zzb(Integer.valueOf(mobileVisionImageSize));
        zzljVar.zzf(zzkeVar.zzd());
        zzll zzllVarZzi = zzljVar.zzi();
        zzku zzkuVar = new zzku();
        zzkuVar.zze(this.zzg ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
        zzkuVar.zzg(zzllVarZzi);
        return zzof.zzf(zzkuVar);
    }

    public final /* synthetic */ zznr zzd(zzdn zzdnVar, int i10, zzjv zzjvVar) {
        zzku zzkuVar = new zzku();
        zzkuVar.zze(this.zzg ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
        zzdk zzdkVar = new zzdk();
        zzdkVar.zza(Integer.valueOf(i10));
        zzdkVar.zzc(zzdnVar);
        zzdkVar.zzb(zzjvVar);
        zzkuVar.zzd(zzdkVar.zze());
        return zzof.zzf(zzkuVar);
    }

    /* JADX DEBUG: Method merged with bridge method: run(Lcom/google/mlkit/common/sdkinternal/MLTaskInput;)Ljava/lang/Object; */
    /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:44:0x0106  */
    /* JADX WARN: Code duplicated, block: B:45:0x0108 A[Catch: all -> 0x002b, MlKitException -> 0x002e, TryCatch #0 {MlKitException -> 0x002e, blocks: (B:5:0x000e, B:9:0x0021, B:10:0x002a, B:16:0x0033, B:42:0x0102, B:50:0x0118, B:49:0x0112, B:45:0x0108, B:19:0x0041, B:20:0x0048, B:21:0x0051, B:23:0x0057, B:24:0x0062, B:26:0x0068, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:34:0x00d9, B:36:0x00e4, B:39:0x00f1, B:41:0x00fa), top: B:62:0x000e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x010e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112 A[Catch: all -> 0x002b, MlKitException -> 0x002e, TryCatch #0 {MlKitException -> 0x002e, blocks: (B:5:0x000e, B:9:0x0021, B:10:0x002a, B:16:0x0033, B:42:0x0102, B:50:0x0118, B:49:0x0112, B:45:0x0108, B:19:0x0041, B:20:0x0048, B:21:0x0051, B:23:0x0057, B:24:0x0062, B:26:0x0068, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:34:0x00d9, B:36:0x00e4, B:39:0x00f1, B:41:0x00fa), top: B:62:0x000e, outer: #1 }] */
    @Override // com.google.mlkit.common.sdkinternal.MLTask
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final synchronized List run(@NonNull InputImage inputImage) {
        List list;
        List arrayList;
        List list2;
        List list3;
        int size;
        int size2;
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.zzh.check(inputImage);
            try {
                Pair pairZza = this.zzf.zza(inputImage);
                List<Face> list4 = (List) pairZza.first;
                List<Face> list5 = (List) pairZza.second;
                if (list4 == null && list5 == null) {
                    throw new MlKitException("No detector is enabled", 13);
                }
                if (list4 == null) {
                    list3 = (List) C8953m.m36047l(list5);
                } else {
                    if (list5 == null) {
                        list3 = (List) C8953m.m36047l(list4);
                    } else {
                        HashSet hashSet = new HashSet();
                        for (Face face : list5) {
                            boolean z10 = false;
                            for (Face face2 : list4) {
                                if (face.getBoundingBox() == null || face2.getBoundingBox() == null) {
                                    list2 = list5;
                                } else {
                                    Rect boundingBox = face.getBoundingBox();
                                    Rect boundingBox2 = face2.getBoundingBox();
                                    if (boundingBox.intersect(boundingBox2)) {
                                        list2 = list5;
                                        double dMin = (Math.min(boundingBox.right, boundingBox2.right) - Math.max(boundingBox.left, boundingBox2.left)) * (Math.min(boundingBox.bottom, boundingBox2.bottom) - Math.max(boundingBox.top, boundingBox2.top));
                                        if (dMin / ((((double) ((boundingBox.right - boundingBox.left) * (boundingBox.bottom - boundingBox.top))) + ((double) ((boundingBox2.right - boundingBox2.left) * (boundingBox2.bottom - boundingBox2.top)))) - dMin) > 0.6d) {
                                            face2.zzb(face.zza());
                                            z10 = true;
                                        }
                                    } else {
                                        list2 = list5;
                                    }
                                }
                                hashSet.add(face2);
                                list5 = list2;
                            }
                            List list6 = list5;
                            if (!z10) {
                                hashSet.add(face);
                            }
                            list5 = list6;
                        }
                        list = list5;
                        arrayList = new ArrayList(hashSet);
                    }
                    zzks zzksVar = zzks.NO_ERROR;
                    if (list == null) {
                        size = 0;
                    } else {
                        size = list.size();
                    }
                    if (list4 == 0) {
                        size2 = 0;
                    } else {
                        size2 = list4.size();
                    }
                    zzg(zzksVar, jElapsedRealtime, inputImage, size, size2);
                    zza.set(false);
                }
                list = list5;
                arrayList = list3;
                zzks zzksVar2 = zzks.NO_ERROR;
                if (list == null) {
                    size = 0;
                } else {
                    size = list.size();
                }
                if (list4 == 0) {
                    size2 = 0;
                } else {
                    size2 = list4.size();
                }
                zzg(zzksVar2, jElapsedRealtime, inputImage, size, size2);
                zza.set(false);
            } catch (MlKitException e10) {
                zzg(e10.getErrorCode() == 14 ? zzks.MODEL_NOT_DOWNLOADED : zzks.UNKNOWN_ERROR, jElapsedRealtime, inputImage, 0, 0);
                throw e10;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }
}
