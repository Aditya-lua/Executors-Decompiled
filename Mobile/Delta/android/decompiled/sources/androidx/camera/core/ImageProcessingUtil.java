package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import g0.i2;
import g0.r1;
import java.nio.ByteBuffer;
import java.util.Locale;
import n0.j2;
import x2.g;

/* JADX INFO: loaded from: classes.dex */
public final class ImageProcessingUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f1349a;

    public static class a extends androidx.camera.core.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d.a[] f1350d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f1351e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f1352f;

        /* JADX INFO: renamed from: androidx.camera.core.ImageProcessingUtil$a$a, reason: collision with other inner class name */
        public class C0018a implements d.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f1353a;
            public final /* synthetic */ ByteBuffer b;

            public C0018a(int i10, ByteBuffer byteBuffer) {
                this.f1353a = i10;
                this.b = byteBuffer;
            }

            @Override // androidx.camera.core.d.a
            public ByteBuffer k() {
                return this.b;
            }

            @Override // androidx.camera.core.d.a
            public int l() {
                return this.f1353a;
            }

            @Override // androidx.camera.core.d.a
            public int m() {
                return 1;
            }
        }

        public a(d dVar, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10, int i11, int i12) {
            super(dVar);
            this.f1350d = c(byteBuffer, byteBuffer2, byteBuffer3, i10);
            this.f1351e = i10;
            this.f1352f = i11;
        }

        @Override // androidx.camera.core.b, androidx.camera.core.d
        public d.a[] H1() {
            return this.f1350d;
        }

        public final d.a[] c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
            return new d.a[]{new C0018a(i10, byteBuffer), new b(byteBuffer2, i10), new b(byteBuffer3, i10)};
        }

        @Override // androidx.camera.core.b, androidx.camera.core.d
        public int getHeight() {
            return this.f1352f;
        }

        @Override // androidx.camera.core.b, androidx.camera.core.d
        public int getWidth() {
            return this.f1351e;
        }
    }

    public static class b implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f1355a;
        public final int b;

        public b(ByteBuffer byteBuffer, int i10) {
            this.f1355a = byteBuffer;
            this.b = i10;
        }

        @Override // androidx.camera.core.d.a
        public ByteBuffer k() {
            return this.f1355a;
        }

        @Override // androidx.camera.core.d.a
        public int l() {
            return this.b;
        }

        @Override // androidx.camera.core.d.a
        public int m() {
            return 2;
        }
    }

    public enum c {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static /* synthetic */ void a(d dVar, d dVar2, d dVar3) {
        if (dVar == null || dVar2 == null) {
            return;
        }
        dVar2.close();
    }

    public static /* synthetic */ void b(d dVar, d dVar2, d dVar3) {
        if (dVar == null || dVar2 == null) {
            return;
        }
        dVar2.close();
    }

    public static boolean c(d dVar) {
        if (!m(dVar)) {
            r1.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return false;
        }
        if (d(dVar) != c.ERROR_CONVERSION) {
            return true;
        }
        r1.c("ImageProcessingUtil", "One pixel shift for YUV failure");
        return false;
    }

    public static c d(d dVar) {
        int width = dVar.getWidth();
        int height = dVar.getHeight();
        int iL = dVar.H1()[0].l();
        int iL2 = dVar.H1()[1].l();
        int iL3 = dVar.H1()[2].l();
        int iM = dVar.H1()[0].m();
        int iM2 = dVar.H1()[1].m();
        return nativeShiftPixel(dVar.H1()[0].k(), iL, dVar.H1()[1].k(), iL2, dVar.H1()[2].k(), iL3, iM, iM2, width, height, iM, iM2, iM2) != 0 ? c.ERROR_CONVERSION : c.SUCCESS;
    }

    public static d e(j2 j2Var, byte[] bArr) {
        g.a(j2Var.c() == 256);
        g.g(bArr);
        Surface surface = j2Var.getSurface();
        g.g(surface);
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            r1.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        d dVarB = j2Var.b();
        if (dVarB == null) {
            r1.c("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return dVarB;
    }

    public static Bitmap f(d dVar) {
        if (dVar.getFormat() != 35) {
            throw new IllegalArgumentException("Input image format must be YUV_420_888");
        }
        int width = dVar.getWidth();
        int height = dVar.getHeight();
        int iL = dVar.H1()[0].l();
        int iL2 = dVar.H1()[1].l();
        int iL3 = dVar.H1()[2].l();
        int iM = dVar.H1()[0].m();
        int iM2 = dVar.H1()[1].m();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dVar.getWidth(), dVar.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(dVar.H1()[0].k(), iL, dVar.H1()[1].k(), iL2, dVar.H1()[2].k(), iL3, iM, iM2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), width, height) == 0) {
            return bitmapCreateBitmap;
        }
        throw new UnsupportedOperationException("YUV to RGB conversion failed");
    }

    public static d g(final d dVar, j2 j2Var, ByteBuffer byteBuffer, int i10, boolean z10) {
        if (!m(dVar)) {
            r1.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!l(i10)) {
            r1.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if (h(dVar, j2Var.getSurface(), byteBuffer, i10, z10) == c.ERROR_CONVERSION) {
            r1.c("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            r1.a("ImageProcessingUtil", String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), Integer.valueOf(f1349a)));
            f1349a++;
        }
        final d dVarB = j2Var.b();
        if (dVarB == null) {
            r1.c("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        i2 i2Var = new i2(dVarB);
        i2Var.a(new androidx.camera.core.b.a() { // from class: g0.j1
            @Override // androidx.camera.core.b.a
            public final void a(androidx.camera.core.d dVar2) {
                ImageProcessingUtil.b(dVarB, dVar, dVar2);
            }
        });
        return i2Var;
    }

    public static c h(d dVar, Surface surface, ByteBuffer byteBuffer, int i10, boolean z10) {
        int width = dVar.getWidth();
        int height = dVar.getHeight();
        int iL = dVar.H1()[0].l();
        int iL2 = dVar.H1()[1].l();
        int iL3 = dVar.H1()[2].l();
        int iM = dVar.H1()[0].m();
        int iM2 = dVar.H1()[1].m();
        return nativeConvertAndroid420ToABGR(dVar.H1()[0].k(), iL, dVar.H1()[1].k(), iL2, dVar.H1()[2].k(), iL3, iM, iM2, surface, byteBuffer, width, height, z10 ? iM : 0, z10 ? iM2 : 0, z10 ? iM2 : 0, i10) != 0 ? c.ERROR_CONVERSION : c.SUCCESS;
    }

    public static void i(Bitmap bitmap, ByteBuffer byteBuffer, int i10) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i10, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void j(Bitmap bitmap, ByteBuffer byteBuffer, int i10) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i10, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean k(d dVar) {
        return dVar.H1().length == 3 && dVar.H1()[1].m() == 2 && nativeGetYUVImageVUOff(dVar.H1()[2].k(), dVar.H1()[1].k()) == -1;
    }

    public static boolean l(int i10) {
        return i10 == 0 || i10 == 90 || i10 == 180 || i10 == 270;
    }

    public static boolean m(d dVar) {
        return dVar.getFormat() == 35 && dVar.H1().length == 3;
    }

    public static d n(d dVar, j2 j2Var, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        final d dVar2;
        c cVarP;
        if (!m(dVar)) {
            r1.c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!l(i10)) {
            r1.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        c cVar = c.ERROR_CONVERSION;
        if (i10 > 0) {
            dVar2 = dVar;
            cVarP = p(dVar2, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i10);
        } else {
            dVar2 = dVar;
            cVarP = cVar;
        }
        if (cVarP == cVar) {
            r1.c("ImageProcessingUtil", "rotate YUV failure");
            return null;
        }
        final d dVarB = j2Var.b();
        if (dVarB == null) {
            r1.c("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
            return null;
        }
        i2 i2Var = new i2(dVarB);
        i2Var.a(new androidx.camera.core.b.a() { // from class: g0.k1
            @Override // androidx.camera.core.b.a
            public final void a(androidx.camera.core.d dVar3) {
                ImageProcessingUtil.a(dVarB, dVar2, dVar3);
            }
        });
        return i2Var;
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, Surface surface, ByteBuffer byteBuffer4, int i15, int i16, int i17, int i18, int i19, int i20);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, Bitmap bitmap, int i15, int i16, int i17);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, boolean z10);

    public static native int nativeGetYUVImageVUOff(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public static native ByteBuffer nativeNewDirectByteBuffer(ByteBuffer byteBuffer, int i10, int i11);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, ByteBuffer byteBuffer4, int i14, int i15, ByteBuffer byteBuffer5, int i16, int i17, ByteBuffer byteBuffer6, int i18, int i19, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i20, int i21, int i22);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);

    public static d o(d dVar, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i10) {
        if (!m(dVar)) {
            r1.c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!l(i10)) {
            r1.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        if (i10 == 0 && k(dVar)) {
            return null;
        }
        int i11 = i10 % 180;
        int width = i11 == 0 ? dVar.getWidth() : dVar.getHeight();
        int height = i11 == 0 ? dVar.getHeight() : dVar.getWidth();
        ByteBuffer byteBufferNativeNewDirectByteBuffer = nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
        int i12 = height;
        if (nativeRotateYUV(dVar.H1()[0].k(), dVar.H1()[0].l(), dVar.H1()[1].k(), dVar.H1()[1].l(), dVar.H1()[2].k(), dVar.H1()[2].l(), dVar.H1()[2].m(), byteBuffer4, width, 1, byteBufferNativeNewDirectByteBuffer, width, 2, byteBuffer5, width, 2, byteBuffer, byteBuffer2, byteBuffer3, dVar.getWidth(), dVar.getHeight(), i10) == 0) {
            return new i2(new a(dVar, byteBuffer4, byteBufferNativeNewDirectByteBuffer, byteBuffer5, width, i12, i10));
        }
        r1.c("ImageProcessingUtil", "rotate YUV failure");
        return null;
    }

    public static c p(d dVar, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        int width = dVar.getWidth();
        int height = dVar.getHeight();
        int iL = dVar.H1()[0].l();
        int iL2 = dVar.H1()[1].l();
        int iL3 = dVar.H1()[2].l();
        int iM = dVar.H1()[1].m();
        Image imageB = t0.a.b(imageWriter);
        if (imageB != null && nativeRotateYUV(dVar.H1()[0].k(), iL, dVar.H1()[1].k(), iL2, dVar.H1()[2].k(), iL3, iM, imageB.getPlanes()[0].getBuffer(), imageB.getPlanes()[0].getRowStride(), imageB.getPlanes()[0].getPixelStride(), imageB.getPlanes()[1].getBuffer(), imageB.getPlanes()[1].getRowStride(), imageB.getPlanes()[1].getPixelStride(), imageB.getPlanes()[2].getBuffer(), imageB.getPlanes()[2].getRowStride(), imageB.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i10) == 0) {
            t0.a.d(imageWriter, imageB);
            return c.SUCCESS;
        }
        return c.ERROR_CONVERSION;
    }

    public static boolean q(Surface surface, byte[] bArr) {
        g.g(bArr);
        g.g(surface);
        if (nativeWriteJpegToSurface(bArr, surface) == 0) {
            return true;
        }
        r1.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        return false;
    }
}
