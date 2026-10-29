package com.google.mlkit.vision.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.google.mlkit.common.sdkinternal.MLTaskInput;
import com.google.mlkit.vision.common.internal.ImageConvertUtils;
import com.google.mlkit.vision.common.internal.ImageUtils;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import p305n9.C8953m;

/* JADX INFO: loaded from: classes2.dex */
public class InputImage implements MLTaskInput {
    public static final int IMAGE_FORMAT_BITMAP = -1;
    public static final int IMAGE_FORMAT_NV21 = 17;
    public static final int IMAGE_FORMAT_YUV_420_888 = 35;
    public static final int IMAGE_FORMAT_YV12 = 842094169;
    private volatile Bitmap zza;
    private volatile ByteBuffer zzb;
    private volatile zzb zzc;
    private final int zzd;
    private final int zze;
    private final int zzf;

    @ImageFormat
    private final int zzg;
    private final Matrix zzh;

    @Retention(RetentionPolicy.CLASS)
    public @interface ImageFormat {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InputImage(@NonNull Bitmap bitmap, int i10) {
        this.zza = (Bitmap) C8953m.m36047l(bitmap);
        this.zzd = bitmap.getWidth();
        this.zze = bitmap.getHeight();
        zza(i10);
        this.zzf = i10;
        this.zzg = -1;
        this.zzh = null;
    }

    @NonNull
    public static InputImage fromBitmap(@NonNull Bitmap bitmap, int i10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(bitmap, i10);
        zzc(-1, 1, jElapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i10);
        return inputImage;
    }

    @NonNull
    public static InputImage fromByteArray(@NonNull byte[] bArr, int i10, int i11, int i12, @ImageFormat int i13) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(ByteBuffer.wrap((byte[]) C8953m.m36047l(bArr)), i10, i11, i12, i13);
        zzc(i13, 2, jElapsedRealtime, i11, i10, bArr.length, i12);
        return inputImage;
    }

    @NonNull
    public static InputImage fromByteBuffer(@NonNull ByteBuffer byteBuffer, int i10, int i11, int i12, @ImageFormat int i13) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(byteBuffer, i10, i11, i12, i13);
        zzc(i13, 3, jElapsedRealtime, i11, i10, byteBuffer.limit(), i12);
        return inputImage;
    }

    @NonNull
    public static InputImage fromFilePath(@NonNull Context context, @NonNull Uri uri) throws IOException {
        C8953m.m36048m(context, "Please provide a valid Context");
        C8953m.m36048m(uri, "Please provide a valid imageUri");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap bitmapZza = ImageUtils.getInstance().zza(context.getContentResolver(), uri);
        InputImage inputImage = new InputImage(bitmapZza, 0);
        zzc(-1, 4, jElapsedRealtime, bitmapZza.getHeight(), bitmapZza.getWidth(), bitmapZza.getAllocationByteCount(), 0);
        return inputImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @NonNull
    public static InputImage fromMediaImage(@NonNull Image image, int i10) {
        return zzb(image, i10, null);
    }

    private static int zza(int i10) {
        boolean z10 = true;
        if (i10 != 0 && i10 != 90 && i10 != 180) {
            if (i10 == 270) {
                i10 = 270;
            } else {
                z10 = false;
            }
        }
        C8953m.m36037b(z10, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        return i10;
    }

    private static InputImage zzb(@NonNull Image image, int i10, Matrix matrix) {
        Image image2;
        int i11;
        int iLimit;
        InputImage inputImage;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C8953m.m36048m(image, "Please provide a valid image");
        zza(i10);
        boolean z10 = true;
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z10 = false;
        }
        C8953m.m36037b(z10, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            iLimit = image.getPlanes()[0].getBuffer().limit();
            image2 = image;
            i11 = i10;
            inputImage = new InputImage(ImageConvertUtils.getInstance().convertJpegToUpRightBitmap(image, i10), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            image2 = image;
            i11 = i10;
            InputImage inputImage2 = new InputImage(image2, image.getWidth(), image.getHeight(), i11, matrix);
            iLimit = (image2.getPlanes()[0].getBuffer().limit() * 3) / 2;
            inputImage = inputImage2;
        }
        zzc(image2.getFormat(), 5, jElapsedRealtime, image2.getHeight(), image2.getWidth(), iLimit, i11);
        return inputImage;
    }

    private static void zzc(int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        zzmu.zza(zzms.zzb("vision-common"), i10, i11, j10, i12, i13, i14, i15);
    }

    public Bitmap getBitmapInternal() {
        return this.zza;
    }

    public ByteBuffer getByteBuffer() {
        return this.zzb;
    }

    public Matrix getCoordinatesMatrix() {
        return this.zzh;
    }

    @ImageFormat
    public int getFormat() {
        return this.zzg;
    }

    public int getHeight() {
        return this.zze;
    }

    public Image getMediaImage() {
        if (this.zzc == null) {
            return null;
        }
        return this.zzc.zza();
    }

    public Image.Plane[] getPlanes() {
        if (this.zzc == null) {
            return null;
        }
        return this.zzc.zzb();
    }

    public int getRotationDegrees() {
        return this.zzf;
    }

    public int getWidth() {
        return this.zzd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @NonNull
    public static InputImage fromMediaImage(@NonNull Image image, int i10, @NonNull Matrix matrix) {
        C8953m.m36037b(image.getFormat() == 35, "Only YUV_420_888 is supported now");
        return zzb(image, i10, matrix);
    }

    private InputImage(@NonNull Image image, int i10, int i11, int i12, Matrix matrix) {
        C8953m.m36047l(image);
        this.zzc = new zzb(image);
        this.zzd = i10;
        this.zze = i11;
        zza(i12);
        this.zzf = i12;
        this.zzg = 35;
        this.zzh = matrix;
    }

    private InputImage(@NonNull ByteBuffer byteBuffer, int i10, int i11, int i12, @ImageFormat int i13) {
        boolean z10;
        if (i13 == 842094169) {
            z10 = true;
        } else if (i13 == 17) {
            i13 = 17;
            z10 = true;
        } else {
            z10 = false;
        }
        C8953m.m36036a(z10);
        this.zzb = (ByteBuffer) C8953m.m36047l(byteBuffer);
        C8953m.m36037b(byteBuffer.limit() > i10 * i11, "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.");
        byteBuffer.rewind();
        this.zzd = i10;
        this.zze = i11;
        zza(i12);
        this.zzf = i12;
        this.zzg = i13;
        this.zzh = null;
    }
}
