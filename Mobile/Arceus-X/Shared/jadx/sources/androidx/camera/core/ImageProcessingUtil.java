package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.InterfaceC0494d;
import java.nio.ByteBuffer;
import java.util.Locale;
import p140g0.C5896i2;
import p140g0.C5931r1;
import p296n0.InterfaceC8775j2;
import p437t0.C11465a;
import p533x2.C12637g;

/* JADX INFO: loaded from: classes.dex */
public final class ImageProcessingUtil {

    /* JADX INFO: renamed from: a */
    public static int f1763a;

    /* JADX INFO: renamed from: androidx.camera.core.ImageProcessingUtil$a */
    public static class C0488a extends AbstractC0492b {

        /* JADX INFO: renamed from: d */
        public final InterfaceC0494d.a[] f1764d;

        /* JADX INFO: renamed from: e */
        public final int f1765e;

        /* JADX INFO: renamed from: f */
        public final int f1766f;

        /* JADX INFO: renamed from: androidx.camera.core.ImageProcessingUtil$a$a */
        public class a implements InterfaceC0494d.a {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f1767a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ByteBuffer f1768b;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public a(int i10, ByteBuffer byteBuffer) {
                this.f1767a = i10;
                this.f1768b = byteBuffer;
            }

            @Override // androidx.camera.core.InterfaceC0494d.a
            /* JADX INFO: renamed from: k */
            public ByteBuffer mo2188k() {
                return this.f1768b;
            }

            @Override // androidx.camera.core.InterfaceC0494d.a
            /* JADX INFO: renamed from: l */
            public int mo2189l() {
                return this.f1767a;
            }

            @Override // androidx.camera.core.InterfaceC0494d.a
            /* JADX INFO: renamed from: m */
            public int mo2190m() {
                return 1;
            }
        }

        public C0488a(InterfaceC0494d interfaceC0494d, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10, int i11, int i12) {
            super(interfaceC0494d);
            this.f1764d = m2187c(byteBuffer, byteBuffer2, byteBuffer3, i10);
            this.f1765e = i10;
            this.f1766f = i11;
        }

        @Override // androidx.camera.core.AbstractC0492b, androidx.camera.core.InterfaceC0494d
        /* JADX INFO: renamed from: H1 */
        public InterfaceC0494d.a[] mo2186H1() {
            return this.f1764d;
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC0494d.a[] m2187c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
            return new InterfaceC0494d.a[]{new a(i10, byteBuffer), new C0489b(byteBuffer2, i10), new C0489b(byteBuffer3, i10)};
        }

        @Override // androidx.camera.core.AbstractC0492b, androidx.camera.core.InterfaceC0494d
        public int getHeight() {
            return this.f1766f;
        }

        @Override // androidx.camera.core.AbstractC0492b, androidx.camera.core.InterfaceC0494d
        public int getWidth() {
            return this.f1765e;
        }
    }

    /* JADX INFO: renamed from: androidx.camera.core.ImageProcessingUtil$b */
    public static class C0489b implements InterfaceC0494d.a {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f1770a;

        /* JADX INFO: renamed from: b */
        public final int f1771b;

        public C0489b(ByteBuffer byteBuffer, int i10) {
            this.f1770a = byteBuffer;
            this.f1771b = i10;
        }

        @Override // androidx.camera.core.InterfaceC0494d.a
        /* JADX INFO: renamed from: k */
        public ByteBuffer mo2188k() {
            return this.f1770a;
        }

        @Override // androidx.camera.core.InterfaceC0494d.a
        /* JADX INFO: renamed from: l */
        public int mo2189l() {
            return this.f1771b;
        }

        @Override // androidx.camera.core.InterfaceC0494d.a
        /* JADX INFO: renamed from: m */
        public int mo2190m() {
            return 2;
        }
    }

    /* JADX INFO: renamed from: androidx.camera.core.ImageProcessingUtil$c */
    public enum EnumC0490c {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2169a(InterfaceC0494d interfaceC0494d, InterfaceC0494d interfaceC0494d2, InterfaceC0494d interfaceC0494d3) {
        if (interfaceC0494d == null || interfaceC0494d2 == null) {
            return;
        }
        interfaceC0494d2.close();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2170b(InterfaceC0494d interfaceC0494d, InterfaceC0494d interfaceC0494d2, InterfaceC0494d interfaceC0494d3) {
        if (interfaceC0494d == null || interfaceC0494d2 == null) {
            return;
        }
        interfaceC0494d2.close();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2171c(InterfaceC0494d interfaceC0494d) {
        if (!m2181m(interfaceC0494d)) {
            C5931r1.m26563c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return false;
        }
        if (m2172d(interfaceC0494d) != EnumC0490c.ERROR_CONVERSION) {
            return true;
        }
        C5931r1.m26563c("ImageProcessingUtil", "One pixel shift for YUV failure");
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static EnumC0490c m2172d(InterfaceC0494d interfaceC0494d) {
        int width = interfaceC0494d.getWidth();
        int height = interfaceC0494d.getHeight();
        int iMo2189l = interfaceC0494d.mo2186H1()[0].mo2189l();
        int iMo2189l2 = interfaceC0494d.mo2186H1()[1].mo2189l();
        int iMo2189l3 = interfaceC0494d.mo2186H1()[2].mo2189l();
        int iMo2190m = interfaceC0494d.mo2186H1()[0].mo2190m();
        int iMo2190m2 = interfaceC0494d.mo2186H1()[1].mo2190m();
        return nativeShiftPixel(interfaceC0494d.mo2186H1()[0].mo2188k(), iMo2189l, interfaceC0494d.mo2186H1()[1].mo2188k(), iMo2189l2, interfaceC0494d.mo2186H1()[2].mo2188k(), iMo2189l3, iMo2190m, iMo2190m2, width, height, iMo2190m, iMo2190m2, iMo2190m2) != 0 ? EnumC0490c.ERROR_CONVERSION : EnumC0490c.SUCCESS;
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC0494d m2173e(InterfaceC8775j2 interfaceC8775j2, byte[] bArr) {
        C12637g.m47069a(interfaceC8775j2.mo2209c() == 256);
        C12637g.m47075g(bArr);
        Surface surface = interfaceC8775j2.getSurface();
        C12637g.m47075g(surface);
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            C5931r1.m26563c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        InterfaceC0494d interfaceC0494dMo2208b = interfaceC8775j2.mo2208b();
        if (interfaceC0494dMo2208b == null) {
            C5931r1.m26563c("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return interfaceC0494dMo2208b;
    }

    /* JADX INFO: renamed from: f */
    public static Bitmap m2174f(InterfaceC0494d interfaceC0494d) {
        if (interfaceC0494d.getFormat() != 35) {
            throw new IllegalArgumentException("Input image format must be YUV_420_888");
        }
        int width = interfaceC0494d.getWidth();
        int height = interfaceC0494d.getHeight();
        int iMo2189l = interfaceC0494d.mo2186H1()[0].mo2189l();
        int iMo2189l2 = interfaceC0494d.mo2186H1()[1].mo2189l();
        int iMo2189l3 = interfaceC0494d.mo2186H1()[2].mo2189l();
        int iMo2190m = interfaceC0494d.mo2186H1()[0].mo2190m();
        int iMo2190m2 = interfaceC0494d.mo2186H1()[1].mo2190m();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(interfaceC0494d.getWidth(), interfaceC0494d.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(interfaceC0494d.mo2186H1()[0].mo2188k(), iMo2189l, interfaceC0494d.mo2186H1()[1].mo2188k(), iMo2189l2, interfaceC0494d.mo2186H1()[2].mo2188k(), iMo2189l3, iMo2190m, iMo2190m2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), width, height) == 0) {
            return bitmapCreateBitmap;
        }
        throw new UnsupportedOperationException("YUV to RGB conversion failed");
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC0494d m2175g(final InterfaceC0494d interfaceC0494d, InterfaceC8775j2 interfaceC8775j2, ByteBuffer byteBuffer, int i10, boolean z10) {
        if (!m2181m(interfaceC0494d)) {
            C5931r1.m26563c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!m2180l(i10)) {
            C5931r1.m26563c("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if (m2176h(interfaceC0494d, interfaceC8775j2.getSurface(), byteBuffer, i10, z10) == EnumC0490c.ERROR_CONVERSION) {
            C5931r1.m26563c("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            C5931r1.m26561a("ImageProcessingUtil", String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), Integer.valueOf(f1763a)));
            f1763a++;
        }
        final InterfaceC0494d interfaceC0494dMo2208b = interfaceC8775j2.mo2208b();
        if (interfaceC0494dMo2208b == null) {
            C5931r1.m26563c("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        C5896i2 c5896i2 = new C5896i2(interfaceC0494dMo2208b);
        c5896i2.m2195a(new AbstractC0492b.a() { // from class: g0.j1
            @Override // androidx.camera.core.AbstractC0492b.a
            /* JADX INFO: renamed from: a */
            public final void mo2197a(InterfaceC0494d interfaceC0494d2) {
                ImageProcessingUtil.m2170b(interfaceC0494dMo2208b, interfaceC0494d, interfaceC0494d2);
            }
        });
        return c5896i2;
    }

    /* JADX INFO: renamed from: h */
    public static EnumC0490c m2176h(InterfaceC0494d interfaceC0494d, Surface surface, ByteBuffer byteBuffer, int i10, boolean z10) {
        int width = interfaceC0494d.getWidth();
        int height = interfaceC0494d.getHeight();
        int iMo2189l = interfaceC0494d.mo2186H1()[0].mo2189l();
        int iMo2189l2 = interfaceC0494d.mo2186H1()[1].mo2189l();
        int iMo2189l3 = interfaceC0494d.mo2186H1()[2].mo2189l();
        int iMo2190m = interfaceC0494d.mo2186H1()[0].mo2190m();
        int iMo2190m2 = interfaceC0494d.mo2186H1()[1].mo2190m();
        return nativeConvertAndroid420ToABGR(interfaceC0494d.mo2186H1()[0].mo2188k(), iMo2189l, interfaceC0494d.mo2186H1()[1].mo2188k(), iMo2189l2, interfaceC0494d.mo2186H1()[2].mo2188k(), iMo2189l3, iMo2190m, iMo2190m2, surface, byteBuffer, width, height, z10 ? iMo2190m : 0, z10 ? iMo2190m2 : 0, z10 ? iMo2190m2 : 0, i10) != 0 ? EnumC0490c.ERROR_CONVERSION : EnumC0490c.SUCCESS;
    }

    /* JADX INFO: renamed from: i */
    public static void m2177i(Bitmap bitmap, ByteBuffer byteBuffer, int i10) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i10, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    /* JADX INFO: renamed from: j */
    public static void m2178j(Bitmap bitmap, ByteBuffer byteBuffer, int i10) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i10, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2179k(InterfaceC0494d interfaceC0494d) {
        return interfaceC0494d.mo2186H1().length == 3 && interfaceC0494d.mo2186H1()[1].mo2190m() == 2 && nativeGetYUVImageVUOff(interfaceC0494d.mo2186H1()[2].mo2188k(), interfaceC0494d.mo2186H1()[1].mo2188k()) == -1;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m2180l(int i10) {
        return i10 == 0 || i10 == 90 || i10 == 180 || i10 == 270;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m2181m(InterfaceC0494d interfaceC0494d) {
        return interfaceC0494d.getFormat() == 35 && interfaceC0494d.mo2186H1().length == 3;
    }

    /* JADX INFO: renamed from: n */
    public static InterfaceC0494d m2182n(InterfaceC0494d interfaceC0494d, InterfaceC8775j2 interfaceC8775j2, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        final InterfaceC0494d interfaceC0494d2;
        EnumC0490c enumC0490cM2184p;
        if (!m2181m(interfaceC0494d)) {
            C5931r1.m26563c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!m2180l(i10)) {
            C5931r1.m26563c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        EnumC0490c enumC0490c = EnumC0490c.ERROR_CONVERSION;
        if (i10 > 0) {
            interfaceC0494d2 = interfaceC0494d;
            enumC0490cM2184p = m2184p(interfaceC0494d2, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i10);
        } else {
            interfaceC0494d2 = interfaceC0494d;
            enumC0490cM2184p = enumC0490c;
        }
        if (enumC0490cM2184p == enumC0490c) {
            C5931r1.m26563c("ImageProcessingUtil", "rotate YUV failure");
            return null;
        }
        final InterfaceC0494d interfaceC0494dMo2208b = interfaceC8775j2.mo2208b();
        if (interfaceC0494dMo2208b == null) {
            C5931r1.m26563c("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
            return null;
        }
        C5896i2 c5896i2 = new C5896i2(interfaceC0494dMo2208b);
        c5896i2.m2195a(new AbstractC0492b.a() { // from class: g0.k1
            @Override // androidx.camera.core.AbstractC0492b.a
            /* JADX INFO: renamed from: a */
            public final void mo2197a(InterfaceC0494d interfaceC0494d3) {
                ImageProcessingUtil.m2169a(interfaceC0494dMo2208b, interfaceC0494d2, interfaceC0494d3);
            }
        });
        return c5896i2;
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, Surface surface, ByteBuffer byteBuffer4, int i15, int i16, int i17, int i18, int i19, int i20);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, Bitmap bitmap, int i15, int i16, int i17);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, boolean z10);

    public static native int nativeGetYUVImageVUOff(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public static native ByteBuffer nativeNewDirectByteBuffer(ByteBuffer byteBuffer, int i10, int i11);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, ByteBuffer byteBuffer4, int i14, int i15, ByteBuffer byteBuffer5, int i16, int i17, ByteBuffer byteBuffer6, int i18, int i19, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i20, int i21, int i22);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);

    /* JADX INFO: renamed from: o */
    public static InterfaceC0494d m2183o(InterfaceC0494d interfaceC0494d, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i10) {
        if (!m2181m(interfaceC0494d)) {
            C5931r1.m26563c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!m2180l(i10)) {
            C5931r1.m26563c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        if (i10 == 0 && m2179k(interfaceC0494d)) {
            return null;
        }
        int i11 = i10 % 180;
        int width = i11 == 0 ? interfaceC0494d.getWidth() : interfaceC0494d.getHeight();
        int height = i11 == 0 ? interfaceC0494d.getHeight() : interfaceC0494d.getWidth();
        ByteBuffer byteBufferNativeNewDirectByteBuffer = nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
        int i12 = height;
        if (nativeRotateYUV(interfaceC0494d.mo2186H1()[0].mo2188k(), interfaceC0494d.mo2186H1()[0].mo2189l(), interfaceC0494d.mo2186H1()[1].mo2188k(), interfaceC0494d.mo2186H1()[1].mo2189l(), interfaceC0494d.mo2186H1()[2].mo2188k(), interfaceC0494d.mo2186H1()[2].mo2189l(), interfaceC0494d.mo2186H1()[2].mo2190m(), byteBuffer4, width, 1, byteBufferNativeNewDirectByteBuffer, width, 2, byteBuffer5, width, 2, byteBuffer, byteBuffer2, byteBuffer3, interfaceC0494d.getWidth(), interfaceC0494d.getHeight(), i10) == 0) {
            return new C5896i2(new C0488a(interfaceC0494d, byteBuffer4, byteBufferNativeNewDirectByteBuffer, byteBuffer5, width, i12, i10));
        }
        C5931r1.m26563c("ImageProcessingUtil", "rotate YUV failure");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static EnumC0490c m2184p(InterfaceC0494d interfaceC0494d, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        int width = interfaceC0494d.getWidth();
        int height = interfaceC0494d.getHeight();
        int iMo2189l = interfaceC0494d.mo2186H1()[0].mo2189l();
        int iMo2189l2 = interfaceC0494d.mo2186H1()[1].mo2189l();
        int iMo2189l3 = interfaceC0494d.mo2186H1()[2].mo2189l();
        int iMo2190m = interfaceC0494d.mo2186H1()[1].mo2190m();
        Image imageM42940b = C11465a.m42940b(imageWriter);
        if (imageM42940b != null && nativeRotateYUV(interfaceC0494d.mo2186H1()[0].mo2188k(), iMo2189l, interfaceC0494d.mo2186H1()[1].mo2188k(), iMo2189l2, interfaceC0494d.mo2186H1()[2].mo2188k(), iMo2189l3, iMo2190m, imageM42940b.getPlanes()[0].getBuffer(), imageM42940b.getPlanes()[0].getRowStride(), imageM42940b.getPlanes()[0].getPixelStride(), imageM42940b.getPlanes()[1].getBuffer(), imageM42940b.getPlanes()[1].getRowStride(), imageM42940b.getPlanes()[1].getPixelStride(), imageM42940b.getPlanes()[2].getBuffer(), imageM42940b.getPlanes()[2].getRowStride(), imageM42940b.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i10) == 0) {
            C11465a.m42942d(imageWriter, imageM42940b);
            return EnumC0490c.SUCCESS;
        }
        return EnumC0490c.ERROR_CONVERSION;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m2185q(Surface surface, byte[] bArr) {
        C12637g.m47075g(bArr);
        C12637g.m47075g(surface);
        if (nativeWriteJpegToSurface(bArr, surface) == 0) {
            return true;
        }
        C5931r1.m26563c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        return false;
    }
}
