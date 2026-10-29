package p503w0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.InterfaceC0494d;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import p140g0.C5931r1;
import p347p0.C10093i;
import p347p0.C10094j;
import p533x2.C12637g;

/* JADX INFO: renamed from: w0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C12272b {

    /* JADX INFO: renamed from: w0.b$a */
    public static final class a extends Exception {

        /* JADX INFO: renamed from: a */
        public final EnumC14275a f43475a;

        /* JADX INFO: renamed from: w0.b$a$a, reason: collision with other inner class name */
        public enum EnumC14275a {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        public a(String str, EnumC14275a enumC14275a) {
            super(str);
            this.f43475a = enumC14275a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Rect m45552a(Size size, Rational rational) {
        int i10;
        if (!m45560i(rational)) {
            C5931r1.m26572l("ImageUtil", "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f10 = width;
        float f11 = height;
        float f12 = f10 / f11;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i11 = 0;
        if (rational.floatValue() > f12) {
            int iRound = Math.round((f10 / numerator) * denominator);
            i10 = (height - iRound) / 2;
            height = iRound;
        } else {
            int iRound2 = Math.round((f11 / denominator) * numerator);
            int i12 = (width - iRound2) / 2;
            width = iRound2;
            i10 = 0;
            i11 = i12;
        }
        return new Rect(i11, i10, width + i11, height + i10);
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m45553b(InterfaceC0494d interfaceC0494d) {
        int format = interfaceC0494d.getFormat();
        if (format == 1) {
            return m45556e(interfaceC0494d);
        }
        if (format == 35) {
            return ImageProcessingUtil.m2174f(interfaceC0494d);
        }
        if (format == 256 || format == 4101) {
            return m45554c(interfaceC0494d);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC0494d.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m45554c(InterfaceC0494d interfaceC0494d) {
        byte[] bArrM45563l = m45563l(interfaceC0494d);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM45563l, 0, bArrM45563l.length, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    /* JADX INFO: renamed from: d */
    public static Bitmap m45555d(InterfaceC0494d.a[] aVarArr, int i10, int i11) {
        C12637g.m47070b(aVarArr.length == 1, "Expect a single plane");
        C12637g.m47070b(aVarArr[0].mo2190m() == 4, "Expect pixelStride=4");
        C12637g.m47070b(aVarArr[0].mo2189l() == i10 * 4, "Expect rowStride=width*4");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        aVarArr[0].mo2188k().rewind();
        ImageProcessingUtil.m2178j(bitmapCreateBitmap, aVarArr[0].mo2188k(), aVarArr[0].mo2189l());
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: e */
    public static Bitmap m45556e(InterfaceC0494d interfaceC0494d) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(interfaceC0494d.getWidth(), interfaceC0494d.getHeight(), Bitmap.Config.ARGB_8888);
        interfaceC0494d.mo2186H1()[0].mo2188k().rewind();
        ImageProcessingUtil.m2178j(bitmapCreateBitmap, interfaceC0494d.mo2186H1()[0].mo2188k(), interfaceC0494d.mo2186H1()[0].mo2189l());
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: f */
    public static ByteBuffer m45557f(Bitmap bitmap) {
        C12637g.m47070b(bitmap.getConfig() == Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.m2177i(bitmap, byteBufferAllocateDirect, bitmap.getRowBytes());
        byteBufferAllocateDirect.rewind();
        return byteBufferAllocateDirect;
    }

    /* JADX INFO: renamed from: g */
    public static Rational m45558g(int i10, Rational rational) {
        return (i10 == 90 || i10 == 270) ? m45559h(rational) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    /* JADX INFO: renamed from: h */
    public static Rational m45559h(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    /* JADX INFO: renamed from: i */
    public static boolean m45560i(Rational rational) {
        return (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m45561j(int i10) {
        return i10 == 256 || i10 == 4101;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m45562k(int i10) {
        return i10 == 32;
    }

    /* JADX INFO: renamed from: l */
    public static byte[] m45563l(InterfaceC0494d interfaceC0494d) {
        if (!m45561j(interfaceC0494d.getFormat())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC0494d.getFormat());
        }
        ByteBuffer byteBufferMo2188k = interfaceC0494d.mo2186H1()[0].mo2188k();
        byte[] bArr = new byte[byteBufferMo2188k.capacity()];
        byteBufferMo2188k.rewind();
        byteBufferMo2188k.get(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: m */
    public static Bitmap m45564m(Bitmap bitmap, int i10) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* JADX INFO: renamed from: n */
    public static byte[] m45565n(InterfaceC0494d interfaceC0494d, Rect rect, int i10, int i11) throws a {
        if (interfaceC0494d.getFormat() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC0494d.getFormat());
        }
        YuvImage yuvImage = new YuvImage(m45566o(interfaceC0494d), 17, interfaceC0494d.getWidth(), interfaceC0494d.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C10094j c10094j = new C10094j(byteArrayOutputStream, C10093i.m38963c(interfaceC0494d, i11));
        if (rect == null) {
            rect = new Rect(0, 0, interfaceC0494d.getWidth(), interfaceC0494d.getHeight());
        }
        if (yuvImage.compressToJpeg(rect, i10, c10094j)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new a("YuvImage failed to encode jpeg.", a.EnumC14275a.ENCODE_FAILED);
    }

    /* JADX INFO: renamed from: o */
    public static byte[] m45566o(InterfaceC0494d interfaceC0494d) {
        InterfaceC0494d.a aVar = interfaceC0494d.mo2186H1()[0];
        InterfaceC0494d.a aVar2 = interfaceC0494d.mo2186H1()[1];
        InterfaceC0494d.a aVar3 = interfaceC0494d.mo2186H1()[2];
        ByteBuffer byteBufferMo2188k = aVar.mo2188k();
        ByteBuffer byteBufferMo2188k2 = aVar2.mo2188k();
        ByteBuffer byteBufferMo2188k3 = aVar3.mo2188k();
        byteBufferMo2188k.rewind();
        byteBufferMo2188k2.rewind();
        byteBufferMo2188k3.rewind();
        int iRemaining = byteBufferMo2188k.remaining();
        byte[] bArr = new byte[((interfaceC0494d.getWidth() * interfaceC0494d.getHeight()) / 2) + iRemaining];
        int width = 0;
        for (int i10 = 0; i10 < interfaceC0494d.getHeight(); i10++) {
            byteBufferMo2188k.get(bArr, width, interfaceC0494d.getWidth());
            width += interfaceC0494d.getWidth();
            byteBufferMo2188k.position(Math.min(iRemaining, (byteBufferMo2188k.position() - interfaceC0494d.getWidth()) + aVar.mo2189l()));
        }
        int height = interfaceC0494d.getHeight() / 2;
        int width2 = interfaceC0494d.getWidth() / 2;
        int iMo2189l = aVar3.mo2189l();
        int iMo2189l2 = aVar2.mo2189l();
        int iMo2190m = aVar3.mo2190m();
        int iMo2190m2 = aVar2.mo2190m();
        byte[] bArr2 = new byte[iMo2189l];
        byte[] bArr3 = new byte[iMo2189l2];
        for (int i11 = 0; i11 < height; i11++) {
            byteBufferMo2188k3.get(bArr2, 0, Math.min(iMo2189l, byteBufferMo2188k3.remaining()));
            byteBufferMo2188k2.get(bArr3, 0, Math.min(iMo2189l2, byteBufferMo2188k2.remaining()));
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < width2; i14++) {
                int i15 = width + 1;
                bArr[width] = bArr2[i12];
                width += 2;
                bArr[i15] = bArr3[i13];
                i12 += iMo2190m;
                i13 += iMo2190m2;
            }
        }
        return bArr;
    }
}
