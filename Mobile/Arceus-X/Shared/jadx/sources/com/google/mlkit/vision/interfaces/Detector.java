package com.google.mlkit.vision.interfaces;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.p616lifecycle.InterfaceC0978r;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface Detector<DetectionResultT> extends Closeable, InterfaceC0978r {
    public static final int TYPE_BARCODE_SCANNING = 1;
    public static final int TYPE_DOCUMENT_DETECTION = 10;
    public static final int TYPE_FACE_DETECTION = 2;
    public static final int TYPE_IMAGE_CAPTIONING = 9;
    public static final int TYPE_IMAGE_LABELING = 3;
    public static final int TYPE_OBJECT_DETECTION = 5;
    public static final int TYPE_POSE_DETECTION = 6;
    public static final int TYPE_SEGMENTATION = 7;
    public static final int TYPE_SELFIE_FACE_DETECTION = 8;
    public static final int TYPE_SUBJECT_SEGMENTATION = 11;
    public static final int TYPE_TEXT_RECOGNITION = 4;

    @Retention(RetentionPolicy.CLASS)
    public @interface DetectorType {
    }

    @DetectorType
    int getDetectorType();

    @NonNull
    Task<DetectionResultT> process(@NonNull Bitmap bitmap, int i10);

    @NonNull
    Task<DetectionResultT> process(@NonNull Image image, int i10);

    @NonNull
    Task<DetectionResultT> process(@NonNull Image image, int i10, @NonNull Matrix matrix);

    @NonNull
    Task<DetectionResultT> process(@NonNull ByteBuffer byteBuffer, int i10, int i11, int i12, int i13);
}
