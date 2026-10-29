package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.p000lifecycle.f0;
import androidx.p000lifecycle.l;
import androidx.p000lifecycle.r;
import com.google.android.gms.internal.mlkit_vision_common.zzlx;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.vision.common.InputImage;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import n9.g;
import nd.a;
import sb.b;
import sb.f;
import sb.m;

/* JADX INFO: loaded from: classes2.dex */
public class MobileVisionBase<DetectionResultT> implements Closeable, r {
    public static final /* synthetic */ int zza = 0;
    private static final g zzb = new g("MobileVisionBase", "");
    private final AtomicBoolean zzc = new AtomicBoolean(false);
    private final MLTask zzd;
    private final b zze;
    private final Executor zzf;
    private final Task zzg;

    public MobileVisionBase(@NonNull MLTask<DetectionResultT, InputImage> mLTask, @NonNull Executor executor) {
        this.zzd = mLTask;
        b bVar = new b();
        this.zze = bVar;
        this.zzf = executor;
        mLTask.pin();
        this.zzg = mLTask.callAfterLoad(executor, new Callable() { // from class: com.google.mlkit.vision.common.internal.zzb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i10 = MobileVisionBase.zza;
                return null;
            }
        }, bVar.b()).e(new f() { // from class: com.google.mlkit.vision.common.internal.zzc
            @Override // sb.f
            public final void onFailure(Exception exc) {
                MobileVisionBase.zzb.e("MobileVisionBase", "Error preloading model resource", exc);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.google.mlkit.vision.barcode.BarcodeScanner
    @f0(l.a.ON_DESTROY)
    public synchronized void close() {
        if (this.zzc.getAndSet(true)) {
            return;
        }
        this.zze.a();
        this.zzd.unpin(this.zzf);
    }

    @NonNull
    public synchronized Task<Void> closeWithTask() {
        if (this.zzc.getAndSet(true)) {
            return m.f(null);
        }
        this.zze.a();
        return this.zzd.unpinWithTask(this.zzf);
    }

    @NonNull
    public synchronized Task<Void> getInitTaskBase() {
        return this.zzg;
    }

    @NonNull
    public Task<DetectionResultT> process(@NonNull Bitmap bitmap, int i10) {
        return processBase(InputImage.fromBitmap(bitmap, i10));
    }

    @NonNull
    public synchronized Task<DetectionResultT> processBase(@NonNull a aVar) {
        n9.m.m(aVar, "MlImage can not be null");
        if (!this.zzc.get()) {
            throw null;
        }
        return m.e(new MlKitException("This detector is already closed!", 14));
    }

    public final /* synthetic */ Object zza(InputImage inputImage) {
        zzlx zzlxVarZze = zzlx.zze("detectorTaskWithResource#run");
        zzlxVarZze.zzb();
        try {
            Object objRun = this.zzd.run(inputImage);
            zzlxVarZze.close();
            return objRun;
        } catch (Throwable th2) {
            try {
                zzlxVarZze.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    public final /* synthetic */ Object zzb(a aVar) throws MlKitException {
        InputImage inputImageConvertMlImagetoInputImage = CommonConvertUtils.convertMlImagetoInputImage(aVar);
        if (inputImageConvertMlImagetoInputImage != null) {
            return this.zzd.run(inputImageConvertMlImagetoInputImage);
        }
        throw new MlKitException("Current type of MlImage is not supported.", 13);
    }

    @NonNull
    public Task<DetectionResultT> process(@NonNull Image image, int i10) {
        return processBase(InputImage.fromMediaImage(image, i10));
    }

    @NonNull
    public Task<DetectionResultT> process(@NonNull Image image, int i10, @NonNull Matrix matrix) {
        return processBase(InputImage.fromMediaImage(image, i10, matrix));
    }

    @NonNull
    public Task<DetectionResultT> process(@NonNull ByteBuffer byteBuffer, int i10, int i11, int i12, int i13) {
        return processBase(InputImage.fromByteBuffer(byteBuffer, i10, i11, i12, i13));
    }

    @NonNull
    public synchronized Task<DetectionResultT> processBase(@NonNull final InputImage inputImage) {
        n9.m.m(inputImage, "InputImage can not be null");
        if (this.zzc.get()) {
            return m.e(new MlKitException("This detector is already closed!", 14));
        }
        if (inputImage.getWidth() >= 32 && inputImage.getHeight() >= 32) {
            return this.zzd.callAfterLoad(this.zzf, new Callable() { // from class: com.google.mlkit.vision.common.internal.zza
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zza(inputImage);
                }
            }, this.zze.b());
        }
        return m.e(new MlKitException("InputImage width and height should be at least 32!", 3));
    }
}
