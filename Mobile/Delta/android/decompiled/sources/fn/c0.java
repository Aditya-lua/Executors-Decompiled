package fn;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import com.google.mlkit.vision.common.InputImage;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/camera/core/d;", "Lfn/z;", "f", "(Landroidx/camera/core/d;)Lfn/z;", "Landroid/media/Image;", "", "rotationDegrees", "e", "(Landroid/media/Image;I)Lfn/z;", "Landroid/graphics/Rect;", "cropRect", "Landroid/graphics/Bitmap;", "c", "(Landroid/media/Image;ILandroid/graphics/Rect;)Landroid/graphics/Bitmap;", "Ljava/nio/ByteBuffer;", "data", "Lfn/w;", "metadata", "a", "(Ljava/nio/ByteBuffer;Lfn/w;Landroid/graphics/Rect;)Landroid/graphics/Bitmap;", "bitmap", "b", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "camera_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c0 {

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0012\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u0018\u0010\u001b¨\u0006 "}, d2 = {"fn/c0$a", "Lfn/z;", "Landroid/graphics/Rect;", "cropRect", "Landroid/graphics/Bitmap;", "f", "(Landroid/graphics/Rect;)Landroid/graphics/Bitmap;", "Landroid/media/Image;", "a", "Landroid/media/Image;", "p", "()Landroid/media/Image;", "image", "Lcom/google/mlkit/vision/common/InputImage;", "b", "Ljt/h;", "g", "()Lcom/google/mlkit/vision/common/InputImage;", "inputImage", "c", "e", "()Landroid/graphics/Bitmap;", "bitmap", "", "d", "I", "getWidth", "()I", "width", "getHeight", "height", "rotationDegrees", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Image image;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final jt.h inputImage;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final jt.h bitmap;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final int width;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final int height;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final int rotationDegrees;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Image f16883g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f16884h;

        public a(final Image image, final int i10) {
            this.f16883g = image;
            this.f16884h = i10;
            this.image = image;
            this.inputImage = jt.i.b(new Function0() { // from class: fn.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c0.a.h(image, i10);
                }
            });
            this.bitmap = jt.i.b(new Function0() { // from class: fn.b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c0.a.c(image, i10);
                }
            });
            this.width = image.getWidth();
            this.height = image.getHeight();
            this.rotationDegrees = i10;
        }

        public static final Bitmap c(Image image, int i10) {
            return c0.d(image, i10, null, 2, null);
        }

        public static final InputImage h(Image image, int i10) {
            InputImage inputImageFromMediaImage = InputImage.fromMediaImage(image, i10);
            Intrinsics.checkNotNullExpressionValue(inputImageFromMediaImage, "fromMediaImage(...)");
            return inputImageFromMediaImage;
        }

        @Override // fn.z
        /* JADX INFO: renamed from: d, reason: from getter */
        public int getRotationDegrees() {
            return this.rotationDegrees;
        }

        @Override // fn.z
        public Bitmap e() {
            return (Bitmap) this.bitmap.getValue();
        }

        @Override // fn.z
        public Bitmap f(Rect cropRect) {
            Intrinsics.checkNotNullParameter(cropRect, "cropRect");
            return c0.c(this.f16883g, this.f16884h, cropRect);
        }

        @Override // fn.z
        public InputImage g() {
            return (InputImage) this.inputImage.getValue();
        }

        @Override // fn.z
        public int getHeight() {
            return this.height;
        }

        @Override // fn.z
        public int getWidth() {
            return this.width;
        }

        @Override // fn.z
        /* JADX INFO: renamed from: p, reason: from getter */
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
                ut.c.a(byteArrayOutputStream, null);
                if (rect != null) {
                    bitmapDecodeByteArray = Bitmap.createBitmap(bitmapDecodeByteArray, rect.left, rect.top, rect.width(), rect.height());
                }
                Intrinsics.checkNotNull(bitmapDecodeByteArray);
                return b(bitmapDecodeByteArray, frameMetadata.getRotation());
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ut.c.a(byteArrayOutputStream, th2);
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
        f fVar = f.f16890a;
        Image.Plane[] planes = image.getPlanes();
        if (planes == null) {
            return null;
        }
        return a(fVar.c(planes, image.getWidth(), image.getHeight()), frameMetadata, rect);
    }

    public static /* synthetic */ Bitmap d(Image image, int i10, Rect rect, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            rect = null;
        }
        return c(image, i10, rect);
    }

    @NotNull
    public static final z e(@NotNull Image image, int i10) {
        Intrinsics.checkNotNullParameter(image, "<this>");
        return new a(image, i10);
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    @Nullable
    public static final z f(@NotNull androidx.camera.core.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        try {
            Image imageP = dVar.p();
            if (imageP == null) {
                return null;
            }
            return e(imageP, dVar.H2().d());
        } catch (IllegalStateException | NullPointerException unused) {
            return null;
        }
    }
}
