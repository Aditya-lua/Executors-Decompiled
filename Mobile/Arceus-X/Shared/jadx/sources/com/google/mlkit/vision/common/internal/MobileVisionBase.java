package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0955f0;
import androidx.p616lifecycle.InterfaceC0978r;
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
import p305n9.C8935g;
import p305n9.C8953m;
import p328od.C9724a;
import sb.C11246b;
import sb.C11268m;
import sb.InterfaceC11254f;

/* JADX INFO: loaded from: classes2.dex */
public class MobileVisionBase<DetectionResultT> implements Closeable, InterfaceC0978r {
    public static final /* synthetic */ int zza = 0;
    private static final C8935g zzb = new C8935g("MobileVisionBase", "");
    private final AtomicBoolean zzc = new AtomicBoolean(false);
    private final MLTask zzd;
    private final C11246b zze;
    private final Executor zzf;
    private final Task zzg;

    public MobileVisionBase(@NonNull MLTask<DetectionResultT, InputImage> mLTask, @NonNull Executor executor) {
        this.zzd = mLTask;
        C11246b c11246b = new C11246b();
        this.zze = c11246b;
        this.zzf = executor;
        mLTask.pin();
        this.zzg = mLTask.callAfterLoad(executor, new Callable() { // from class: com.google.mlkit.vision.common.internal.zzb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i10 = MobileVisionBase.zza;
                return null;
            }
        }, c11246b.m42314b()).mo11891e(new InterfaceC11254f() { // from class: com.google.mlkit.vision.common.internal.zzc
            @Override // sb.InterfaceC11254f
            public final void onFailure(Exception exc) {
                MobileVisionBase.zzb.m36005e("MobileVisionBase", "Error preloading model resource", exc);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.google.mlkit.vision.barcode.BarcodeScanner
    @InterfaceC0955f0(AbstractC0966l.a.ON_DESTROY)
    public synchronized void close() {
        if (this.zzc.getAndSet(true)) {
            return;
        }
        this.zze.m42313a();
        this.zzd.unpin(this.zzf);
    }

    @NonNull
    public synchronized Task<Void> closeWithTask() {
        if (this.zzc.getAndSet(true)) {
            return C11268m.m42336f(null);
        }
        this.zze.m42313a();
        return this.zzd.unpinWithTask(this.zzf);
    }

    @NonNull
    public synchronized Task<Void> getInitTaskBase() {
        return this.zzg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @NonNull
    public Task<DetectionResultT> process(@NonNull Bitmap bitmap, int i10) {
        return processBase(InputImage.fromBitmap(bitmap, i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @NonNull
    public synchronized Task<DetectionResultT> processBase(@NonNull C9724a c9724a) {
        C8953m.m36048m(c9724a, "MlImage can not be null");
        if (!this.zzc.get()) {
            throw null;
        }
        return C11268m.m42335e(new MlKitException("This detector is already closed!", 14));
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

    public final /* synthetic */ Object zzb(C9724a c9724a) throws MlKitException {
        InputImage inputImageConvertMlImagetoInputImage = CommonConvertUtils.convertMlImagetoInputImage(c9724a);
        if (inputImageConvertMlImagetoInputImage != null) {
            return this.zzd.run(inputImageConvertMlImagetoInputImage);
        }
        throw new MlKitException("Current type of MlImage is not supported.", 13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
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
        C8953m.m36048m(inputImage, "InputImage can not be null");
        if (this.zzc.get()) {
            return C11268m.m42335e(new MlKitException("This detector is already closed!", 14));
        }
        if (inputImage.getWidth() >= 32 && inputImage.getHeight() >= 32) {
            return this.zzd.callAfterLoad(this.zzf, new Callable() { // from class: com.google.mlkit.vision.common.internal.zza
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zza(inputImage);
                }
            }, this.zze.m42314b());
        }
        return C11268m.m42335e(new MlKitException("InputImage width and height should be at least 32!", 3));
    }
}
