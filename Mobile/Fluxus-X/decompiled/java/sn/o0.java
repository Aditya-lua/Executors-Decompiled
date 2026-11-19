package sn;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.common.InputImage;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/camera/core/d;", "Lsn/l0;", "f", "(Landroidx/camera/core/d;)Lsn/l0;", "Landroid/media/Image;", BuildConfig.FLAVOR, "rotationDegrees", "e", "(Landroid/media/Image;I)Lsn/l0;", "Landroid/graphics/Rect;", "cropRect", "Landroid/graphics/Bitmap;", "c", "(Landroid/media/Image;ILandroid/graphics/Rect;)Landroid/graphics/Bitmap;", "Ljava/nio/ByteBuffer;", "data", "Lsn/g0;", "metadata", "a", "(Ljava/nio/ByteBuffer;Lsn/g0;Landroid/graphics/Rect;)Landroid/graphics/Bitmap;", "bitmap", "b", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "camera_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class o0 {

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\b\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u001f"}, d2 = {"sn/o0$a", "Lsn/l0;", "Landroid/graphics/Rect;", "cropRect", "Landroid/graphics/Bitmap;", "b", "(Landroid/graphics/Rect;)Landroid/graphics/Bitmap;", "Landroid/media/Image;", "a", "Landroid/media/Image;", "q", "()Landroid/media/Image;", "image", "Lcom/google/mlkit/vision/common/InputImage;", "Lzt/h;", "c", "()Lcom/google/mlkit/vision/common/InputImage;", "inputImage", "()Landroid/graphics/Bitmap;", "bitmap", BuildConfig.FLAVOR, "d", "I", "getWidth", "()I", "width", "e", "getHeight", "height", "f", "rotationDegrees", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Image image;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final zt.h inputImage;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final zt.h bitmap;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final int width;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final int height;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final int rotationDegrees;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Image f31662g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f31663h;

        public a(final Image image, final int i10) {
            this.f31662g = image;
            this.f31663h = i10;
            this.image = image;
            this.inputImage = zt.i.a(new Function0() { // from class: sn.m0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o0.a.h(image, i10);
                }
            });
            this.bitmap = zt.i.a(new Function0() { // from class: sn.n0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o0.a.g(image, i10);
                }
            });
            this.width = image.getWidth();
            this.height = image.getHeight();
            this.rotationDegrees = i10;
        }

        public static final Bitmap g(Image image, int i10) {
            return o0.d(image, i10, null, 2, null);
        }

        public static final InputImage h(Image image, int i10) {
            InputImage inputImageFromMediaImage = InputImage.fromMediaImage(image, i10);
            Intrinsics.checkNotNullExpressionValue(inputImageFromMediaImage, "fromMediaImage(...)");
            return inputImageFromMediaImage;
        }

        @Override // sn.l0
        public Bitmap a() {
            return (Bitmap) this.bitmap.getValue();
        }

        @Override // sn.l0
        public Bitmap b(Rect cropRect) {
            Intrinsics.checkNotNullParameter(cropRect, "cropRect");
            return o0.c(this.f31662g, this.f31663h, cropRect);
        }

        @Override // sn.l0
        public InputImage c() {
            return (InputImage) this.inputImage.getValue();
        }

        @Override // sn.l0
        /* JADX INFO: renamed from: d, reason: from getter */
        public int getRotationDegrees() {
            return this.rotationDegrees;
        }

        @Override // sn.l0
        public int getHeight() {
            return this.height;
        }

        @Override // sn.l0
        public int getWidth() {
            return this.width;
        }

        @Override // sn.l0
        /* JADX INFO: renamed from: q, reason: from getter */
        public Image getImage() {
            return this.image;
        }
    }

    public static final Bitmap a(ByteBuffer byteBuffer, FrameMetadata frameMetadata, Rect rect) {
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        byte[] bArr = new byte[iLimit];
        byteBuffer.get(bArr, 0, iLimit);
        try {
            YuvImage yuvImage = new YuvImage(bArr, 17, frameMetadata.getWidth(), frameMetadata.getHeight(), null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, frameMetadata.getWidth(), frameMetadata.getHeight()), 80, byteArrayOutputStream);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                lu.c.a(byteArrayOutputStream, null);
                if (rect != null) {
                    bitmapDecodeByteArray = Bitmap.createBitmap(bitmapDecodeByteArray, rect.left, rect.top, rect.width(), rect.height());
                }
                Intrinsics.checkNotNull(bitmapDecodeByteArray);
                return b(bitmapDecodeByteArray, frameMetadata.getRotation());
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    lu.c.a(byteArrayOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Bitmap b(Bitmap bitmap, int i10) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        if (!Intrinsics.c(bitmapCreateBitmap, bitmap)) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    @Nullable
    public static final Bitmap c(@NotNull Image image, int i10, @Nullable Rect rect) {
        Intrinsics.checkNotNullParameter(image, "<this>");
        FrameMetadata frameMetadata = new FrameMetadata(image.getWidth(), image.getHeight(), i10);
        h hVar = h.f31608a;
        Image.Plane[] planes = image.getPlanes();
        if (planes == null) {
            return null;
        }
        return a(hVar.c(planes, image.getWidth(), image.getHeight()), frameMetadata, rect);
    }

    public static /* synthetic */ Bitmap d(Image image, int i10, Rect rect, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            rect = null;
        }
        return c(image, i10, rect);
    }

    @NotNull
    public static final l0 e(@NotNull Image image, int i10) {
        Intrinsics.checkNotNullParameter(image, "<this>");
        return new a(image, i10);
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    @Nullable
    public static final l0 f(@NotNull androidx.camera.core.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        try {
            Image imageQ = dVar.q();
            if (imageQ == null) {
                return null;
            }
            return e(imageQ, dVar.L2().d());
        } catch (IllegalStateException | NullPointerException unused) {
            return null;
        }
    }
}
